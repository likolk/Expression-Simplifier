import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import java.awt.Color;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 * Write a description of class Jtree here.
 *
 * @author (Kelvin Likollari)
 * @version (04.06.2021)
 */
public class Jtree extends JFrame {

	private JPanel contentPane;
	JLabel test = new JLabel("");
	JPanel tree = new JPanel();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jtree frame = new Jtree();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jtree() {
	    this.addKeyListener(new KeyAdapter() {
	        public void keyPressed(KeyEvent e) {
	            if (e.getKeyChar() == 'd' || e.getKeyChar() == 'r') {
	                System.exit(0);
	               }
	           }
	       });
	   
	    
	    
	    
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 0, 688, 407);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("The Tree  for your Expression is : ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(117, 23, 474, 43);
		panel.add(lblNewLabel);
		
		
		test.setBounds(168, 77, 348, 25);
		panel.add(test);
		
		
		tree.setBounds(10, 113, 668, 286);
		tree.setLayout (new BorderLayout());
		tree.setBorder (BorderFactory.createEtchedBorder ()); 
		panel.add(tree);
		
	JLabel lblNewLabel_4 = new JLabel("(c) Kelvin Likollari");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setForeground(new Color(255, 45, 0));
        lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 18));
        lblNewLabel_4.setBounds(150, -30, 367, 85);
        panel.add(lblNewLabel_4);
	}
	

}
