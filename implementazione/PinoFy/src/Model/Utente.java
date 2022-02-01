package Model;
import java.time.*;
public class Utente {
	private String nickname;
	private String mail;
	private String password;
	private String nome;
	private String cognome;
	private String nazione;
	private String descrizione;
	private LocalDate datan;
	private boolean ispremium;
	private boolean isadmin;
	public Utente(String nickname, String mail, String password, String nome, String cognome, String nazione,
			String descrizione, LocalDate datan, boolean ispremium, boolean isadmin) {
		
		this.nickname = nickname;
		this.mail = mail;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.nazione = nazione;
		this.descrizione = descrizione;
		this.datan = datan;
		this.ispremium = ispremium;
		this.isadmin = isadmin;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNazione() {
		return nazione;
	}
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public LocalDate getDatan() {
		return datan;
	}
	public void setDatan(LocalDate datan) {
		this.datan = datan;
	}
	public boolean isIspremium() {
		return ispremium;
	}
	public void setIspremium(boolean ispremium) {
		this.ispremium = ispremium;
	}
	public boolean isIsadmin() {
		return isadmin;
	}
	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}
	
	
	
	

}
