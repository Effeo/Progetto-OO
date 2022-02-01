package Model;

public class Artista {
	private String nomearte;
	private String descrizione;
	private int voto;
	
	public Artista(String nomearte,String descrizione ,int voto) {
		this.nomearte=nomearte;
		this.descrizione=descrizione;
		this.voto=voto;
	}

	public String getNomearte() {
		return nomearte;
	}

	public void setNomearte(String nomearte) {
		this.nomearte = nomearte;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

}
