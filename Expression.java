
import java.util.HashMap;
import java.util.Map;

/**
 * Write a description of class Expression here.
 *
 * @author (Kelvin Likollari)
 * @version (05.05.2021)
 */ // TODO: fix subclasses
public abstract class Expression
{
     private String name;
     private static Map<String, Node> variables  = new HashMap<>();
    
    
    public double evaluate(double x) {
        return x;
    }
    
     public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // assign the variable w a node.
    public static void store(Node o, String var) {
        variables.put(var, o);
    }
    
    
    
   
    
    
}
    
    /**
     * Evaluate this Expression.
     * @param storage The "memory" to use during the execution
     
    public void evaluate(final int x) {
        // to be implemented in subclasses
    }
    
    public Expression simplify() {
        // simplify the expression.
        // to be implemented in all the subclasses.
        return null;
    }
}
*/
  
