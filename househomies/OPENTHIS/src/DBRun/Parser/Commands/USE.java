package DBRun.Parser.Commands;

import DBRun.DBException;
import DBRun.Controller;
import DBRun.Parser.Parser;
import DBRun.Tokenizer.TokenEnum;

import java.io.IOException;

public class USE {

    public static void implementUSE() throws IOException {
        if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
            String dbName = Parser.presentToken.returnSequence();
            // Call next token to check for semicolon at the end (before calling DBRun.DBMS function)
            Parser.progressToNextToken();
            Controller.addDatabaseToDirectory(dbName);
            return;
        }
        throw new DBException("[ERROR]: Database does not exist");
    }
}
