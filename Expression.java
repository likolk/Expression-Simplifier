/**
 * Write a description of class Expression here.
 *
 * @author (Kelvin Likollari)
 * @version (05.05.2021)
 */
public abstract class Expression extends Node
{
    private Expression expression1;
    private Expression expression2;
    /**
     * Evaluate this Expression.
     * @param storage The "memory" to use during the execution
     */
    public void evaluate(final int x) {
        // to be implemented in subclasses
    }
    
    public Expression simplify() {
        // simplify the expression.
        // to be implemented in all the subclasses.
        return null;
    }
}
  
