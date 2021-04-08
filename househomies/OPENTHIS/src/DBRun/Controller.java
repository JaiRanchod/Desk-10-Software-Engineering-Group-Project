package DBRun;
import DBRun.Parser.Conditions;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// DBRun.DBMS = Database Management System - handles all interactions with stored data
public class Controller {
    private static Controller controller = null;
    public static final String databaseRoot = "Databases";
    private static String output = "";
    private static String selectedDatabase = null;
    //private static String fileExt = ".tab";

    //todo************
    private static RelationalDataTable printTable;

    //todo************
    //sets the String of the table we want to print
    public static void setPrintTable(RelationalDataTable output) {printTable = output;}

    //todo************
    //gets the String of the table we want to print
    public static RelationalDataTable getPrintTable() {return printTable;}

    public static final int SELECT = 0;
    public static final int DELETE = 1;

    private Controller() {
        File rootDirectory = new File(databaseRoot);
        if(!rootDirectory.exists()) {
            rootDirectory.mkdir();
        }
    }

    // Prevents multiple instances being generated
    public static Controller returnController() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    // Sets the current database to the specified database
    public static void addDatabaseToDirectory(String databaseName) throws IOException {
        String directoryPath = databaseRoot + File.separator + databaseName;
        File createdDatabase = new File(directoryPath);
        if (createdDatabase.exists()) {
            selectedDatabase = directoryPath;
            return;
        }
        //throw new IOException("ERROR: '" + name + "' does not exist");
        throw new DBException("[ERROR]: Unknown database");
    }

    // Create a new database
    public static void initializeNewDatabase(String databaseName) throws IOException {
        String directoryPath = databaseRoot + File.separator + databaseName;
        File createdDatabase = new File(directoryPath);
        if (!createdDatabase.exists()) {
            if (createdDatabase.mkdirs()) {
                return;
            }
            //throw new IOException("ERROR: Unable to create new database '" + name + "'");
            throw new DBException("[ERROR]");
        }
        //throw new IOException("ERROR: '" + name + "' already exists");
        throw new DBException("[ERROR]: Database already exists, please try a different name.");
    }

    // Create table, initialise it with a single "id" heading and save it to file
    public static void initializeNewTable(String tableName) throws IOException {
        // Check user is inside a database
        if (selectedDatabase == null) {
            //throw new IOException("ERROR: Please 'USE' a database before creating tables");
            throw new DBException("[ERROR]: Please select a database to edit tables inside.");
        }
        String directoryPath = selectedDatabase + File.separator + tableName + ".tab";
        File createdFile = new File(directoryPath);
        // Check if table already exists
        if (createdFile.exists()) {
            //throw new IOException("ERROR: DBRun.Table '" + tableName + "' already exists - choose " +
            //"another table name");
            throw new DBException("[ERROR]: Table already exists, please try a different name.");
        }
        RelationalDataTable createTable = new RelationalDataTable();
        createTable.addColumnsToTable("id");
        Write.writeToFile(directoryPath, createTable);
    }

    // Delete database and all contained files
    public static void dropDatabase(String databaseName) throws IOException {
        String directoryPath = databaseRoot + File.separator + databaseName;
        File existingDatabase = new File(directoryPath);
        // Check database exists
        if (existingDatabase.exists() == false) {
            //throw new IOException("ERROR: Database '" + name + "' does not exist");
            throw new DBException("[ERROR]: Unknown database");
        }
        // If database contains tables, delete these first
        String[] tablesInDatabase = existingDatabase.list();
        if (tablesInDatabase != null) {
            selectedDatabase = directoryPath;
            for (String str : tablesInDatabase) {
                dropTable(str.replace(".tab", ""));
            }
        }
        selectedDatabase = null;

        // If can't delete database (for whatever reason), throw an error
        if (existingDatabase.delete() == false) {
            //throw new IOException("ERROR: Unable to delete database '" + name + "'");
            throw new DBException("[ERROR]");
        }
    }

