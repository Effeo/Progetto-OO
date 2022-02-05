package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;
import Model.Utente;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField emailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setBackground(new Color(0, 0, 0));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 667);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel emailLB = new JLabel("Email:");
		emailLB.setFont(new Font("Arial", Font.PLAIN, 26));
		emailLB.setBounds(559, 127, 99, 37);
		contentPane.add(emailLB);
		
		JLabel passwordLB = new JLabel("Password:");
		passwordLB.setFont(new Font("Arial", Font.PLAIN, 26));
		passwordLB.setBounds(559, 237, 151, 37);
		contentPane.add(passwordLB);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 22));
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setBounds(559, 274, 311, 45);
		contentPane.add(passwordField);
		
		emailField = new JTextField();
		emailField.setFont(new Font("Arial", Font.PLAIN, 22));
		emailField.setBounds(559, 165, 311, 45);
		contentPane.add(emailField);
		emailField.setColumns(10);
		
		JLabel lblLogin = new JLabel("PinoFy");
		lblLogin.setForeground(new Color(0, 191, 255));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 50));
		lblLogin.setBounds(559, 23, 273, 54);
		contentPane.add(lblLogin);
		
		JButton loginBTN = new JButton("Sign in");
		loginBTN.setForeground(new Color(0, 0, 0));
		loginBTN.setBackground(new Color(0, 128, 0));
		loginBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		loginBTN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Controller controller = new Controller();
				Utente u = controller.Login(emailField.getText(), passwordField.getText());
				
				if(u == null) 
				{
					JOptionPane.showMessageDialog(loginBTN, "Email o password errata");
				}
				else 
				{
					//Home home = new Home(frame, u, controller);
					System.out.println(u.getCognome());
				}
				
			}
		});
		loginBTN.setFont(new Font("Arial", Font.BOLD, 26));
		loginBTN.setBounds(559, 366, 314, 37);
		contentPane.add(loginBTN);
		
		JButton registratiBTN = new JButton("Sign up");
		registratiBTN.setBackground(new Color(220, 20, 60));
		registratiBTN.setFont(new Font("Arial", Font.BOLD, 26));
		registratiBTN.setBounds(559, 414, 314, 37);
		contentPane.add(registratiBTN);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 435, 607);
		contentPane.add(panel);
		panel.setLayout(null);
	}
}
