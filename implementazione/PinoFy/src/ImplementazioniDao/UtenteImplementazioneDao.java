package ImplementazioniDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
		
		String nickname, nome, cognome, nazione, descrizione, passwordU, sesso;
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
				sesso = rs.getString("Sesso");
	
				if(passwordU.equals(password))
				{
					utente = new Utente(nickname, email, password, nome, cognome, nazione, descrizione, sesso, datan, isPremium, isAdmin);
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
			String descrizione, String sesso, String datan, String isPremium, String isAdmin) {
		
		int esito = 0;
		
		try{
			PreparedStatement querySignUp = connection.prepareStatement("Insert INTO UTENTE Values('"+ nickname +"','"+ nome + "','" + cognome + "','"+ mail + "','"+ password + "','" + datan +"','" + sesso +"','" + nazione + "','" + descrizione + "',"+ isPremium + "," + isAdmin +");");
			esito = querySignUp.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return esito;
	}
	
	
	@Override
	public boolean checkNickName(String nickName) {
		boolean flag = false;
		
		try{
			PreparedStatement queryCheckNick = connection.prepareStatement("SELECT * FROM UTENTE WHERE NickName= '"+ nickName+ "'");
			ResultSet rs1 = queryCheckNick.executeQuery();
			
			while(rs1.next())
			{
				System.out.println("vv");
				flag = true;
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean checkEmail(String email) 
	{
		boolean flag = false;
		
		try
		{
			PreparedStatement queryCheckMail= connection.prepareStatement("SELECT * FROM UTENTE WHERE Email= '"+ email + "';");
			ResultSet rs=queryCheckMail.executeQuery();
			
			while(rs.next())
			{
				System.out.println("cc");
				flag = true;
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public int updateUtente(String nickName,String nome, String cognome, String nazione,String sesso,boolean IsPremium, boolean IsAdmin, String descrizione)
	{
		int esito=0;
		
		try
		{
			PreparedStatement queryupdateUtente= connection.prepareStatement("UPDATE UTENTE SET Nome = '" + nome + "', Cognome = '" + cognome + "', Nazionalita = '" + nazione + "', Sesso = '" + sesso + "', IsPremium = " + IsPremium + ", IsAdmin = " + IsAdmin + ", Descrizione = '" + descrizione  + "' WHERE Nickname = '" + nickName + "';");
			esito=queryupdateUtente.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return esito;
	}

	public ArrayList<Utente> takeUtente(String query)
	{
		ArrayList<Utente> utenti=new ArrayList<Utente>();
		Utente u=null;
		String nickname, nome, cognome, nazione, descrizione, passwordU, sesso,mail;
		Date datan;
		boolean isPremium, isAdmin;
		
		try
		{
			PreparedStatement querytakeUtente= connection.prepareStatement(query);
			ResultSet rs=querytakeUtente.executeQuery();
			while(rs.next()) {
				nickname=rs.getString("NickName");
				nome=rs.getString("Nome");
				cognome=rs.getString("Cognome");
				nazione=rs.getString("Nazionalita");
				passwordU=rs.getString("Password");
				sesso=rs.getString("Sesso");
				datan=rs.getDate("Datan");
				isPremium=rs.getBoolean("IsPremium");
				isAdmin=rs.getBoolean("IsAdmin");
				mail=rs.getString("Email");
				descrizione=rs.getString("Descrizione");
				u=new Utente(nickname,mail,passwordU,nome,cognome,nazione,descrizione,sesso,datan,isPremium,isAdmin);
				utenti.add(u);	
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return utenti;
	}
	
	@Override
	public int deleteUtente(String query)
	{
		int esito = 0;
		
		try
		{
			PreparedStatement queryDeleteUtente = connection.prepareStatement(query);
			esito = queryDeleteUtente.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return esito;
	}
	
}