    // Delete a single table (within current database)
    public static void dropTable(String tableName) throws IOException {
        if (selectedDatabase == null) {
            //throw new IOException("ERROR: Please 'USE' a database before deleting tables");
            throw new DBException("[ERROR]: Please select a database to edit tables inside.");
        }
        String directoryPath = selectedDatabase + File.separator + tableName + ".tab";
        File RDT = new File(directoryPath);
        if (RDT.exists() == false) {
            //throw new IOException("ERROR: DBRun.Table '" + name + "' does not exist");
            throw new DBException("[ERROR]: Table does not exist");
        }
        if (RDT.delete() == true) {
            return;
        }
        //throw new IOException("ERROR: Unable to delete table '" + name + "'");
        throw new DBException("[ERROR]");
    }

    // Add columns to an existing table
    public static void addColumnsToTable(ArrayList<String> columns, String tableName) throws IOException {
        // Check user is inside a database
        if (selectedDatabase == null) {
            //throw new IOException("ERROR: Please 'USE' a database before adding columns");
            throw new DBException("[ERROR]: Please select a database to edit tables inside.");
        }
        String directoryPath = selectedDatabase + File.separator + tableName + ".tab";
        // Read in old table
        RelationalDataTable RDT = Read.readTable(directoryPath);

        // Add new column headings to table
        for (String column : columns) {
            RDT.addColumnsToTable(column);
        }

        // Add empty strings to all rows so every row has same number of columns
        // --- Makes future table handling easier
        for (int i = 0; i < RDT.returnRowElementsInTableCount(); i++) {
            List<String> rowElements = RDT.returnRowElementsFromTable(i, Collections.emptyList());
            while (rowElements.size() < RDT.returnColumnCount()) {
                rowElements.add("");
            }
        }
        // Re-write new table to the original file path, overwriting it
        Write.writeToFile(directoryPath, RDT);
    }

    // Remove specified columns from a table
    public static void dropTableColumns(ArrayList<String> columns, String tableName) throws IOException {
        if (selectedDatabase == null) {
            //throw new IOException("ERROR: Please 'USE' a database before adding columns");
            throw new DBException("[ERROR]: Please select a database to edit tables inside.");
        }
        String directoryPath = selectedDatabase + File.separator + tableName + ".tab";
        // Read in old RDT
        RelationalDataTable RDT = Read.readTable(directoryPath);
        RelationalDataTable replacedRDT = new RelationalDataTable();

        // Get array of ints representing indices of all RDT columns e.g. [1,2,3,4,5]
        List<Integer> columnIndex = new ArrayList<>();
        for (int i = 0; i < RDT.returnColumnCount(); i++) {
            columnIndex.add(i);
        }

        // Remove the index of the column/s that we want to remove - e.g. 2
        for (String column : columns) {
            columnIndex.remove(RDT.returnIndexOfColumns(column));
        }

        // Add only the columns specified in headingIndices (e.g. [1,3,4,5]) to the output RDT
        replacedRDT.initializeColumns(RDT.returnColumnsInTable(columnIndex));
        for (int i = 0; i < RDT.returnRowElementsInTableCount(); i++) {
            replacedRDT.addRowElementsToTable(RDT.returnRowElementsFromTable(i, columnIndex));
        }
        // Overwrite previous RDT with output RDT
        Write.writeToFile(directoryPath, replacedRDT);
    }

    // Add a single row of values to an existing table
    public static void addTableElements(ArrayList<String> elements, String tableName) throws IOException {
        if (selectedDatabase == null) {
            //throw new IOException("ERROR: Please 'USE' a database before adding values");
            throw new DBException("[ERROR]: Please select a database to edit tables inside.");
        }
        String directoryPath = selectedDatabase + File.separator + tableName + ".tab";
        RelationalDataTable RDT = Read.readTable(directoryPath);

        // Check user has input enough values to add to the table
        if (RDT.returnColumnCount() - 1 != elements.size()) {
            //throw new IOException("ERROR: Please provide enough values for "
            //+ (table.getNumCols() - 1) + " columns");
            throw new DBException("[ERROR]: Not enough elements stated");
        }

        // Add the new row id to the start of the new row
        elements.add(0, String.valueOf(RDT.returnRowElementsInTableCount() + 1));
        // Add the row of values to the table
        RDT.addRowElementsToTable(elements);
        // Overwrite the old table with the updated one
        Write.writeToFile(directoryPath, RDT);
    }

