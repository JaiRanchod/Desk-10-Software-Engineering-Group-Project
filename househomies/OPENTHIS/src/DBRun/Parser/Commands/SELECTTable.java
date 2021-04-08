package DBRun.Parser.Commands;

import DBRun.DBException;
import DBRun.Controller;
import DBRun.Parser.BNF;
import DBRun.Parser.Parser;
import DBRun.RelationalDataTable;
import DBRun.Tokenizer.TokenEnum;

import java.io.IOException;

import static DBRun.Parser.Parser.conditions;

public class SELECTTable {

    public static RelationalDataTable outputTable;

    public static RelationalDataTable returnOutputTable() {
        return outputTable;
    }

    public static void implementSELECTTable() throws IOException {
        if (Parser.presentToken.returnToken() == TokenEnum.FROM) {
            Parser.progressToNextToken();
            if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
                String tableName = Parser.presentToken.returnSequence();
                Parser.progressToNextToken();

                // If statement ends, no conditions so an empty conditionStack is passed
                if (Parser.presentToken.returnToken() == TokenEnum.SEMICOLON) {
                    Controller.USETable(Parser.columns, conditions, tableName);
                    outputTable = Controller.getPrintTable();
                    return;
                }

                // If next word is WHERE, then conditions are added to conditionStack
                else if (Parser.presentToken.returnToken() == TokenEnum.WHERE) {
                    Parser.progressToNextToken();
                    if (BNF.BNFCondition()) {
                        Parser.progressToNextToken();
                        Controller.USETable(Parser.columns, conditions, tableName);
                        outputTable = Controller.getPrintTable();
                        return;
                    }
                }
            }
        }
        throw new DBException("[ERROR]: Invalid query");
    }
}
