import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * This class contains the main method that is the entry point where the expression
 * simplifier application starts executing. The main method creates the model, then 
 * creates the User Interface by passing the model to the UI, so that the UI will know
 * the model, and lastly makes the User Interface visible.
 */
public class Main {
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jexpression frame = new Jexpression();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}