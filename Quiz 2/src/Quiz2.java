import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Quiz2 {

	private JFrame frame;
	private JTextField textFieldWeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz2 window = new Quiz2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quiz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 1137, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How much water should i drink?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel.setBounds(176, 44, 529, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("My weight (kg):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_1.setBounds(67, 136, 276, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setBounds(374, 133, 276, 45);
		frame.getContentPane().add(textFieldWeight);
		textFieldWeight.setColumns(10);
		
		JButton btnNewButton = new JButton("Tell Me");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 32));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int weight;
				double water;
				
				try {
					weight = Integer.parseInt(textFieldWeight.getText());
					water=weight*0.033;
					JOptionPane.showMessageDialog(null, "Buddy, you should drink " + water + "L of water a day!");
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Please enter a valid number (weight)");
				}

			}
		});
		btnNewButton.setBounds(326, 241, 197, 47);
		frame.getContentPane().add(btnNewButton);
	}
}
