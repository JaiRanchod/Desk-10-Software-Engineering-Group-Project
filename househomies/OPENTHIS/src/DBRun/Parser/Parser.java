package DBRun.Parser;

import DBRun.DBException;
import DBRun.Parser.Commands.*;
import DBRun.RelationalDataTable;
import DBRun.Tokenizer.Token;
import DBRun.Tokenizer.TokenEnum;
import DBRun.Tokenizer.Tokenizer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Parser {
    public static Token presentToken;
    //private static final Parser parser = null;
    private static LinkedList<Token> initializedTokens;
    private static LinkedList<Token> droppedTokens;

    private final Tokenizer tokenizer;

    public static ArrayList<String> columns;
    public static ArrayList<String> elements;
    public static Conditions conditions;
    private String printTable = "";

    // Constructor private - use getParser to return parser
    public Parser() {
        initializedTokens = new LinkedList<>();
        droppedTokens = new LinkedList<>();
        tokenizer = Tokenizer.returnTokenizerInUse();
        //Controller controller = Controller.returnController();
    }

    // TODO ---- IS THIS REALLY NECESSARY?????
    // Prevents duplicate parsers being created
    public static Parser getParser() {
        return new Parser();
    }

    // TODO ----- CHANGE NAMES OF CH FUNCTIONS
    //sets the table string we want to output to DBClient
    public void setPrintTable(String printTable) {this.printTable = printTable;}

    /*returns the table to be outputted, will print nothing if printTable is null, will print a new line and then
    the table to be outputted if printTable is not null*/
    //todo this a method of mine, dunno if you can do it any different
    public String outputTable() {
        if (printTable.equals("")){
            return "";
        }
        return  "\n" + printTable;
    }

    //todo************
    //todo try change this as this is exact same as mine

    //converts a table into a string so we can print it to DBClient, in the correct .tab format
    private static String toStringTable(RelationalDataTable RDT){
        StringBuilder toString = new StringBuilder();
        for(int i = 0; i < RDT.returnColumnCount(); i++){
            toString.append(RDT.returnColumnsInTable(i));
            toString.append("\t");
        }
        toString.append("\n");
        for(int j = 0; j < RDT.returnRowElementsInTableCount(); j++){
            //todo may have to change format as migth be differnt how youve doen your rows
            ArrayList<String> elements = (ArrayList<String>) RDT.returnSingleRowOfElements(j);
            for (String element : elements) {
                toString.append(element);
                toString.append("\t");
            }
            toString.append("\n");
        }
        return toString.toString();
    }



    // Parses (and interprets) user input, stores results of any database queries in DBRun.DBMS.output
    public void mainParse(String input) throws IOException {
        //todo this stops it from failing when they press enter
        if (input.equals("")){
            throw new DBException("[ERROR]: Invalid query");
        }
        // Split input string in to tokens
        printTable = "";
        tokenizer.tokenize(input);
        initializedTokens = tokenizer.returnTokens();
        presentToken = initializedTokens.getFirst();

        // Every time new command is parsed reset the different storage lists
        columns = new ArrayList<>();
        elements = new ArrayList<>();
        conditions = new Conditions();

        // All queries begin with a command, so parsing starts by calling commandType method
        mainCommands();

        // If final token isn't equal to semicolon, an error has occurred when parsing
        if (presentToken.returnToken() != TokenEnum.SEMICOLON) {
            throw new DBException("[ERROR]: Semi colon missing at end of line");
        }
    }

    private void mainCommands() throws IOException {
        RelationalDataTable outputTable;
        if (presentToken.returnToken() == TokenEnum.USE) {
            progressToNextToken();
            USE.implementUSE();
        }
        else if (presentToken.returnToken() == TokenEnum.CREATE) {
            progressToNextToken();
            CREATE.implementCREATE();
        }
        else if (presentToken.returnToken() == TokenEnum.DROP) {
            progressToNextToken();
            DROP.implementDROP();
        }
        else if (presentToken.returnToken() == TokenEnum.ALTER) {
            progressToNextToken();
            ALTER.implementALTER();
        }
        else if (presentToken.returnToken() == TokenEnum.INSERT) {
            progressToNextToken();
            INSERT.implementINSERT();
        }
        else if (presentToken.returnToken() == TokenEnum.SELECT) {
            progressToNextToken();
            SELECT.implementSELECT();
            outputTable = SELECTTable.returnOutputTable();
            setPrintTable(toStringTable(outputTable));
        }
        else if (presentToken.returnToken() == TokenEnum.UPDATE) {
            progressToNextToken();
            UPDATE.implementUPDATE();
        }
        else if (presentToken.returnToken() == TokenEnum.DELETE) {
            progressToNextToken();
            DELETE.implementDELETE();
        }
        else if (presentToken.returnToken() == TokenEnum.JOIN) {
            progressToNextToken();
            JOIN.implementJOIN();
            outputTable = SELECTTable.returnOutputTable();
            setPrintTable(toStringTable(outputTable));
        }
        else {
            throw new DBException("[ERROR]: Invalid query");
        }
    }

    // TODO ---  DON'T NEED TO CHANGE NAME OF THIS, IS ALREADY CHANGED
    // Iterates through the list of tokens
    public static void progressToNextToken() {
        droppedTokens.addFirst(initializedTokens.removeFirst());
        if (initializedTokens.isEmpty()) {
            // If tokenList is empty (i.e. end of query),
            // the currentToken should be a semicolon, else throw an error
            if (presentToken.returnToken() != TokenEnum.SEMICOLON) {
                throw new DBException("[ERROR]: Semi colon missing at end of line");
            }
            return;
        }
        presentToken = initializedTokens.getFirst();
    }

    //todo I dont have this, think he uses this for when using nested conditions
    // Adds the last removed token back to the token list
    public static void previousToken() {
        try {
            initializedTokens.addFirst(droppedTokens.removeFirst());
            presentToken = initializedTokens.getFirst();
        } catch (RuntimeException e) {
            System.err.println(e.getMessage() + "\nTried to access empty array of removed tokens");
        }
    }

}