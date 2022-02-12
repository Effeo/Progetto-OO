package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;
import Model.Utente;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import com.toedter.calendar.JCalendar;

public class MyUtente extends JFrame {

	private JPanel contentPane;
	
	private JFrame myUtente;
	private JTextField NikName;
	private JTextField Nome;
	private JTextField Descrizione;
	private JTextField Email;
	private JTextField Cognome;
	private JTextField Password;
	private JTextField Nazione;
	private DefaultListModel dlm = new DefaultListModel();

	public MyUtente(JFrame home, Utente utente, Controller controller, boolean flag) {
		System.out.println("Sei in MyUtente");
		
		home.setVisible(false);
		myUtente=this;
		myUtente.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 697);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(224, 255, 255));
		setContentPane(contentPane);
		
		JLabel lblNickName = new JLabel("Nickname:");
		lblNickName.setFont(new Font("Arial", Font.PLAIN, 26));
		lblNickName.setBounds(10, 89, 144, 37);
		contentPane.add(lblNickName);
		
		JLabel lblMyUtente = new JLabel("Profilo di " + utente.getNickname());
		lblMyUtente.setHorizontalAlignment(SwingConstants.LEFT);
		lblMyUtente.setForeground(new Color(34, 139, 34));
		lblMyUtente.setFont(new Font("Arial", Font.PLAIN, 50));
		lblMyUtente.setBounds(10, 10, 647, 54);
		contentPane.add(lblMyUtente);
		
		NikName = new JTextField();
		NikName.setEditable(false);
		NikName.setFont(new Font("Arial", Font.PLAIN, 22));
		NikName.setColumns(10);
		NikName.setBounds(10, 122, 227, 45);
		contentPane.add(NikName);
		NikName.setText(utente.getNickname());
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 26));
		lblNome.setBounds(10, 179, 99, 37);
		contentPane.add(lblNome);
		
		Nome = new JTextField();
		Nome.setEditable(false);
		Nome.setFont(new Font("Arial", Font.PLAIN, 22));
		Nome.setColumns(10);
		Nome.setBounds(10, 214, 227, 45);
		contentPane.add(Nome);
		Nome.setText(utente.getNome());
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 26));
		lblEmail.setBounds(10, 365, 129, 37);
		contentPane.add(lblEmail);
		
		JLabel lblCognome = new JLabel("Cognome:");
		lblCognome.setFont(new Font("Arial", Font.PLAIN, 26));
		lblCognome.setBounds(10, 270, 144, 37);
		contentPane.add(lblCognome);
		
		JLabel lblDataN = new JLabel("Data di nascita:");
		lblDataN.setFont(new Font("Arial", Font.PLAIN, 26));
		lblDataN.setBounds(312, 311, 227, 37);
		contentPane.add(lblDataN);
		
		JLabel lblSesso = new JLabel("Sesso:");
		lblSesso.setFont(new Font("Arial", Font.PLAIN, 26));
		lblSesso.setBounds(312, 179, 99, 37);
		contentPane.add(lblSesso);
		
		JLabel lblDescrizione = new JLabel("Descrizione:");
		lblDescrizione.setFont(new Font("Arial", Font.PLAIN, 26));
		lblDescrizione.setBounds(312, 519, 227, 37);
		contentPane.add(lblDescrizione);
		
		JLabel lblIsAdmin = new JLabel("Admin:");
		lblIsAdmin.setFont(new Font("Arial", Font.PLAIN, 26));
		lblIsAdmin.setBounds(10, 595, 81, 37);
		contentPane.add(lblIsAdmin);
		
		JLabel lblNazione = new JLabel("Nazione:");
		lblNazione.setFont(new Font("Arial", Font.PLAIN, 26));
		lblNazione.setBounds(311, 89, 144, 37);
		contentPane.add(lblNazione);
		
		JLabel lblIsPremium = new JLabel("Premium:");
		lblIsPremium.setFont(new Font("Arial", Font.PLAIN, 26));
		lblIsPremium.setBounds(10, 554, 116, 37);
		contentPane.add(lblIsPremium);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 26));
		lblPassword.setBounds(10, 451, 159, 37);
		contentPane.add(lblPassword);
		
		Descrizione = new JTextField();
		Descrizione.setEditable(false);
		Descrizione.setFont(new Font("Arial", Font.PLAIN, 22));
		Descrizione.setColumns(10);
		Descrizione.setBounds(312, 567, 362, 45);
		contentPane.add(Descrizione);
		if(utente.getDescrizione() != null)
		{
			Descrizione.setText(utente.getDescrizione());
		}
		else
		{
			Descrizione.setText("Nessuna descrizione");
		}
		
		
		Email = new JTextField();
		Email.setEditable(false);
		Email.setFont(new Font("Arial", Font.PLAIN, 22));
		Email.setColumns(10);
		Email.setBounds(10, 398, 227, 45);
		contentPane.add(Email);
		Email.setText(utente.getMail());
		
		Cognome = new JTextField();
		Cognome.setEditable(false);
		Cognome.setFont(new Font("Arial", Font.PLAIN, 22));
		Cognome.setColumns(10);
		Cognome.setBounds(10, 309, 227, 45);
		contentPane.add(Cognome);
		Cognome.setText(utente.getCognome());
		
		Password = new JTextField();
		Password.setEditable(false);
		Password.setFont(new Font("Arial", Font.PLAIN, 22));
		Password.setColumns(10);
		Password.setBounds(10, 492, 227, 45);
		contentPane.add(Password);
		Password.setText(utente.getPassword());
		
		Nazione = new JTextField();
		Nazione.setEditable(false);
		Nazione.setFont(new Font("Arial", Font.PLAIN, 22));
		Nazione.setColumns(10);
		Nazione.setBounds(312, 122, 227, 45);
		contentPane.add(Nazione);
		Nazione.setText(utente.getNazione());
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(312, 214, 227, 88);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setFont(new Font("Arial", Font.PLAIN, 22));
		scrollPane.setViewportView(list);
		
		dlm.addElement(utente.getSesso());
		list.setModel(dlm);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(312, 353, 323, 147);
		contentPane.add(calendar);
		calendar.setDate(utente.getDatan());
		
		JButton btnConferma = new JButton("Conferma"); 
		btnConferma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Nome.setEditable(false);
				Cognome.setEditable(false);
				Descrizione.setEditable(false);
				Nazione.setEditable(false);
				list.setEnabled(false);
				btnConferma.setVisible(false);
			}
		});
		btnConferma.setForeground(Color.BLACK);
		btnConferma.setFont(new Font("Arial", Font.BOLD, 26));
		btnConferma.setBackground(new Color(0, 128, 0));
		btnConferma.setBounds(794, 179, 247, 37);
		contentPane.add(btnConferma);
		btnConferma.setVisible(false);
		
		JButton btnModifica = new JButton("Modifica");
		btnModifica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnConferma.setVisible(true);
				list.setEnabled(true);
				Nome.setEditable(true);
				Cognome.setEditable(true);
				Descrizione.setEditable(true);
				Nazione.setEditable(true);
				dlm.remove(0);
				dlm.addElement("Uomo");
				dlm.addElement("Donna");
				dlm.addElement("Transgender");
				dlm.addElement("Lampadina");
				dlm.addElement("Unicorno");
				list.setModel(dlm);
			}
		});
		btnModifica.setForeground(Color.BLACK);
		btnModifica.setFont(new Font("Arial", Font.BOLD, 26));
		btnModifica.setBackground(new Color(255, 99, 71));
		btnModifica.setBounds(794, 124, 247, 37);
		contentPane.add(btnModifica);
	
		JButton btnTornaIndietro = new JButton("Torna Indietro");
		btnTornaIndietro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				home.setVisible(true);
				System.out.println("Sono tornato in home");
				myUtente.dispose();
			}
		});
		btnTornaIndietro.setForeground(Color.BLACK);
		btnTornaIndietro.setFont(new Font("Arial", Font.BOLD, 26));
		btnTornaIndietro.setBackground(Color.RED);
		btnTornaIndietro.setBounds(794, 27, 249, 37);
		contentPane.add(btnTornaIndietro);
		
		JButton btnCancellaAccount = new JButton("Elimina Account");
		btnCancellaAccount.setForeground(Color.BLACK);
		btnCancellaAccount.setFont(new Font("Arial", Font.BOLD, 26));
		btnCancellaAccount.setBackground(new Color(255, 69, 0));
		btnCancellaAccount.setBounds(794, 75, 247, 37);
		contentPane.add(btnCancellaAccount);
		
		JCheckBox chckbxPremium = new JCheckBox("");
		chckbxPremium.setEnabled(false);
		chckbxPremium.setBounds(125, 565, 21, 21);
		contentPane.add(chckbxPremium);
		chckbxPremium.setSelected(utente.getIsIspremium());
		
		JCheckBox chckbxAdmin = new JCheckBox("");
		chckbxAdmin.setEnabled(false);
		chckbxAdmin.setBounds(125, 605, 21, 21);
		contentPane.add(chckbxAdmin);
		chckbxAdmin.setSelected(utente.getIsIsadmin());
		
		JButton btnPannelloAscolti = new JButton("Pannello ascolti");
		btnPannelloAscolti.setForeground(Color.BLACK);
		btnPannelloAscolti.setFont(new Font("Arial", Font.BOLD, 26));
		btnPannelloAscolti.setBackground(new Color(255, 165, 0));
		btnPannelloAscolti.setBounds(794, 595, 249, 37);
		contentPane.add(btnPannelloAscolti);
		
		btnModifica.setVisible(flag);
		btnCancellaAccount.setVisible(flag);
		btnPannelloAscolti.setVisible(utente.getIsIsadmin());
		list.setEnabled(false);
		calendar.setEnabled(false);
	}
}
