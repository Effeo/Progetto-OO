package ImplementazioniDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ConnessioneDatabase.Connessione;
import DAO.UtenteDAO;
import Model.Utente;

public class UtenteImplementazioneDao implements UtenteDAO{
	private Connection connection;
	
	public UtenteImplementazioneDao()
	{
		try {
			connection = Connessione.getInstance().getConnection();
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public Utente login(String email, String password) {
		Utente utente = null;
		
		String nickname, nome, cognome, nazione, descrizione, passwordU;
		Date datan;
		boolean isPremium, isAdmin;
		
		try {
			PreparedStatement queryLogin = connection.prepareStatement
			("SELECT * FROM UTENTE WHERE EMAIL = '" + email + "'");
			
			ResultSet rs = queryLogin.executeQuery();
			
			if(rs == null)
			{
				System.out.println("Email non corretta");
			}
			while(rs.next())
			{
				
				nickname = rs.getString("NickName");
				nome = rs.getString("Nome");
				cognome = rs.getString("Cognome");
				nazione = rs.getString("Nazionalita");
				descrizione = rs.getString("Descrizione");
				datan = rs.getDate("DataN");
				isPremium = rs.getBoolean("IsPremium");
				isAdmin = rs.getBoolean("IsAdmin");
				passwordU = rs.getString("Password");
	
				if(passwordU.equals(password))
				{
					utente = new Utente(nickname, email, password, nome, cognome, nazione, descrizione, datan, isPremium, isAdmin);
				}
				else
				{
					System.out.println("Password non corretta");
				}
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return utente;
	}
	
	@Override
	public int sign_Up(String nickname, String mail, String password, String nome, String cognome, String nazione,
			String descrizione, Date datan, boolean isPremium, boolean isAdmin) {
		
		int esito = 0;
		
		try {PreparedStatement querySignUp = connection.prepareStatement("Insert INTO UTENTE Values('"+ nickname +"','"+ mail + "','" + password + "','"+ nome + "','"+ cognome + "','" + nazione +"','" + descrizione +"','" + datan + "','" + isPremium + "," + isAdmin +");");
				esito = querySignUp.executeUpdate();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		
		return esito;
	}
}
