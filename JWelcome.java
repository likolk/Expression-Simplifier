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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Write a description of class JWelcome here.
 *
 * @author (Kelvin Likollari)
 * @version (04.06.2021)
 */
public class JWelcome extends JFrame {
    private JPanel contentPane;
    /**
     * The following method launches the application.
     * Call the following method on this class when you are in the initial BlueJ screen,
     * if you want to start the game
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JWelcome frame = new JWelcome();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * This method creates the frame
     */
    public JWelcome() {
        Jexpression ex = new Jexpression();
        ex.setVisible(false);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_SPACE) {
                    // https://stackoverflow.com/questions/13360430/jframe-dispose-vs-system-exit
                    JWelcome.this.dispose();
                    ex.setVisible(true);
                }
            }
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.activeCaption);
        panel.setBounds(0, 0, 434, 261);
        contentPane.add(panel);
        panel.setLayout(null);
        
        
        JLabel lblNewLabel_3 = new JLabel("Welcome to");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setForeground(new Color(0, 0, 128));
        lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 18));
        lblNewLabel_3.setBounds(34, 20, 367, 83);
        panel.add(lblNewLabel_3);
        
        
        JLabel lblNewLabel = new JLabel("Expression Simplifier Game");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(new Color(0, 0, 128));
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
        lblNewLabel.setBounds(34, 41, 367, 83);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Hit ENTER or [Space]");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setForeground(new Color(0, 0, 128));
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
        lblNewLabel_1.setBounds(96, 110, 234, 78);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("to continue");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setForeground(new Color(0, 0, 128));
        lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
        lblNewLabel_2.setBounds(96, 130, 234, 78);
        panel.add(lblNewLabel_2);
    }
}
               