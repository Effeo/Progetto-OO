package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JFrame signUp;
	private Controller controller;
	private JTextField nickNameField;
	private JTextField nomeField;
	private JTextField cognomeField;
	private JTextField textField_2;
	private JTextField DescrizioneField;
	private JTextField emailField;
	private JTextField textField_1;
	private JTextField textField_3;
	
	public SignUp(Controller controller, JFrame login) {
		setTitle("SignUp");
		System.out.println("Ti trovi in sign up");
		signUp = this;
		this.controller = controller;
		login.setVisible(false);
		this.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(224, 255, 255));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Registrazione nuovo utente");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(325, 11, 392, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NickName:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(78, 61, 136, 34);
		contentPane.add(lblNewLabel_1);
		
		nickNameField = new JTextField();
		nickNameField.setFont(new Font("Arial", Font.PLAIN, 22));
		nickNameField.setColumns(10);
		nickNameField.setBounds(78, 90, 311, 45);
		contentPane.add(nickNameField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 26));
		lblNewLabel_1_1.setBounds(78, 147, 136, 34);
		contentPane.add(lblNewLabel_1_1);
		
		nomeField = new JTextField();
		nomeField.setFont(new Font("Arial", Font.PLAIN, 22));
		nomeField.setColumns(10);
		nomeField.setBounds(78, 181, 311, 45);
		contentPane.add(nomeField);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cognome:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 26));
		lblNewLabel_1_1_1.setBounds(78, 237, 136, 34);
		contentPane.add(lblNewLabel_1_1_1);
		
		cognomeField = new JTextField();
		cognomeField.setFont(new Font("Arial", Font.PLAIN, 22));
		cognomeField.setColumns(10);
		cognomeField.setBounds(77, 269, 311, 45);
		contentPane.add(cognomeField);
		
		JLabel dataNField = new JLabel("Data di nascita:");
		dataNField.setFont(new Font("Arial", Font.PLAIN, 26));
		dataNField.setBounds(77, 325, 217, 34);
		contentPane.add(dataNField);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(77, 361, 311, 45);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Descrizione:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 26));
		lblNewLabel_1_1_1_1_1.setBounds(77, 417, 178, 34);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		DescrizioneField = new JTextField();
		DescrizioneField.setFont(new Font("Arial", Font.PLAIN, 22));
		DescrizioneField.setColumns(10);
		DescrizioneField.setBounds(77, 451, 311, 45);
		contentPane.add(DescrizioneField);
		
		JLabel lblNewLabel_2 = new JLabel("*");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel_2.setBounds(391, 90, 50, 46);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("*");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel_2_1.setBounds(391, 181, 50, 46);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("*");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel_2_2.setBounds(391, 269, 50, 46);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("*");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel_2_3.setBounds(391, 361, 50, 46);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("I campi con l'asterisco (*) sono obbligatori.");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 26));
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 583, 493, 34);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lbl = new JLabel("Email:");
		lbl.setFont(new Font("Arial", Font.PLAIN, 26));
		lbl.setBounds(519, 56, 136, 34);
		contentPane.add(lbl);
		
		emailField = new JTextField();
		emailField.setFont(new Font("Arial", Font.PLAIN, 22));
		emailField.setColumns(10);
		emailField.setBounds(519, 90, 311, 45);
		contentPane.add(emailField);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Password:");
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 26));
		lblNewLabel_1_1_2.setBounds(519, 147, 136, 34);
		contentPane.add(lblNewLabel_1_1_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(519, 181, 311, 45);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Conferma password:");
		lblNewLabel_1_1_2_1.setFont(new Font("Arial", Font.PLAIN, 26));
		lblNewLabel_1_1_2_1.setBounds(519, 237, 251, 34);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(519, 269, 311, 45);
		contentPane.add(textField_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Utente premium");
		rdbtnNewRadioButton.setBackground(new Color(224, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.PLAIN, 26));
		rdbtnNewRadioButton.setBounds(513, 335, 217, 34);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_2_4 = new JLabel("*");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_4.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel_2_4.setBounds(830, 91, 50, 46);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("*");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_5.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel_2_5.setBounds(830, 181, 50, 46);
		contentPane.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("*");
		lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_6.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel_2_6.setBounds(830, 268, 50, 46);
		contentPane.add(lblNewLabel_2_6);
		
		JButton confermaBTN = new JButton("Conferma");
		confermaBTN.setForeground(Color.BLACK);
		confermaBTN.setFont(new Font("Arial", Font.BOLD, 26));
		confermaBTN.setBackground(new Color(0, 128, 0));
		confermaBTN.setBounds(519, 449, 330, 45);
		contentPane.add(confermaBTN);
	}
}
