package Controller;

import ImplementazioniDao.*;
import Model.*;

public class Controller {
	private Utente u;
	
	public Controller() {}
	
	public Utente Login(String email, String password)
	{
		UtenteImplementazioneDao ui = new UtenteImplementazioneDao();
		u = ui.Login(email, password);
		
		return u;
	}

}
