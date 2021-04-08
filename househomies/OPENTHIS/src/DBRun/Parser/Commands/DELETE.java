package DBRun.Parser.Commands;

import DBRun.DBException;
import DBRun.Controller;
import DBRun.Parser.BNF;
import DBRun.Parser.Parser;
import DBRun.Tokenizer.TokenEnum;

import java.io.IOException;

public class DELETE {

    // Deletes row/s from an existing table
    public static void implementDELETE() throws IOException {
        if (Parser.presentToken.returnToken() == TokenEnum.FROM) {
            Parser.progressToNextToken();
            if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
                String tableName = Parser.presentToken.returnSequence();
                Parser.progressToNextToken();
                if (Parser.presentToken.returnToken() == TokenEnum.WHERE) {
                    Parser.progressToNextToken();
                    if (BNF.BNFCondition()) {
                        Parser.progressToNextToken();
                        Controller.dropTableElements(Parser.conditions, tableName);
                        return;
                    }
                }
            }
        }
        throw new DBException("[ERROR]: Invalid query");
    }
}
