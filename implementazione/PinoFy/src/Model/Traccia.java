package Model;

import java.time.LocalTime;

public class Traccia {
	private String titolo;
	private LocalTime durata;
	private String etichetta;
	private int annoU;
	private String genere;
	private String link;
	private String formato;
	private int qualita;
	private int voto;
	private boolean iscover;
	private boolean isremastered;
	private Album album;
	private Traccia tr;
	private Traccia tc;
	public Traccia(String titolo, LocalTime durata, String etichetta, int annoU, String genere, String link, String formato, int qualita, int voto,boolean iscover,boolean isremastered,Album album,Traccia tr,Traccia tc) {
		this.titolo=titolo;
		this.durata=durata;
		this.etichetta=etichetta;
		this.annoU=annoU;
		this.genere=genere;
		this.link=link;
		this.formato=formato;
		this.qualita=qualita;
		this.voto=voto;
		this.iscover=iscover;
		this.isremastered=isremastered;
		this.album=album;
		this.tr=tr;
		this.tc=tc;
	}
	
	
	
	


	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalTime getDurata() {
		return durata;
	}

	public void setDurata(LocalTime durata) {
		this.durata = durata;
	}

	public String getEtichetta() {
		return etichetta;
	}

	public void setEtichetta(String etichetta) {
		this.etichetta = etichetta;
	}

	public int getAnnoU() {
		return annoU;
	}

	public void setAnnoU(int annoU) {
		this.annoU = annoU;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public int getQualita() {
		return qualita;
	}

	public void setQualita(int qualita) {
		this.qualita = qualita;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public boolean isIscover() {
		return iscover;
	}
	
	public void setIscover(boolean iscover) {
		this.iscover = iscover;
	}

	public boolean isIsremastered() {
		return isremastered;
	}
	
	public void setIsremastered(boolean isremastered) {
		this.isremastered = isremastered;
	}






	public Album getAlbum() {
		return album;
	}






	public void setAlbum(Album album) {
		this.album = album;
	}






	public Traccia getTr() {
		return tr;
	}






	public void setTr(Traccia tr) {
		this.tr = tr;
	}






	public Traccia getTc() {
		return tc;
	}






	public void setTc(Traccia tc) {
		this.tc = tc;
	}
	
	
	
	}
