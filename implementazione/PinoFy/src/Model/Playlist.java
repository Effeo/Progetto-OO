package Model;

import java.time.*;

public class Playlist {
	
	private String titolo;
	private int ntracce;
	private boolean visibilita;
	private LocalTime durata;
	private Utente utente;
	public Playlist(String titolo, int ntracce, boolean visibilita, LocalTime durata,Utente utente) {
		this.titolo = titolo;
		this.ntracce = ntracce;
		this.visibilita = visibilita;
		this.durata = durata;
		this.utente=utente;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getNtracce() {
		return ntracce;
	}
	public void setNtracce(int ntracce) {
		this.ntracce = ntracce;
	}
	public boolean isVisibilita() {
		return visibilita;
	}
	public void setVisibilita(boolean visibilita) {
		this.visibilita = visibilita;
	}
	public LocalTime getDurata() {
		return durata;
	}
	public void setDurata(LocalTime durata) {
		this.durata = durata;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	
	
	
	
	
}
