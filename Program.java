import java.util.ArrayList;
/**
 * Write a description of class Program here.
 *
 * @author (Kelvin Likollari)
 * @version (a version number or a date)
 */
public class Program extends Instruction
{
    private final ArrayList<Instruction> code;
    
    /**
     * A new empty program.
     */
    public Program() {
        this.code = new ArrayList<Instruction>();
    }
    
    // appends the instruction to the code/program
    public void append(final Instruction instruction) {
        code.add(instruction);
    }
    
    // more methods following
    
    
    
}
