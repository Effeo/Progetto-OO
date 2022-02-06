package DAO;

import Model.Utente;

public interface UtenteDAO {
	Utente Login(String email, String password);
}
