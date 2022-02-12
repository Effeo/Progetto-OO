package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;
import Model.Traccia;
import Model.Utente;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Pannello extends JFrame {

	private JPanel contentPane;
	private JTextField Utente;
	private JTextField Traccia;

	
	public Pannello(JFrame MyUtente, Controller controller) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 697);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(224, 255, 255));
		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("Zona Ricerca");
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setForeground(new Color(34, 139, 34));
		lblTitle.setFont(new Font("Arial", Font.PLAIN, 50));
		lblTitle.setBounds(0, 10, 325, 54);
		contentPane.add(lblTitle);
		
		Utente = new JTextField();
		Utente.setText("Insrisci qui l'Utente");
		Utente.setFont(new Font("Tahoma", Font.ITALIC, 21));
		Utente.setBounds(10, 157, 315, 54);
		contentPane.add(Utente);
		Utente.setColumns(10);
		
		Traccia = new JTextField();
		Traccia.setFont(new Font("Tahoma", Font.ITALIC, 21));
		Traccia.setText("Inserisci qui la traccia");
		Traccia.setColumns(10);
		Traccia.setBounds(10, 287, 315, 54);
		contentPane.add(Traccia);
		
		JLabel lblUtenteLabel = new JLabel("Inserisci un Utente");
		lblUtenteLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblUtenteLabel.setBounds(10, 103, 284, 44);
		contentPane.add(lblUtenteLabel);
		
		JLabel lblTraccialbl = new JLabel("Inserisci una Traccia");
		lblTraccialbl.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTraccialbl.setBounds(10, 233, 284, 44);
		contentPane.add(lblTraccialbl);
		
		JButton btnCerca = new JButton("Cerca");
		btnCerca.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnCerca.setBounds(90, 428, 143, 63);
		contentPane.add(btnCerca);
		// mo esco allora te la scrivo qui la cosa
		
		/* 
		 * appean clicca cerca si fanno 2 controlli,quindi 3 casi
		 * 1 in inserisciUtente sta il testo di default o un testo nullo
		 * 2 in inseriscitraccia sta il testo default o un testo nullo
		 * 3 sono entrambi field rimepiti
		 * 
		 * ora in abse ai casi si fanno il controller chiama il metodo takeAscolti con le seguetni query
		 * 
		 * 1 "Select titolo nikname fascia from ascolti,traccia where ascolto.codt=traccia.codt and traccia.titolo=traccia in input"
		 * 2 "Select titolo nikname fascia from ascolti where nikname= l'input dellacasellaUtente and traccia.codt=ascolto.codt"
		 * 3 "Select titolo,nikname,fascia from ascolto,traccia where nikname= inpute ella casella utente and ascolto.codt=traccia.codt and traccia.titolo=input della casella traccia"
		 * */
		

	}
}
