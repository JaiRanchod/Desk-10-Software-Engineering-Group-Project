package DBRun;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RelationalDataTable {
    private List<String> tableHeadings;
    private List<List<String>> tableData;

    public RelationalDataTable() {
        tableData = new ArrayList<>();
        tableHeadings = new ArrayList<>();
    }

    // Returns column headings for columns specified in the integer list - pass an empty list if
    // all headings are required
    public List<String> returnColumnsInTable(List<Integer> columnIndices) {
        if (columnIndices.isEmpty()) {
            return tableHeadings;
        }

        // For each index specified in columnIndices, add respective heading
        List<String> heading = new ArrayList<>();
        for (int index : columnIndices) {
            heading.add(tableHeadings.get(index));
        }
        return heading;

    }

    public String returnColumnsInTable(int i){
        return tableHeadings.get(i);
    }

    public int returnColumnCount() {
        return tableHeadings.size();
    }

    public int returnRowElementsInTableCount() {
        return tableData.size();
    }

    // Return the position of a column heading - throws exception if not found
    public int returnIndexOfColumns(String columnHeading) {
        for (String str : tableHeadings) {
            if (columnHeading.equals(str)) {
                return tableHeadings.indexOf(str);
            }
        }
        throw new DBException("[ERROR]: Attribute does not exist ");
    }

    //todo added this for when converting table into string
    public List<String> returnSingleRowOfElements(int i){
        return tableData.get(i);
    }

    // Specify row number and the columns required in an integer list
    // - pass an empty list if entire row is required
    public List<String> returnRowElementsFromTable(int rowNumber, List<Integer> columnIndices) {
        List<String> row = tableData.get(rowNumber);
        if (columnIndices.isEmpty()) {
            return row;
        }

        // For each index specified in columnIndices, add respective row value
        List<String> newRow = new ArrayList<>();
        for (int index : columnIndices) {
            newRow.add(row.get(index));
        }
        return newRow;

    }

    // Finds the old row and replaces with the new row
    public void replaceRow(List<String> oldRow, List<String> newRow) throws IOException {
        for (int i=0; i < tableData.size(); i++) {
            if (oldRow.equals(tableData.get(i))) {
                tableData.remove(i);
                tableData.add(i, newRow);
                return;
            }
        }
        throw new IOException("ERROR: Unable to replace row in table - couldn't find '" + oldRow.toString() + "'");
    }

    //todo added this, used int setting table headings when reading from file
    public void initializeColumns(List<String> newHeadings) {
        tableHeadings = newHeadings;
    }

    //adds a sets a heading with the string inputted
    public void addColumnsToTable(String newHeading) {
        tableHeadings.add(newHeading);
    }

    //todo adds a row to tabledata
    public void addRowElementsToTable(List<String> rowData) {
        tableData.add(rowData);
    }

}