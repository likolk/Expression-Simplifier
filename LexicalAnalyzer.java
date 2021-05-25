
/**
 * Write a description of class LexicalAnalyzer here.
 *
 * @author ()
 * @version (a version number or a date)
 */
public final class LexicalAnalyzer {

    private Token token;
    private String text;
    private int position;
    
    /**
     * Create an analyzer for the given text, 
     * using the given factories to recognize and create tokens.
     * @param expression The text to analyze
     * @param factories The token factories to use
     */
    public LexicalAnalyzer(final String expression) {
        //
    }

    /**
     * Get the current token.
     * @return the current token
     */
    public Token getCurrentToken() {
        return token;
    }
    
    // Scan the text and extract the following token
    public Token scanToken() {
        return null;
    }
}
     