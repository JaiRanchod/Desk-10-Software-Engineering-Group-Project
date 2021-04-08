package DBRun.Parser;

import DBRun.DBException;import DBRun.Tokenizer.TokenEnum;


import static DBRun.Parser.Parser.*;

public class BNF {

    // TODO ------- NEED TO CHANGE NAMES OF ALL OF THESE BELOW AND MAYBE PUT IN NEW PACKAGE

    // Returns true if syntax is correct
    public static boolean BNFNameValueList() {
        if (BNFNameValuePair()) {
            progressToNextToken();
            if (presentToken.returnToken() == TokenEnum.COMMA) {
                progressToNextToken();
                return BNFNameValueList();
            }
            return true;
        }
        return false;
    }

    // Adds attributes to attributeList & values to valueList
    private static boolean BNFNameValuePair()  {
        if (presentToken.returnToken() == TokenEnum.CHARACTER) {
            columns.add(presentToken.returnSequence());
            progressToNextToken();
            if (presentToken.returnToken() == TokenEnum.EQUALS) {
                progressToNextToken();
                if (BNFValue()) {
                    elements.add(presentToken.returnSequence());
                    return true;
                }
            }
        }
        return false;
    }

    // Adds variables to valueList, and returns true if syntax is correct
    public static boolean BNFValueList() {
        if (BNFValue()) {
            elements.add(presentToken.returnSequence());
            progressToNextToken();
            if (presentToken.returnToken() == TokenEnum.COMMA) {
                progressToNextToken();
                return BNFValueList();
            }
            return true;
        }
        return false;
    }

    // Values can be any of: string, boolean or number
    private static boolean BNFValue() {
        return presentToken.returnToken() == TokenEnum.STRINGLITERAL ||
                presentToken.returnToken() == TokenEnum.TRUE ||
                presentToken.returnToken() == TokenEnum.FALSE ||
                presentToken.returnToken() == TokenEnum.NUMERATOR;
    }

    // Adds variables to attributeList, and returns true if syntax is correct
    public static boolean BNFAttributeList() {
        if (presentToken.returnToken() == TokenEnum.CHARACTER) {
            columns.add(presentToken.returnSequence());
            progressToNextToken();
            if (presentToken.returnToken() == TokenEnum.COMMA) {
                progressToNextToken();
                return BNFAttributeList();
            }
            return true;
        }
        return false;
    }

    // Returns true if a sequence of tokens represents a condition
    // e.g. (name == 'Bob')
    public static boolean BNFCondition() {
        // If single condition (no parentheses)
        if (presentToken.returnToken() == TokenEnum.CHARACTER) {
            conditions.addValue(presentToken.returnSequence());
            progressToNextToken();
            if (presentToken.returnToken() == TokenEnum.OPERATIVE) {
                conditions.addOperative(presentToken.returnSequence());
                progressToNextToken();
                if (BNFValue()) {
                    conditions.addValue(presentToken.returnSequence());
                    return true;
                }
            }
            throw new DBException("[ERROR]: Invalid query");
        }

        // If multiple conditions
        else if (presentToken.returnToken() == TokenEnum.LEFTPARENTHESIS) {
            progressToNextToken();
            if (BNFCondition()) {
                progressToNextToken();
                if (presentToken.returnToken() == TokenEnum.RIGHTPARENTHESIS) {
                    progressToNextToken();

                    if (presentToken.returnToken() == TokenEnum.RIGHTPARENTHESIS) {
                        // If multiple ')', add to conditionStack to tell it to evaluate the previous
                        // 2 condition results
                        conditions.addValue(presentToken.returnSequence());
                        previousToken();
                        return true;
                    }

                    // If AND or OR, add to value list
                    if (presentToken.returnToken() == TokenEnum.AND ||
                            presentToken.returnToken() == TokenEnum.OR) {
                        conditions.addValue(presentToken.returnSequence());
                        progressToNextToken();
                        return BNFCondition();
                    }

                    return presentToken.returnToken() == TokenEnum.SEMICOLON;
                }
            }
        }
        return false;
    }
}
