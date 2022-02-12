package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Controller;
import Model.Album;

public class DettagliAlbum extends JFrame {

	private JPanel contentPane;
	private JFrame dettagliAlbum;
	
	public DettagliAlbum(JFrame home, Controller controller, Album album, JFrame indietro) 
	{
		home.setVisible(false);
		dettagliAlbum = this;
		dettagliAlbum.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1067, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(224, 255, 255));
		setContentPane(contentPane);
	}

}
