import java.util.HashMap;
import java.util.Map;
/**
 * Write a description of class Variable here.
 *
 * @author ()
 * @version (a version number or a date)
 */
public class Variable extends Expression
{
   private String name;
   private Map<String, Node> storedVariables = new HashMap<>();
   public Variable() {
       // super(null,null);
       this.name = name;
    }
    
    public Variable(String name) {
        if (name.equals("")) {
        this.name = name;
    }
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
    public double eval(double x) {
        return x;
    }

    public boolean equals(Node other) {
        return false;
    }
    
    
}

// more methods to follow
        