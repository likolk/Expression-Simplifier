
/**
 * Write a description of class Number here.
 *
 * @author ()
 * @version (05/05/21)
 */
public class Literal extends Expression
{
    private final int lit;

    /**
     * Constructor for objects of class Number
     */
    public Literal(final int lit)
    {
        // initialise instance variables
        super();
        this.lit = lit;
    }
    
    @Override
    public String toString() {
        return "'" + lit + "'";
    }
    
    public int getLiteral() {
        return lit;
    }
    
    
   
    
}
