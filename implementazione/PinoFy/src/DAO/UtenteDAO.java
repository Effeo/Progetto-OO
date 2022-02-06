package DAO;

import java.sql.Date;

import Model.Utente;

public interface UtenteDAO {
	Utente login(String email, String password);
	int sign_Up(String nickname,String mail,String password,String nome,String cognome,String nazione,String descrizione,Date datan,boolean isPremium,boolean isAdmin);
}
