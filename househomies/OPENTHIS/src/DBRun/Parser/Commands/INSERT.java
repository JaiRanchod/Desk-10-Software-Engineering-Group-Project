package DBRun.Parser.Commands;

import DBRun.DBException;
import DBRun.Controller;
import DBRun.Parser.BNF;
import DBRun.Parser.Parser;
import DBRun.Tokenizer.TokenEnum;

import java.io.IOException;

public class INSERT {

    // Add rows to the end of an existing table
    public static void implementINSERT() throws IOException {
        if (Parser.presentToken.returnToken() == TokenEnum.INTO) {
            Parser.progressToNextToken();
            if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
                String tableName = Parser.presentToken.returnSequence();
                Parser.progressToNextToken();
                if (Parser.presentToken.returnToken() == TokenEnum.VALUES) {
                    Parser.progressToNextToken();
                    if (Parser.presentToken.returnToken() == TokenEnum.LEFTPARENTHESIS) {
                        Parser.progressToNextToken();
                        if (BNF.BNFValueList()) {
                            if (Parser.presentToken.returnToken() == TokenEnum.RIGHTPARENTHESIS) {
                                Parser.progressToNextToken();
                                Controller.addTableElements(Parser.elements, tableName);
                                return;
                            }
                        }

                        throw new DBException("[ERROR]: Invalid query, inserted elements should be specified in parenthesis.");
                    }
                }
            }
        }
        throw new DBException("[ERROR]: Invalid query, please specify which table to insert table elements, using INSERT INTO.");
    }
}
