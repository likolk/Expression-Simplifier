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
 * Write a description of class Jexpression here.
 *
 * @author (Kelvin Likollari)
 * @version (04.06.2021)
 */
public class Jexpression extends JFrame {

	private JPanel contentPane;
	private JTextField textExpres;
	static Jtree jtree = new Jtree();
	JPanel panel = new JPanel();
	public ExpTree tests ;  

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

	/**
	 * Create the frame.
	 */
	public Jexpression() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 0, 499, 306);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insert your Math expression");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(76, 26, 289, 33);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(76, 86, 312, 40);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textExpres = new JTextField();
		textExpres.setBounds(0, 0, 312, 40);
		panel_1.add(textExpres);
		textExpres.setColumns(10);
		
		JLabel result = new JLabel("");
		result.setBounds(76, 132, 312, 33);
		result.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(result);
		
		JButton btnNewButton = new JButton("Generator");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String Ex = textExpres.getText();
				Ex = Ex.replaceAll("\\s+", "");
				boolean resul =  validExpression.checkValid(Ex.toCharArray());
				
				if(resul == false) {
					result.setForeground(Color.RED);
					
					result.setText("Expression not valid");
				}
				else {
					 //Jexpression.this.setVisible(false);
					 Parser p = new Parser(Ex); // redefined, see below 
		             //System.out.println(p.toString());
		             ExpTree myTree;
		             myTree = p.parseLine ();
					 TreeView view = new TreeView (myTree);
			         jtree.tree.add(view);
					 jtree.tree.revalidate ();
					 jtree.setVisible(true);
					
				}
			}
		});
	
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(144, 185, 145, 33);
		panel.add(btnNewButton);
		
	JLabel lblNewLabel_4 = new JLabel("(c) Kelvin Likollari");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setForeground(new Color(255, 45, 0));
        lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 18));
        lblNewLabel_4.setBounds(150, -30, 367, 85);
        panel.add(lblNewLabel_4);
	}
}
