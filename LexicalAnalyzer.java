import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class LexicalAnalyzer here.
 *
 * @author ()
 * @version (a version number or a date)
 */
public final class LexicalAnalyzer {

    private List<Token> token;
    private String text;
    private int position;
    private char currentCharacter;
    private boolean eof; // if its end of file.
    private int index;
    
    /**
     * Create an analyzer for the given text, 
     * using the given factories to recognize and create tokens.
     * @param expression The text to analyze
     * @param factories The token factories to use
     */
    public LexicalAnalyzer(final String expression, final String
    factories) {
        this.token = new ArrayList<>();
    }
    // not completed
}
   