    // Adds specified table to the output function to be printed later
    // -- Selects columns based on the attributes specified in attributeList
    // -- Selects rows based on the conditions stored on the conditionStack
    public static void USETable(ArrayList<String> columns, Conditions conditions, String tableName) throws IOException {
        if (selectedDatabase == null) {
            // throw new IOException("ERROR: Please 'USE' a database before accessing tables");
            throw new DBException("[ERROR]: Please select a database to access tables inside.");
        }
        String directoryPath = selectedDatabase + File.separator + tableName + ".tab";
        File initializedTable = new File(directoryPath);
        if (initializedTable.exists() == false){
            throw new DBException("[ERROR]: Table does not exist");
        }
        RelationalDataTable RDT = Read.readTable(directoryPath);
        RelationalDataTable createdTable;

        // If user specifies conditions, applyConditions to add only the correct rows to the outputTable
        // Use the modifier 'SELECT' so it ADDS the specified rows to the new table ('DELETE' removes them)
        if (!conditions.isEmpty()) {
            createdTable = conditions.conditionsUser(RDT, SELECT);
            createdTable.initializeColumns(RDT.returnColumnsInTable(Collections.emptyList()));
        }
        else {
            createdTable = RDT;
        }

        //todo this bit below is to do with only printing attributes we want
        //todo so this is where its fucking up when we just wanted to print id

        // Variable for storing indices of the desired columns
        List<Integer> columnIndex = new ArrayList<>();

        // If columns specified, find indices of those columns
        if (!columns.isEmpty()) {
            // Get positions of each column and add to list
            for (String column : columns) {
                int index = createdTable.returnIndexOfColumns(column);
                columnIndex.add(index);
            }
        }

        // Adds specified columns from outputTable to the output variable
        setPrintTable(createdTable);
    }

    // Deletes rows in a table specified by the conditions in conditionStack
    public static void dropTableElements(Conditions conditions, String tableName) throws IOException {
        if (selectedDatabase == null) {
            //throw new IOException("ERROR: Please 'USE' a database before deleting values");
            throw new DBException("[ERROR]: Please select a database to edit tables inside.");
        }
        String directoryPath = selectedDatabase + File.separator + tableName + ".tab";
        RelationalDataTable RDT = Read.readTable(directoryPath);

        // Apply conditions from the condition stack to create new table without deleted rows
        RelationalDataTable replacedTable = conditions.conditionsUser(RDT, DELETE);
        // Add old table headings to new table
        replacedTable.initializeColumns(RDT.returnColumnsInTable(Collections.emptyList()));
        // Overwrite old file with the updated output table
        Write.writeToFile(directoryPath, replacedTable);
    }

