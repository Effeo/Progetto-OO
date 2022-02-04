package Model;

import java.sql.Time;
import java.util.ArrayList;

public class Album {
	
	private String titolo;
	
	private int annoU;
	
	private Time durata;
	
	private int ntracce;
	
	private String etichetta;
	
	private int voto;
	
	private ArrayList<Artista> inciso_da;
	
	public Album(String titolo, int annoU, Time durata, int ntracce, String etichetta, int voto,ArrayList<Traccia> contenuti,ArrayList<Artista> inciso_da) {
		this.titolo = titolo;
		this.annoU = annoU;
		this.durata = durata;
		this.ntracce = ntracce;
		this.etichetta = etichetta;
		this.voto = voto;
		this.inciso_da=inciso_da;
	}

	public String getTitolo() {return titolo;}
	
	public int getAnnoU() {return annoU;}

	public Time getDurata() {return durata;}

	public int getNtracce() {return ntracce;}

	public String getEtichetta() {return etichetta;}

	public int getVoto() {return voto;}

	public ArrayList<Artista> getInciso_da() {return inciso_da;}


	
	
}
