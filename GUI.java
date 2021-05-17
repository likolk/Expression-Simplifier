import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
}
    
    
    
    
    
    
    
    