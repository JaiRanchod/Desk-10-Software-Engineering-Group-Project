package DBRun;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Read {

    public static RelationalDataTable readTable(String path) throws IOException {
        File tabFile = new File(path);
        RelationalDataTable readInTable = new RelationalDataTable();
        if (tabFile.isFile()) {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String columnCheck = "Set headings";
            try {
                while (reader.ready()) {
                    switch (columnCheck) {
                        case ("Set headings"):
                            String columns = reader.readLine();
                            String[] columnsArray = columns.split("\t");
                            ArrayList<String> columnsList = new ArrayList<String>();
                            Collections.addAll(columnsList, columnsArray);
                            readInTable.initializeColumns(columnsList);
                            columnCheck = "Headings done";
                            break;
                        case ("Headings done"):
                            String row = reader.readLine();
                            String[] rowArray = row.split("\t");
                            ArrayList<String> rowList = new ArrayList<>();
                            Collections.addAll(rowList, rowArray);
                            readInTable.addRowElementsToTable(rowList);
                            break;
                    }
                }
            } catch (IOException error) {
                error.printStackTrace();
            }
        }
        return readInTable;
    }

}
