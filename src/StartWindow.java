import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;


public class StartWindow {

	private JFrame frame;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField textPledgeAmt;
	private JTextField textMemo;
	private JTable tableOutput;
	private JTextField textEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartWindow window = new StartWindow();
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
	public StartWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(204, 51, 0));
		frame.setBounds(100, 100, 603, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnFile.add(mntmExit);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFirstName.setBounds(10, 16, 100, 14);
		frame.getContentPane().add(lblFirstName);
		
		textFirstName = new JTextField();
		textFirstName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFirstName.setBounds(10, 46, 151, 20);
		frame.getContentPane().add(textFirstName);
		textFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(255, 255, 255));
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLastName.setBounds(10, 82, 100, 14);
		frame.getContentPane().add(lblLastName);
		
		textLastName = new JTextField();
		textLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textLastName.setBounds(10, 112, 151, 20);
		frame.getContentPane().add(textLastName);
		textLastName.setColumns(10);
		
		JLabel lblPledgeAmount = new JLabel("Pledge Amount");
		lblPledgeAmount.setForeground(new Color(255, 255, 255));
		lblPledgeAmount.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPledgeAmount.setBounds(10, 148, 151, 14);
		frame.getContentPane().add(lblPledgeAmount);
		
		textPledgeAmt = new JTextField();
		textPledgeAmt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPledgeAmt.setBounds(10, 178, 151, 20);
		frame.getContentPane().add(textPledgeAmt);
		textPledgeAmt.setColumns(10);
		
		JLabel lblCharityName = new JLabel("Charity Name");
		lblCharityName.setForeground(new Color(255, 255, 255));
		lblCharityName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCharityName.setBounds(10, 214, 151, 14);
		frame.getContentPane().add(lblCharityName);
		
		JLabel lblMemo = new JLabel("Memo");
		lblMemo.setForeground(new Color(255, 255, 255));
		lblMemo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMemo.setBounds(10, 346, 151, 14);
		frame.getContentPane().add(lblMemo);
		
		textMemo = new JTextField();
		textMemo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textMemo.setBounds(10, 376, 151, 20);
		frame.getContentPane().add(textMemo);
		textMemo.setColumns(10);
		
		tableOutput = new JTable();
		tableOutput.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tableOutput.setBounds(246, 39, 311, 357);
		frame.getContentPane().add(tableOutput);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEnter.setBounds(10, 412, 89, 23);
		frame.getContentPane().add(btnEnter);
		
		JComboBox cmbboxCharity = new JComboBox();
		cmbboxCharity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cmbboxCharity.setBounds(10, 244, 151, 20);
		frame.getContentPane().add(cmbboxCharity);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmail.setBounds(10, 280, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(10, 310, 151, 20);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
	}
}
