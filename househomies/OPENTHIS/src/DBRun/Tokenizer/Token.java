package DBRun.Tokenizer;

public class Token {
    private TokenEnum token;
    private String sequence;

    public Token(TokenEnum tokenID, String sequence) {
        super();
        this.token = tokenID;
        this.sequence = sequence;
    }

    public TokenEnum returnToken() {
        return token;
    }

    public String returnSequence() {
        return sequence;
    }

}