package DBRun.Parser.Commands;

import DBRun.DBException;
import DBRun.Controller;
import DBRun.Parser.BNF;
import DBRun.Parser.Parser;
import DBRun.Tokenizer.TokenEnum;

import java.io.IOException;

public class CREATETable {
    public static void implementCREATETable() throws IOException {
        if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
            String tableName = Parser.presentToken.returnSequence();
            Parser.progressToNextToken();

            // If the statement ends after the table name, create new basic table
            if (Parser.presentToken.returnToken() == TokenEnum.SEMICOLON) {
                Controller.initializeNewTable(tableName);
                return;
            }

            // Or the user inputs a list of attributes for the column names
            else if (Parser.presentToken.returnToken() == TokenEnum.LEFTPARENTHESIS) {
                Parser.progressToNextToken();
                if (BNF.BNFAttributeList()) {
                    if (Parser.presentToken.returnToken() == TokenEnum.RIGHTPARENTHESIS) {
                        Parser.progressToNextToken();
                        // Create new basic table
                        Controller.initializeNewTable(tableName);
                        // If a list of attributes is specified, add them to the table
                        Controller.addColumnsToTable(Parser.columns, tableName);
                        return;
                    }
                }
                throw new DBException("[ERROR]: Invalid query");
            }
            else {
                throw new DBException("[ERROR]: Invalid query");
            }
        }
        throw new DBException("[ERROR]: Invalid table name, please try again.");
    }
}
