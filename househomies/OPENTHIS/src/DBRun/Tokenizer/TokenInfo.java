package DBRun.Tokenizer;

import DBRun.Tokenizer.TokenEnum;

import java.util.regex.Pattern;

// Private class used to store the rules that the tokenizer will follow
// e.g. If the expression "USE" is found, create token and assign it tokenID
public class TokenInfo {
    // regex = regular expression (string) that tokenizer is matching input against
    public final Pattern regex;
    public final TokenEnum tokenID;

    // Constructor
    public TokenInfo(Pattern regex, TokenEnum token) {
        super();
        this.regex = regex;
        this.tokenID = token;
    }
}
