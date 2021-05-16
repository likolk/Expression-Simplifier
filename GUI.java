import java.awt.Color; 
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.image.BufferedImage; 
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon; 
import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JPanel; 
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUI
{
    public static int frameSizeX = 500;
    public static int frameSizeY = 500;
    public static int panelSizeX = 500;
    public static int panelSizeY = 500;
     
    public JFrame frame;
    public JPanel panel;
    
    
    /**
     * Constructor for the Gui class.
     * @param chessBoard  the chessBoard created.
     */
    //we have a 8x8 grid aka matrix.
    public GUI(final Expression expression) 
    { 
        frame = new JFrame("Chess");
        // something jere
        setPanel();
        // here too 
        /*startFrame();*/
        frame.add(panel);
    }
    
    
    /**
     * the method set a panel for the Gui.
     */
    public void setPanel() {
        panel = new JPanel();
        panel.setSize(panelSizeX, panelSizeY);
        panel.setLayout(new GridLayout(8,8));
    }
}
    