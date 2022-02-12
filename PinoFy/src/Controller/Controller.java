package Controller;

import java.security.Timestamp;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

import ImplementazioniDao.*;
import Model.*;

public class Controller {
	private Utente u;
	private UtenteImplementazioneDao ui;
	private TracciaImplementazioneDao ti;
	private AlbumImplementazioneDao ai;
	private AscoltoImplementazioneDao asi;
	
	public Controller() {
		ui = new UtenteImplementazioneDao();
		ti = new TracciaImplementazioneDao();
		ai = new AlbumImplementazioneDao();
		asi = new AscoltoImplementazioneDao();
	}
	
	public Utente login(String email, String password)
	{
		u = ui.login(email, password);
		
		return u;
	}
	
	public int signUp(String nickname, String mail, String password, String nome, String cognome, String nazione,
			String descrizione, String sesso, String datan, String isPremium, String isAdmin)
	{
		int esito;
		
		esito = ui.sign_Up(nickname, mail, password, nome, cognome, nazione, descrizione, sesso, datan, isPremium, isAdmin);
		
		return esito;
	}
	
	public boolean checkEmail(String email)
	{
		boolean esito = ui.checkEmail(email);
		
		return esito;
	}
	
	public boolean checkNickName(String nickName)
	{
		boolean esito = ui.checkNickName(nickName);
		
		return esito;
	}
	
	public ArrayList<Traccia> takeTraccia(String query)
	{
		ArrayList<Traccia> tracce = null;
		
		tracce = ti.takeTraccia(query);
		
		return tracce;
	}
	
	public ArrayList<Album> takeAlbum(String query, boolean flag)
	{
		ArrayList<Album> album = ai.takeAlbum(query, flag);
		
		return album;
	}
	
	public int insertAscolto(Traccia traccia, Utente utente, Timestamp tempo)
	{
		int esito = 0;
		int ora = (int) Math.ceil(tempo.getTimestamp().getHours() / 6);
		
		String query = "Insert into ascolta values(" + utente.getNickname() + ", " + traccia.getCodT() + ", "+ ora + ")";
		esito = asi.insertAscolto(query);
		
		return esito;
	}
	
	public int updateUtente(String nickname,String nome, String cognome, String nazione,String sesso,boolean IsPremium, boolean IsAdmin) {
		int esito=0;
		
		esito=ui.updateUtente(nickname, nome, cognome, nazione, sesso, IsPremium, IsAdmin);
		
		return esito;
	}
}
