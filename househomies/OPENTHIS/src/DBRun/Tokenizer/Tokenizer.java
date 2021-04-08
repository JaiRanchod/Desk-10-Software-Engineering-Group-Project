package DBRun.Tokenizer;

import DBRun.DBException;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// DBRun.Tokenizer.Tokenizer was created by following the guide and Github code from:
// http://cogitolearning.co.uk/2013/04/writing-a-parser-in-java-the-tokenizer/
public class Tokenizer {
    // List to store the rules that the tokenizer will follow
    private LinkedList<TokenInfo> tokenInfos;
    // List of tokens generated when splitting input
    private LinkedList<Token> tokens;
    private static Tokenizer tokenizerInUse = null;

    // DBRun.Tokenizer.Tokenizer constructor - private because DBRun.Tokenizer.Tokenizer is instantiated
    // using the getTokenizer class
    private Tokenizer() {
        super();
        tokenInfos = new LinkedList<TokenInfo>();
        tokens = new LinkedList<Token>();
    }

    // Prevents multiple tokenizers being generated
    // If tokenizer exists, return it,
    // else initialise a tokenizer and return that
    public static Tokenizer returnTokenizerInUse() {
        if (tokenizerInUse == null) {
            tokenizerInUse = tokenBNF();
        }
        return tokenizerInUse;
    }

    // regex = the user input expression to compare against
    // tokenID = the token id that the string relates to (based on the 'rules' added to tokenInfo)
    public void tokenAddMethod(String regex, TokenEnum tokenID) {
        tokenInfos.add(new TokenInfo(Pattern.compile("^(" + regex+")", Pattern.CASE_INSENSITIVE), tokenID));
    }

