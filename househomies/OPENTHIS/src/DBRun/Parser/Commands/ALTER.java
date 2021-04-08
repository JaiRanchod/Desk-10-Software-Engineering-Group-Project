package DBRun.Parser.Commands;

import DBRun.DBException;
import DBRun.Controller;
import DBRun.Parser.Parser;
import DBRun.Tokenizer.TokenEnum;

import java.io.IOException;

public class ALTER {

    // Either adds or removes columns from an existing table
    public static void implementALTER() throws IOException {
        if (Parser.presentToken.returnToken() == TokenEnum.TABLE) {
            Parser.progressToNextToken();
            if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
                String tableName = Parser.presentToken.returnSequence();
                Parser.progressToNextToken();

                // User can either ADD or DROP columns
                if (Parser.presentToken.returnToken() == TokenEnum.ADD) {
                    Parser.progressToNextToken();
                    if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
                        Parser.columns.add(Parser.presentToken.returnSequence());
                        Parser.progressToNextToken();
                        Controller.addColumnsToTable(Parser.columns, tableName);
                        return;
                    }
                }

                else if (Parser.presentToken.returnToken() == TokenEnum.DROP) {
                    Parser.progressToNextToken();
                    if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
                        Parser.columns.add(Parser.presentToken.returnSequence());
                        Parser.progressToNextToken();
                        Controller.dropTableColumns(Parser.columns, tableName);
                        return;
                    }
                }
            }
        }
        throw new DBException("[ERROR]: Invalid query");
    }
}
