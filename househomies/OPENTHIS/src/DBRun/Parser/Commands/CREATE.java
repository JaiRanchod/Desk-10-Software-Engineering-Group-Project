package DBRun.Parser.Commands;

import DBRun.DBException;
import DBRun.Controller;
import DBRun.Parser.Parser;
import DBRun.Tokenizer.TokenEnum;

import java.io.IOException;

public class CREATE {
    public static void implementCREATE() throws IOException {
        // If user enters CREATE DATABASE
        if (Parser.presentToken.returnToken() == TokenEnum.DATABASE) {
            Parser.progressToNextToken();
            if (Parser.presentToken.returnToken() == TokenEnum.CHARACTER) {
                String dbName = Parser.presentToken.returnSequence();
                Parser.progressToNextToken();
                Controller.initializeNewDatabase(dbName);
                return;
            }
            throw new DBException("[ERROR]");
        }
        // If user enters CREATE TABLE
        else if (Parser.presentToken.returnToken() == TokenEnum.TABLE) {
            Parser.progressToNextToken();
            CREATETable.implementCREATETable();
        }

        else {
            throw new DBException("[ERROR]: Invalid query, must state either database or table after.");
        }
    }
}
