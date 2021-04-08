package DBRun.Parser.Commands;

import DBRun.DBException;
import DBRun.Controller;
import DBRun.Parser.Parser;
import DBRun.RelationalDataTable;
import DBRun.Tokenizer.TokenEnum;

import java.io.IOException;

public class JOIN {

    public static RelationalDataTable outputTable;

    //public static RelationalDataTable getOutputTable() {
    //    return outputTable;
    //}

    // Stores the two tables to join and the attributes to join them on, then passes to the
    // DBRun.DBMS jointables function
    public static void implementJOIN() throws IOException {
        if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
            String tableName1 = Parser.presentToken.returnSequence();
            Parser.progressToNextToken();
            if (Parser.presentToken.returnToken() == TokenEnum.AND) {
                Parser.progressToNextToken();
                if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
                    String tableName2 = Parser.presentToken.returnSequence();
                    Parser.progressToNextToken();
                    if (Parser.presentToken.returnToken() == TokenEnum.ON) {
                        Parser.progressToNextToken();
                        if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
                            String attribute1 = Parser.presentToken.returnSequence();
                            Parser.progressToNextToken();
                            if (Parser.presentToken.returnToken() == TokenEnum.AND) {
                                Parser.progressToNextToken();
                                if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
                                    String attribute2 = Parser.presentToken.returnSequence();
                                    Parser.progressToNextToken();
                                    Controller.joinTableColumnsAndElements(tableName1, tableName2, attribute1, attribute2);
                                    outputTable = Controller.getPrintTable();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new DBException("[ERROR]: Invalid query");
    }
}
