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
		
	}

}
