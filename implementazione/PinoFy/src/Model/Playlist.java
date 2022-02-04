package Model;

import java.sql.Time;
import java.util.ArrayList;

public class Playlist {
	
	private String titolo;
	private int ntracce;
	private boolean visibilita;
	private Time durata;
	private Utente utente;
	private ArrayList<Traccia> contenute;
	
	public Playlist(String titolo, int ntracce, boolean visibilita, Time durata,Utente utente,ArrayList<Traccia> contenute) {
		this.titolo = titolo;
		this.ntracce = ntracce;
		this.visibilita = visibilita;
		this.durata = durata;
		this.utente = utente;
		this.contenute=contenute;
	}
	
	public String getTitolo() {return titolo;}
	
	public int getNtracce() {return ntracce;}
	
	public boolean getVisibilita() {return visibilita;}
	
	public Time getDurata() {return durata;}
	
	public Utente getUtente() {return utente;}

	public ArrayList<Traccia> getContenute() {return contenute;}


	
	
	
}
