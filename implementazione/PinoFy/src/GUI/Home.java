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
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import Model.*;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField ricercaField;
	private ArrayList<Traccia> tracce;
	private JFrame home;
	private JButton btnAscolta = new JButton("Ascolta");
	private JButton btnVota = new JButton("Vota");
	private JButton btnDettagli = new JButton("Dettagli");
	
	public Home(JFrame login, Utente utente, Controller controller) 
	{
		login.setVisible(false);
		home = this;
		home.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(224, 255, 255));
		setContentPane(contentPane);
		
		JLabel lblRicerca = new JLabel("Ricerca:");
		lblRicerca.setFont(new Font("Arial", Font.PLAIN, 26));
		lblRicerca.setBounds(10, 192, 99, 37);
		contentPane.add(lblRicerca);
		
		ricercaField = new JTextField();
		ricercaField.setFont(new Font("Arial", Font.PLAIN, 22));
		ricercaField.setColumns(10);
		ricercaField.setBounds(10, 225, 453, 45);
		contentPane.add(ricercaField);
		
		JButton btnCercaAlbum = new JButton("Cerca Album");
		btnCercaAlbum.setForeground(Color.BLACK);
		btnCercaAlbum.setFont(new Font("Arial", Font.BOLD, 26));
		btnCercaAlbum.setBackground(new Color(176, 196, 222));
		btnCercaAlbum.setBounds(10, 344, 314, 37);
		contentPane.add(btnCercaAlbum);
		
		JButton btnCercaArtisti = new JButton("Cerca Artisti");
		btnCercaArtisti.setForeground(Color.BLACK);
		btnCercaArtisti.setFont(new Font("Arial", Font.BOLD, 26));
		btnCercaArtisti.setBackground(new Color(176, 196, 222));
		btnCercaArtisti.setBounds(10, 392, 314, 37);
		contentPane.add(btnCercaArtisti);
		
		JButton btnCercaPlaylist = new JButton("Cerca Playlist");
		btnCercaPlaylist.setForeground(Color.BLACK);
		btnCercaPlaylist.setFont(new Font("Arial", Font.BOLD, 26));
		btnCercaPlaylist.setBackground(new Color(176, 196, 222));
		btnCercaPlaylist.setBounds(10, 440, 314, 37);
		contentPane.add(btnCercaPlaylist);
		
		JButton btnCercaUtenti = new JButton("Cerca Utenti");
		btnCercaUtenti.setForeground(Color.BLACK);
		btnCercaUtenti.setFont(new Font("Arial", Font.BOLD, 26));
		btnCercaUtenti.setBackground(new Color(176, 196, 222));
		btnCercaUtenti.setBounds(10, 488, 314, 37);
		contentPane.add(btnCercaUtenti);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblHome.setForeground(new Color(34, 139, 34));
		lblHome.setFont(new Font("Arial", Font.PLAIN, 50));
		lblHome.setBounds(20, 11, 273, 54);
		contentPane.add(lblHome);
		
		JLabel lblHome_1 = new JLabel("Benvenuto " + utente.getNickname());
		lblHome_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblHome_1.setForeground(Color.BLACK);
		lblHome_1.setFont(new Font("Arial", Font.PLAIN, 38));
		lblHome_1.setBounds(20, 90, 701, 54);
		contentPane.add(lblHome_1);
		
		JButton btnLeMiePlaylist = new JButton("Le mie Playlist");
		btnLeMiePlaylist.setForeground(Color.BLACK);
		btnLeMiePlaylist.setFont(new Font("Arial", Font.BOLD, 26));
		btnLeMiePlaylist.setBackground(new Color(240, 230, 140));
		btnLeMiePlaylist.setBounds(727, 28, 314, 37);
		contentPane.add(btnLeMiePlaylist);
		
		JButton btnEsciDallaccount = new JButton("Esci dall'account");
		btnEsciDallaccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login.setVisible(true);
				System.out.println("Ti trovi in login");
				home.dispose();
			}
		});
		btnEsciDallaccount.setForeground(Color.BLACK);
		btnEsciDallaccount.setFont(new Font("Arial", Font.BOLD, 26));
		btnEsciDallaccount.setBackground(Color.RED);
		btnEsciDallaccount.setBounds(727, 124, 314, 37);
		contentPane.add(btnEsciDallaccount);
		
		JButton btnIlMioProfilo = new JButton("Il mio profilo");
		btnIlMioProfilo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnIlMioProfilo.setForeground(Color.BLACK);
		btnIlMioProfilo.setFont(new Font("Arial", Font.BOLD, 26));
		btnIlMioProfilo.setBackground(new Color(0, 128, 0));
		btnIlMioProfilo.setBounds(727, 76, 314, 37);
		contentPane.add(btnIlMioProfilo);
		
		
		btnAscolta.setForeground(Color.BLACK);
		btnAscolta.setFont(new Font("Arial", Font.BOLD, 26));
		btnAscolta.setBackground(new Color(244, 164, 96));
		btnAscolta.setBounds(685, 488, 154, 37);
		contentPane.add(btnAscolta);
		btnAscolta.setVisible(false);
		
		btnVota.setForeground(Color.BLACK);
		btnVota.setFont(new Font("Arial", Font.BOLD, 26));
		btnVota.setBackground(new Color(244, 164, 96));
		btnVota.setBounds(869, 488, 154, 37);
		contentPane.add(btnVota);
		btnVota.setVisible(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(494, 225, 529, 238);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setFont(new Font("Arial", Font.PLAIN, 22));
		scrollPane.setViewportView(list);
		list.setVisible(false);
		scrollPane.setVisible(false);
		
		
		
		JLabel lblInserisciVoto = new JLabel("Inserisci voto:");
		lblInserisciVoto.setFont(new Font("Arial", Font.PLAIN, 26));
		lblInserisciVoto.setBounds(494, 543, 227, 37);
		contentPane.add(lblInserisciVoto);
		lblInserisciVoto.setVisible(false);
		
		JRadioButton rb1 = new JRadioButton("1");
		rb1.setFont(new Font("Arial", Font.PLAIN, 26));
		rb1.setBackground(new Color(224, 255, 255));
		rb1.setBounds(494, 587, 44, 34);
		contentPane.add(rb1);
		rb1.setVisible(false);
		
		JRadioButton rb2 = new JRadioButton("2");
		rb2.setFont(new Font("Arial", Font.PLAIN, 26));
		rb2.setBackground(new Color(224, 255, 255));
		rb2.setBounds(540, 587, 44, 34);
		contentPane.add(rb2);
		rb2.setVisible(false);
		
		JRadioButton rb3 = new JRadioButton("3");
		rb3.setFont(new Font("Arial", Font.PLAIN, 26));
		rb3.setBackground(new Color(224, 255, 255));
		rb3.setBounds(586, 587, 44, 34);
		contentPane.add(rb3);
		rb3.setVisible(false);
		
		JRadioButton rb4 = new JRadioButton("4");
		rb4.setFont(new Font("Arial", Font.PLAIN, 26));
		rb4.setBackground(new Color(224, 255, 255));
		rb4.setBounds(632, 587, 44, 34);
		contentPane.add(rb4);
		rb4.setVisible(false);
		
		JRadioButton rb5 = new JRadioButton("5");
		rb5.setFont(new Font("Arial", Font.PLAIN, 26));
		rb5.setBackground(new Color(224, 255, 255));
		rb5.setBounds(685, 587, 44, 34);
		contentPane.add(rb5);
		rb5.setVisible(false);
		
		JRadioButton rb6 = new JRadioButton("6");
		rb6.setFont(new Font("Arial", Font.PLAIN, 26));
		rb6.setBackground(new Color(224, 255, 255));
		rb6.setBounds(727, 587, 44, 34);
		contentPane.add(rb6);
		rb6.setVisible(false);
		
		JRadioButton rb7 = new JRadioButton("7");
		rb7.setFont(new Font("Arial", Font.PLAIN, 26));
		rb7.setBackground(new Color(224, 255, 255));
		rb7.setBounds(773, 587, 44, 34);
		contentPane.add(rb7);
		rb7.setVisible(false);
		
		JRadioButton rb8 = new JRadioButton("8");
		rb8.setFont(new Font("Arial", Font.PLAIN, 26));
		rb8.setBackground(new Color(224, 255, 255));
		rb8.setBounds(819, 587, 44, 34);
		contentPane.add(rb8);
		rb8.setVisible(false);
		
		JRadioButton rb9 = new JRadioButton("9");
		rb9.setFont(new Font("Arial", Font.PLAIN, 26));
		rb9.setBackground(new Color(224, 255, 255));
		rb9.setBounds(869, 587, 44, 34);
		contentPane.add(rb9);
		rb9.setVisible(false);
		
		JRadioButton rb10 = new JRadioButton("10");
		rb10.setFont(new Font("Arial", Font.PLAIN, 26));
		rb10.setBackground(new Color(224, 255, 255));
		rb10.setBounds(915, 587, 53, 34);
		contentPane.add(rb10);
		rb10.setVisible(false);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		group.add(rb3);
		group.add(rb4);
		group.add(rb5);
		group.add(rb6);
		group.add(rb7);
		group.add(rb8);
		group.add(rb9);
		group.add(rb10);
		
		JButton btnCercaTracce = new JButton("Cerca Tracce");
		btnCercaTracce.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(utente.getIsIspremium() || utente.getIsIsadmin())
				{
					tracce = controller.takeTraccia("SELECT * FROM TRACCIA WHERE TITOLO = '"+ ricercaField.getText() + "'");
					btnVota.setVisible(true);
					lblInserisciVoto.setVisible(true);
					rb1.setVisible(true);
					rb2.setVisible(true);
					rb3.setVisible(true);
					rb4.setVisible(true);
					rb5.setVisible(true);
					rb6.setVisible(true);
					rb7.setVisible(true);
					rb8.setVisible(true);
					rb9.setVisible(true);
					rb10.setVisible(true);
				}
				else
				{
					tracce = controller.takeTraccia("SELECT * FROM TRACCIA WHERE TITOLO = '"+ ricercaField.getText() + "' AND qualita = 128;");
					
				}
				System.out.println(tracce.size());
				if(tracce.size() != 0)
				{
					btnDettagli.setVisible(true);
					btnAscolta.setVisible(true);
					scrollPane.setVisible(true);
					list.setVisible(true);
					
					int i;
					DefaultListModel mdl = new DefaultListModel();
					for(i = 0; i < tracce.size(); i++)
					{
						mdl.addElement(""+ tracce.get(i).getTitolo() + ", " + tracce.get(i).getFormato() + ", " + tracce.get(i).getQualita());
					}
					
					list.setModel(mdl);
				}
				else
				{
					JOptionPane.showMessageDialog(btnCercaTracce, "Non esistono tracce con il titolo inserito");
				}
			}
		});
		btnCercaTracce.setForeground(Color.BLACK);
		btnCercaTracce.setFont(new Font("Arial", Font.BOLD, 26));
		btnCercaTracce.setBackground(new Color(176, 196, 222));
		btnCercaTracce.setBounds(10, 296, 314, 37);
		contentPane.add(btnCercaTracce);
		
		btnDettagli.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(list.getSelectedIndex() != -1)
				{
					DettagliTraccia dettagliTraccia = new DettagliTraccia(home, tracce.get(list.getSelectedIndex()), controller, null);
					ricercaField.setText("");
					list.setVisible(false);
					scrollPane.setVisible(false);
					btnDettagli.setVisible(false);
					btnAscolta.setVisible(false);
					btnVota.setVisible(false);
					lblInserisciVoto.setVisible(false);
					rb1.setVisible(false);
					rb2.setVisible(false);
					rb3.setVisible(false);
					rb4.setVisible(false);
					rb5.setVisible(false);
					rb6.setVisible(false);
					rb7.setVisible(false);
					rb8.setVisible(false);
					rb9.setVisible(false);
					rb10.setVisible(false);
					
				}
			}
		});
		
		btnDettagli.setForeground(Color.BLACK);
		btnDettagli.setFont(new Font("Arial", Font.BOLD, 26));
		btnDettagli.setBackground(new Color(244, 164, 96));
		btnDettagli.setBounds(494, 488, 154, 37);
		contentPane.add(btnDettagli);
		btnDettagli.setVisible(false);
		
	}
}
