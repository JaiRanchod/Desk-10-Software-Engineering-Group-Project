package DBRun.Parser.Commands;

import DBRun.DBException;
import DBRun.Controller;
import DBRun.Parser.BNF;
import DBRun.Parser.Parser;
import DBRun.Tokenizer.TokenEnum;

import java.io.IOException;

public class UPDATE {

    // Updates a table values specified by attributes, values and conditions
    public static void implementUPDATE() throws IOException {
        if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
            String tableName = Parser.presentToken.returnSequence();
            Parser.progressToNextToken();
            if (Parser.presentToken.returnToken() == TokenEnum.SET) {
                Parser.progressToNextToken();
                if (BNF.BNFNameValueList()) {
                    if (Parser.presentToken.returnToken() == TokenEnum.WHERE) {
                        Parser.progressToNextToken();
                        if (BNF.BNFCondition()) {
                            Parser.progressToNextToken();
                            Controller.editAndReplaceTable(Parser.columns, Parser.elements, Parser.conditions, tableName);
                            return;
                        }
                    }
                }
            }
            throw new DBException("ERROR]: Invalid query");
        }
        throw new DBException("[ERROR]");
    }
}
