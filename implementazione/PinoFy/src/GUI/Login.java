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
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel emailLB = new JLabel("Email:");
		emailLB.setFont(new Font("Arial", Font.PLAIN, 33));
		emailLB.setBounds(162, 172, 99, 37);
		contentPane.add(emailLB);
		
		JLabel passwordLB = new JLabel("Password:");
		passwordLB.setFont(new Font("Arial", Font.PLAIN, 33));
		passwordLB.setBounds(99, 220, 151, 37);
		contentPane.add(passwordLB);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 22));
		passwordField.setHorizontalAlignment(SwingConstants.LEFT);
		passwordField.setBounds(262, 223, 205, 28);
		contentPane.add(passwordField);
		
		emailField = new JTextField();
		emailField.setFont(new Font("Arial", Font.PLAIN, 22));
		emailField.setBounds(262, 175, 205, 28);
		contentPane.add(emailField);
		emailField.setColumns(10);
		
		JLabel lblLogin = new JLabel("PinoFy");
		lblLogin.setForeground(new Color(0, 191, 255));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 50));
		lblLogin.setBounds(148, 30, 273, 54);
		contentPane.add(lblLogin);
		
		JButton loginBTN = new JButton("Login");
		loginBTN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Controller controller = new Controller();
				Utente u = controller.Login(emailField.getText(), passwordField.getText());
				
				
			}
		});
		loginBTN.setFont(new Font("Arial", Font.PLAIN, 31));
		loginBTN.setBounds(218, 287, 177, 54);
		contentPane.add(loginBTN);
		
		JButton registratiBTN = new JButton("Registrati");
		registratiBTN.setFont(new Font("Arial", Font.PLAIN, 31));
		registratiBTN.setBounds(218, 352, 177, 54);
		contentPane.add(registratiBTN);
	}
}
