package DBRun.Parser.Commands;

import DBRun.DBException;
import DBRun.Parser.BNF;
import DBRun.Parser.Parser;
import DBRun.Tokenizer.TokenEnum;

import java.io.IOException;

public class SELECT {

    // Retrieves data from tables according to attributes and conditions listed
    public static void implementSELECT() throws IOException {
        if (Parser.presentToken.returnToken() == TokenEnum.STAR) {
            Parser.progressToNextToken();
            SELECTTable.implementSELECTTable();
        }
        else if (BNF.BNFAttributeList()) {
            SELECTTable.implementSELECTTable();
        }
        else throw new DBException("[ERROR]: Invalid query, select an existing table.");
    }
}
