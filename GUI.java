import javax.swing.JFrame;
import javax.swing.JPanel; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

/**
 * Write a description of class GUI here.
 *
 * @author ()
 * @version (a version number or a date)
 */
public class GUI
{
    // size of the window that is going to 
    // represent the expression simplification instead.
    private static int frameSizeX = 1000;
    private static int frameSizeY = 1000;
    
    private static int panelSizeX = 1000;
    private static int panelSizeY = 1000;
     
    private JFrame frame;
    private JPanel panel;
    
    private GridBagConstraints constraint;
    
    private ExpressionWindow expression;
    
    
    public GUI(final ExpressionWindow expression)
    {
        frame = new JFrame("Expression Simolifier Game");
        this.expression = expression;
    }
    
    /**
     * Method that generates the starting frame shown to user in 
     * the beginning.
     */
    public void startFrame() {
        frame = new JFrame("Expression Simplifier Game!");
        frame.setLayout(new GridLayout());
        frame.setSize(frameSizeX, frameSizeY);
        frame.show();
        
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
    
    /**
     * A method that sets the panel for the GUI
     */
    public void setPanel() {
        panel = new JPanel();
        // step 2 size of panel
        // it will be x by y
        panel.setSize(panelSizeX, panelSizeY);
        panel.setLayout(new GridLayout(10,10));
    }
    
    /**
     * Refreshes the panel after every click.
     */
    public void refreshFrameAfterEveryClick() {
        frame.getContentPane().remove(panel);
        setPanel();
        frame.add(panel);
        panel.revalidate();
        panel.repaint();
    }
  
}
    
    
    
    
    
    
    
    