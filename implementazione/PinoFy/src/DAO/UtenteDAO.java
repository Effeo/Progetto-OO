package DAO;

import java.sql.Date;

import Model.Utente;

public interface UtenteDAO {
	Utente login(String email, String password);
	int sign_Up(String nickname,String mail,String password,String nome,String cognome,String nazione,String descrizione, String sesso, String datan,String isPremium,String isAdmin);
}
