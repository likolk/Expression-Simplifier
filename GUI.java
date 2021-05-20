import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 * Write a description of class GUI here.
 *
 * @author (Kelvin Likollari)
 * @version (a version number or a date)
 */
public class GUI
{
    // size of the window that is going to 
    // represent the expression simplification instead.
    public static int frameSizeX = 500;
    public static int frameSizeY = 500;
    
    public static int panelSizeX = 500;
    public static int panelSizeY = 500;
     
    public JFrame frame;
    public JPanel panel;
    
    public GUI(final ExpressionWindow expression)
    {
        frame = new JFrame("Expression Simolifier Game");
        // add also width, height of the window that will be
        // showing the expressions.
    }
    
    /**
     * Method that generates the initial frame.
     */
    public void startFrame() {
        frame = new JFrame("Expression Simolifier Game");
        frame.setSize(frameSizeX, frameSizeY);
        // more code to be added
    }
    
    /**
     * Shows A JOptionPane with a message requiring a text input.
     *
     * @param  message the message prompting the user what to enter
     * @return the value entered by the user
     */
    public String textInputFromUser(final String message) 
    {
        return JOptionPane.showInputDialog(message);
    }
    
    /**
     * Prints a message in the command line.
     *
     * @param message the message to be printed in the command line
     */
    public void printMessage (final String message) {
        System.out.println(message);
    }
    
    /**
     * A method that asks a question to the player (for example, 
     * wanna try again with different inputs?)
     * etc and acts accordingly.
     * @param title the title of the appearing window ("Question)
     * @param message the question asked to the user.
     * @return true if the player clicks on the yes button,
     * in any other case, return false.
     */
    public boolean questionAskedToUser(final String title,
    final String message) {
        // if (JOptionPane.YES_OPTION == 
        return false; // return a default value until to think
        // of how to implement this method.
    }
    
    
    
    
}
    
    
    
    
    
    
    
    