    // Replaces individual values in specific rows (specified using the attributeList & condition stack) with the values in valueList
    // -- attributeList contains the column headings of the values to replace
    // -- conditionStack determines which rows the values will be replaced in
    // -- valueList contains the new values to replace the old values with
    public static void editAndReplaceTable(ArrayList<String> columns, ArrayList<String> elements, Conditions conditions, String tableName) throws IOException {
        if (selectedDatabase == null){
            //throw new IOException("ERROR: Please 'USE' a database before accessing tables");
            throw new DBException("[ERROR]: Please select a database to edit tables inside.");}
        String directoryPath = selectedDatabase + File.separator + tableName + ".tab";
        RelationalDataTable RDT = Read.readTable(directoryPath);

        // Create table with all rows which meet specified condition, e.g. WHERE name == 'Bob'
        RelationalDataTable statedRowElements = conditions.conditionsUser(RDT, SELECT);

        // Iterate through all rows that need to be modified
        for (int i = 0; i < statedRowElements.returnRowElementsInTableCount(); i++) {
            List<String> originalElements = statedRowElements.returnRowElementsFromTable(i, Collections.emptyList());
            List<String> replacedElements = new ArrayList<>(originalElements);
            // Replace the variables specified in the attribute and value lists
            for (int j = 0; j < columns.size(); j++) {
                int columnIndex = RDT.returnIndexOfColumns(columns.get(j));
                /*
                if (elements.get(j).charAt(0) == '\'') {
                    String stringLiteral = elements.get(j).substring(1, elements.get(j).length() - 1);
                    replacedElements.set(columnIndex, stringLiteral);
                }

                 */
                replacedElements.set(columnIndex, elements.get(j));
            }
            // Replace the row in the original table with the modified row
            RDT.replaceRow(originalElements, replacedElements);
        }
        Write.writeToFile(directoryPath, RDT);
    }

    // Join 2 tables together by matching up attribute1 and attribute2 in each row
    public static void joinTableColumnsAndElements(String firstTableName, String secondTableName, String firstTableElement, String secondTableElement) throws IOException {
        if (selectedDatabase == null) {
            //throw new IOException("ERROR: Please 'USE' a database before accessing tables");
            throw new DBException("[ERROR]: Please select a database to access tables inside.");
        }
        String directoryPath = selectedDatabase + File.separator + firstTableName + ".tab";
        RelationalDataTable firstTable = Read.readTable(directoryPath);
        directoryPath = selectedDatabase + File.separator + secondTableName + ".tab";
        RelationalDataTable secondTable = Read.readTable(directoryPath);

        // Create table to store output with new id heading
        RelationalDataTable createdTable = new RelationalDataTable();
        createdTable.addColumnsToTable("id");

        // Add all column headings (except id) from each table to output table
        List<String> columnsInTable = firstTable.returnColumnsInTable(Collections.emptyList());
        // Create list of the columns needed from each table
        List<Integer> firstColumnsToJoin = new ArrayList<>();
        for (int i=1; i < columnsInTable.size(); i++) {
            createdTable.addColumnsToTable(firstTableName + "." + columnsInTable.get(i));
            firstColumnsToJoin.add(i);
        }
        List<Integer> secondColumnsToJoin = new ArrayList<>();
        columnsInTable = secondTable.returnColumnsInTable(Collections.emptyList());
        for (int i=1; i < columnsInTable.size(); i++) {
            createdTable.addColumnsToTable(secondTableName + "." + columnsInTable.get(i));
            secondColumnsToJoin.add(i);
        }

        int firstTableColumnIndex = firstTable.returnIndexOfColumns(firstTableElement);
        int secondTableColumnIndex = secondTable.returnIndexOfColumns(secondTableElement);
        int initialId = 1;

        // Combine both tables (leaving out ids of each) based on the 2 attributes
        for (int i = 0; i < firstTable.returnRowElementsInTableCount(); i++) {
            List<String> provisionalFirstTableElements = firstTable.returnRowElementsFromTable(i, Collections.emptyList());
            for (int j = 0; j < secondTable.returnRowElementsInTableCount(); j++) {
                List<String> provisionalSecondTableElements = secondTable.returnRowElementsFromTable(j, Collections.emptyList());
                // If the attributes from each row match, combine those rows
                if (provisionalFirstTableElements.get(firstTableColumnIndex).equals(provisionalSecondTableElements.get(secondTableColumnIndex))) {
                    List<String> replacedRowElements = new ArrayList<>(firstTable.returnRowElementsFromTable(i, firstColumnsToJoin));
                    replacedRowElements.addAll(secondTable.returnRowElementsFromTable(j, secondColumnsToJoin));
                    replacedRowElements.add(0, String.valueOf(initialId));
                    createdTable.addRowElementsToTable(replacedRowElements);
                    initialId++;
                }
            }
        }
        // Add output table to output
        setPrintTable(createdTable);
    }




}