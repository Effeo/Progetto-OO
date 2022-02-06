package Controller;

import java.sql.Date;

import ImplementazioniDao.*;
import Model.*;

public class Controller {
	private Utente u;
	private UtenteImplementazioneDao ui;
	
	public Controller() {
		ui = new UtenteImplementazioneDao();
	}
	
	public Utente login(String email, String password)
	{
		u = ui.login(email, password);
		
		return u;
	}
	
	public int signUp(String nickname, String mail, String password, String nome, String cognome, String nazione,
			String descrizione, Date datan, boolean isPremium, boolean isAdmin)
	{
		int esito;
		
		esito = ui.sign_Up(nickname, mail, password, nome, cognome, nazione, descrizione, datan, isPremium, isAdmin);
		
		return esito;
	}
}
