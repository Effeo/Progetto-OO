package Model;

import java.util.ArrayList;

public class Artista {
	private String nomearte;
	private String descrizione;
	private int voto;
	private ArrayList<Traccia> prodotte;
	private ArrayList<Album> incisi;
	
	public Artista(String nomearte,String descrizione ,int voto,ArrayList<Traccia> prodotte,ArrayList<Album> incisi) {
		this.nomearte=nomearte;
		this.descrizione=descrizione;
		this.voto=voto;
		this.prodotte=prodotte;
		this.incisi=incisi;
	}

	public String getNomearte() {return nomearte;}

	public String getDescrizione() {return descrizione;}

	public int getVoto() {return voto;}

	public ArrayList<Traccia> getProdotte() {return prodotte;}


	public ArrayList<Album> getIncisi() {return incisi;}

}
