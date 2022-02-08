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
		
		try {PreparedStatement querySignUp = connection.prepareStatement("Insert INTO UTENTE Values('"+ nickname +"','"+ nome + "','" + cognome + "','"+ mail + "','"+ password + "','" + datan +"','" + sesso +"','" + nazione + "','" + descrizione + "',"+ isPremium + "," + isAdmin +");");
				esito = querySignUp.executeUpdate();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		
		return esito;
	}
	
	public int check_Exist_Mail_NickName(String mail,String nickname) {
		int esisto=0;
		boolean nik=false;
		boolean mal=false;
		try {PreparedStatement queryCheckMail= connection.prepareStatement("SELECT * FROM UTENTE WHERE Email= '"+ mail+ "';");
			ResultSet rs=queryCheckMail.executeQuery();
			PreparedStatement queryCheckNick= connection.prepareStatement("SELECT * FROM UTENTE WHERE NickName= '"+ nickname+ "'");
			ResultSet rs1=queryCheckNick.executeQuery();
			if(rs != null) {mal=true;}
			if(rs1!=null) {nik=true;}
			if(nik & mal) {esisto=3;} // tutti e due esistono gia
			else if(!nik & !mal){esisto=0;} // tutto a Procida
			else{
				if(nik) {esisto=1;} // nikname gia esiste ,ma mail ok
				else {esisto=2;} // mail gia esiste,nikname ok
			}
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return esisto;
		
	}
}
