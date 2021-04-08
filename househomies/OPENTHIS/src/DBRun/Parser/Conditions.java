package DBRun.Parser;
import DBRun.DBException;
import DBRun.Controller;
import DBRun.RelationalDataTable;
//import DBRun.SDEnum;

import java.util.*;

// Values and operators are added as they are encountered when parsing
// user input (in the parser class)
// These conditions are then evaluated for each row in a table when called from the DBRun.DBMS class
public class Conditions {
    private final List<String> operative;
    private final List<String> data;
    private final Stack<Boolean> bool;
    private Stack<String> joins;
    private RelationalDataTable selectedTable;

    public Conditions() {
        operative = new LinkedList<>();
        data = new LinkedList<>();
        bool = new Stack<>();
    }

    // Method takes in current table, returns new table with user conditions applied
    // If command modifier == SELECT, add all matching rows to return table
    // If command modifier == DELETE, only add rows which don't match to return table (effectively
    // deleting them)
    public RelationalDataTable conditionsUser(RelationalDataTable createdTable, int editTable) {
        selectedTable = createdTable;
        RelationalDataTable createTable = new RelationalDataTable();
        // Iterate through all rows
        for (int i = 0; i < selectedTable.returnRowElementsInTableCount(); i++) {
            List<String> rowRecord = selectedTable.returnRowElementsFromTable(i, Collections.emptyList());
            if (editTable == Controller.SELECT) {
                if (rowElementChecker(rowRecord) == true) {
                    createTable.addRowElementsToTable(rowRecord);
                }
            }
            if (editTable == Controller.DELETE) {
                if (rowElementChecker(rowRecord) == false) {
                    createTable.addRowElementsToTable(rowRecord);
                }
            }
        }
        return createTable;
    }

    // Evaluates each row by:
    // --- checking each condition already stored (in order) in values & operators lists
    // --- adding the result of each condition check to the booleans stack
    // --- adding to the connectors (AND/OR) stack
    // --- popping 2 x booleans and a connector, then add the result back to the booleans stack:
    // ------- e.g. TRUE OR FALSE = TRUE
    // --- Returning the value on the boolean stack when it has size == 1
    private boolean rowElementChecker(List<String> row)  {
        Iterator<String> iterateValues = data.iterator();
        Iterator<String> iterateOperatives = operative.iterator();
        // Create new stack for connectors (AND/OR) for each row so that values can be popped and pushed
        joins = new Stack<>();

        // While there are values in the list, keep evaluating conditions
        while (iterateValues.hasNext()) {
            conditionsChecker(row, iterateValues, iterateOperatives);
        }

        // If user specifies one condition it doesn't need evaluating at the end
        // e.g. WHERE name == 'Bob' simply adds true/false to the stack, which is the final result;
        if (bool.size() > 1) {
            trueOrFalseChecker();
        }

        return bool.pop();
    }

    // Results of evaluate condition are stored in booleans list - evaluate booleans after to determine
    // whether row should be included
    private void conditionsChecker(List<String> elements, Iterator<String> iterateValues, Iterator<String> iterateOperatives) {
        String values = iterateValues.next();
        // Checks if an attribute is a connector or closing bracket
        if (dataChecker(values) == true) {
            return;
        }

        String operative = iterateOperatives.next();
        String vals = iterateValues.next();
        int boolSize = bool.size();
        int valIndex = selectedTable.returnIndexOfColumns(values);

        // If value is an integer or float
        try {
            Float valueNum = Float.parseFloat(vals);
            Float numValueIndex = Float.parseFloat(elements.get(valIndex));

            // For each operator, push true/false to boolean stack depending on result
            if (operative.equals("==")) bool.push(numValueIndex.equals(valueNum));
            if (operative.equals("!=")) bool.push(!numValueIndex.equals(valueNum));
            if (operative.equals(">")) bool.push(numValueIndex > valueNum);
            if (operative.equals("<")) bool.push(numValueIndex < valueNum);
            if (operative.equals(">=")) bool.push(numValueIndex >= valueNum);
            if (operative.equals("<=")) bool.push(numValueIndex <= valueNum);
        } catch (NumberFormatException e) {
            // If it doesn't convert to a float, it's a boolean or string
        }

        // If value is a string
        if (vals.charAt(0) == '\'') {
            // Remove single quotes for LIKE comparison
            String likeCompare = vals.substring(1, vals.length()-1);
            if (operative.equals("LIKE") || (operative.equals("like"))) {
                bool.push(elements.get(valIndex).contains(likeCompare));
            }
        }

        // If value is string or boolean
        if (operative.equals("==")) bool.push(elements.get(valIndex).equals(vals));
        if (operative.equals("!=")) bool.push(!elements.get(valIndex).equals(vals));

        // If booleans is the same size, no functions were called so throw error
        if (boolSize == bool.size()) {
            throw new DBException("[ERROR]");
        }
    }

    // Removes last 2 boolean values from stack and evaluates them based on the connectors list
    // e.g. TRUE OR FALSE = TRUE, add back to booleans list
    private void trueOrFalseChecker()  {
        try {
            boolean firstBool = bool.pop();
            boolean secondBool = bool.pop();
            String andOrConditions = joins.pop();

            if (andOrConditions.equals("AND")) {
                bool.push(firstBool && secondBool);
            }
            else if (andOrConditions.equals("OR")) {
                bool.push(firstBool || secondBool);
            }

        } catch (EmptyStackException e) {
            // If method is called but stack is empty, the wrong number of brackets were used
            throw new DBException("[ERROR]");
        }

    }

    // Checks if an attribute is a connector or closing bracket
    private boolean dataChecker(String condition) {
        // Closing bracket indicates end of expression, so evaluate booleans on the stack
        if (condition.equals(")")) {
            trueOrFalseChecker();
            return true;
        }
        // Add connectors to connectors stack as they appear
        else if (condition.equals("AND") || condition.equals("and")) {
            joins.push("AND");
            return true;
        }
        else if (condition.equals("OR") || condition.equals("or")) {
            joins.push("OR");
            return true;
        }
        return false;
    }

    // TODO ----- CHANGE NAMES OF THESE AND REARrange?????
    public void addOperative(String operative) {
        this.operative.add(operative);
    }

    public void addValue(String value) {
        data.add(value);
    }

    public boolean isEmpty() {
        return operative.isEmpty() && data.isEmpty();
    }

}