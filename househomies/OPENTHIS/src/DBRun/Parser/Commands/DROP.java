package DBRun.Parser.Commands;

import DBRun.DBException;
import DBRun.Controller;
import DBRun.Parser.Parser;
import DBRun.Tokenizer.TokenEnum;

import java.io.IOException;

public class DROP {

    public static void implementDROP() throws IOException {
        // If user inputs DROP DATABASE
        if (Parser.presentToken.returnToken() == TokenEnum.DATABASE) {
            Parser.progressToNextToken();
            if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
                String dbName = Parser.presentToken.returnSequence();
                Parser.progressToNextToken();
                Controller.dropDatabase(dbName);
                return;
            }
            throw new DBException("[ERROR]: Invalid database name, please try again.");
        }

        // If user inputs DROP TABLE
        else if (Parser.presentToken.returnToken() == TokenEnum.TABLE) {
            Parser.progressToNextToken();
            if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
                String tableName = Parser.presentToken.returnSequence();
                Parser.progressToNextToken();
                Controller.dropTable(tableName);
                return;
            }
            throw new DBException("[ERROR]: Table does not exist");
        }

        else {
            throw new DBException("[ERROR]: Must drop either a database or a table, please try again.");
        }
    }
}
