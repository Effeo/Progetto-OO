package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.*;
import Controller.*;

public class Home extends JFrame {

	private JPanel contentPane;
	private JFrame login;
	private Utente u;
	private Controller controller;
	/**
	 * Create the frame.
	 */
	public Home(JFrame login, Utente u, Controller controller) {
		this.login = login;
		this.u = u;
		this.controller = controller;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1066, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
