
/**
 * Write a description of class ParseException here.
 *
 * @author (Kelvin Likollari)
 * @version (04.06.2021)
 */
public class ParseException extends RuntimeException { 
    public ParseException(String s) { 
        super("Invalid expression: " + s);
    }
}