    // Instantiates and adds grammar rules for tokenizer to follow
    private static Tokenizer tokenBNF() {
        Tokenizer tokenizer = new Tokenizer();
        tokenizer.tokenAddMethod("\\;", TokenEnum.SEMICOLON);
        tokenizer.tokenAddMethod("USE", TokenEnum.USE);
        tokenizer.tokenAddMethod("CREATE", TokenEnum.CREATE);
        tokenizer.tokenAddMethod("DATABASE", TokenEnum.DATABASE);
        tokenizer.tokenAddMethod("OR ", TokenEnum.OR);
        tokenizer.tokenAddMethod("TABLE", TokenEnum.TABLE);
        tokenizer.tokenAddMethod("DROP ", TokenEnum.DROP);
        tokenizer.tokenAddMethod("ALTER ", TokenEnum.ALTER);
        tokenizer.tokenAddMethod("INSERT ", TokenEnum.INSERT);
        tokenizer.tokenAddMethod("INTO ", TokenEnum.INTO);
        tokenizer.tokenAddMethod("VALUES", TokenEnum.VALUES);
        tokenizer.tokenAddMethod("SELECT ", TokenEnum.SELECT);
        tokenizer.tokenAddMethod("FROM ", TokenEnum.FROM);
        tokenizer.tokenAddMethod("WHERE ", TokenEnum.WHERE);
        tokenizer.tokenAddMethod("UPDATE", TokenEnum.UPDATE);
        tokenizer.tokenAddMethod("SET ", TokenEnum.SET);
        tokenizer.tokenAddMethod("DELETE", TokenEnum.DELETE);
        tokenizer.tokenAddMethod("JOIN ", TokenEnum.JOIN);
        tokenizer.tokenAddMethod("AND ", TokenEnum.AND);
        tokenizer.tokenAddMethod("ON ", TokenEnum.ON);
        tokenizer.tokenAddMethod("ADD ", TokenEnum.ADD);
        tokenizer.tokenAddMethod("true", TokenEnum.TRUE);
        tokenizer.tokenAddMethod("false", TokenEnum.FALSE);
        tokenizer.tokenAddMethod(",", TokenEnum.COMMA);
        tokenizer.tokenAddMethod("\\*", TokenEnum.STAR);
        tokenizer.tokenAddMethod("\\(", TokenEnum.LEFTPARENTHESIS);
        tokenizer.tokenAddMethod("\\)", TokenEnum.RIGHTPARENTHESIS);
        tokenizer.tokenAddMethod("==|>=|<=|>|<|!=|LIKE ", TokenEnum.OPERATIVE);
        tokenizer.tokenAddMethod("(?:\\d+\\.?|\\.\\d)\\d*(?:[Ee][-+]?\\d+)?", TokenEnum.NUMERATOR);
        tokenizer.tokenAddMethod("[a-zA-Z][a-zA-Z0-9_]*", TokenEnum.CHARACTER);
        tokenizer.tokenAddMethod("=", TokenEnum.EQUALS);
        tokenizer.tokenAddMethod("\\'[a-zA-Z0-9_ ]*\\'", TokenEnum.STRINGLITERAL);

        // Some have spaces after to prevent them being tokenized when inside other words (e.g. 'add'ress, 'set'ting)
        /*
        tokenizer.tokenAddMethod("\\;", TokenEnum.SEMICOLON);
        tokenizer.tokenAddMethod("USE", TokenEnum.USE);
        tokenizer.tokenAddMethod("CREATE", TokenEnum.CREATE);
        tokenizer.tokenAddMethod("DROP ", TokenEnum.DROP);
        tokenizer.tokenAddMethod("ALTER ", TokenEnum.ALTER);
        tokenizer.tokenAddMethod("INSERT ", TokenEnum.INSERT);
        tokenizer.tokenAddMethod("SELECT ", TokenEnum.SELECT);
        tokenizer.tokenAddMethod("UPDATE", TokenEnum.UPDATE);
        tokenizer.tokenAddMethod("DELETE", TokenEnum.DELETE);
        tokenizer.tokenAddMethod("JOIN ", TokenEnum.JOIN);
        tokenizer.tokenAddMethod("DATABASE", TokenEnum.DATABASE);
        tokenizer.tokenAddMethod("TABLE", TokenEnum.TABLE);
        tokenizer.tokenAddMethod("INTO ", TokenEnum.INTO);
        tokenizer.tokenAddMethod("VALUES", TokenEnum.VALUES);
        tokenizer.tokenAddMethod("FROM ", TokenEnum.FROM);
        tokenizer.tokenAddMethod("WHERE ", TokenEnum.WHERE);
        tokenizer.tokenAddMethod("SET ", TokenEnum.SET);
        tokenizer.tokenAddMethod("AND ", TokenEnum.AND);
        tokenizer.tokenAddMethod("ON ", TokenEnum.ON);
        tokenizer.tokenAddMethod("ADD ", TokenEnum.ADD);
        tokenizer.tokenAddMethod("true", TokenEnum.TRUE);
        tokenizer.tokenAddMethod("false", TokenEnum.FALSE);
        tokenizer.tokenAddMethod("\\*", TokenEnum.ALL);
        tokenizer.tokenAddMethod("\\(", TokenEnum.LEFTPARENTHESIS);
        tokenizer.tokenAddMethod("\\)", TokenEnum.RIGHTPARENTHESIS);
        tokenizer.tokenAddMethod(",", TokenEnum.COMMA);
        tokenizer.tokenAddMethod("OR ", TokenEnum.OR);
        tokenizer.tokenAddMethod("==|>=|<=|>|<|!=|LIKE ", TokenEnum.OPERATIVE);
        tokenizer.tokenAddMethod("=", TokenEnum.EQUALS);
        tokenizer.tokenAddMethod("[a-zA-Z][a-zA-Z0-9_]*", TokenEnum.CHARACTER);
        tokenizer.tokenAddMethod("(?:\\d+\\.?|\\.\\d)\\d*(?:[Ee][-+]?\\d+)?", TokenEnum.NUMERATOR);
        tokenizer.tokenAddMethod("\\'[a-zA-Z0-9_ ]*\\'", TokenEnum.STRINGLITERAL);

         */

        return tokenizer;
    }

    // Splits an input string into it's individual tokens (as specified
    // by the rules added in 'initialiseTokenizer')
    public void tokenize(String str) {
        // Remove leading/trailing spaces
        String s = str.trim();
        tokens.clear();
        while (s.equals("") == false) {
            boolean match = false;
            // Loop through token rules until one matches
            for (TokenInfo info : tokenInfos) {
                Matcher m = info.regex.matcher(s);
                if (m.find()) {
                    match = true;
                    // TODO ---- DO WE NEED TRIM????
                    String tok = m.group().trim();
                    s = m.replaceFirst("").trim();
                    tokens.add(new Token(info.tokenID, tok));
                    break;
                }
            }
            // If no rules match user input, throw an exception
            if (!match) throw new DBException("[ERROR]: Invalid query");
        }
    }

    // Returns list of tokens generated from running tokenize function
    public LinkedList<Token> returnTokens() {
        return tokens;
    }
}
