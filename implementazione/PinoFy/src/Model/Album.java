package Model;

import java.time.LocalTime;
public class Album {
	
	private String titolo;
	
	private int annoU;
	
	private LocalTime durata;
	
	private int ntracce;
	
	private String etichetta;
	
	private int voto;
	 
	public Album(String titolo, int annoU, LocalTime durata, int ntracce, String etichetta, int voto) {
		this.titolo = titolo;
		this.annoU = annoU;
		this.durata = durata;
		this.ntracce = ntracce;
		this.etichetta = etichetta;
		this.voto = voto;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public int getAnnoU() {
		return annoU;
	}

	public LocalTime getDurata() {
		return durata;
	}

	public int getNtracce() {
		return ntracce;
	}

	public String getEtichetta() {
		return etichetta;
	}

	public int getVoto() {
		return voto;
	}

	
	
	
}
