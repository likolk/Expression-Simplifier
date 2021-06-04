
/**
 * Class ParseExpression
 *
 * @author (KL)
 * @version ()
 */
public class ParseException extends RuntimeException { 
    public ParseException(String s) { 
        super("Invalid expression: " + s);
    }
}
