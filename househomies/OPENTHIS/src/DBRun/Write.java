package DBRun;

import java.io.*;
import java.util.List;

public class Write {

    public static void writeToFile(String path, RelationalDataTable table) throws IOException {
        FileWriter write = new FileWriter(path);
        BufferedWriter buff = new BufferedWriter(write);
        try{
            for (int i = 0; i < table.returnColumnCount(); i ++){
                buff.write(table.returnColumnsInTable(i));
                buff.write("\t");
            }
            buff.newLine();
            for (int j = 0; j < table.returnRowElementsInTableCount(); j++){
                List<String> row = table.returnSingleRowOfElements(j);
                for (String s : row) {
                    buff.write(s);
                    buff.write("\t");
                }
                buff.newLine();
            }
            buff.close();
        }catch (IOException error){
            error.printStackTrace();
        }
    }

}
