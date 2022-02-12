package ImplementazioniDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ConnessioneDatabase.Connessione;
import DAO.AscoltoDAO;
import Model.Ascolto;
import Model.Traccia;
import Model.Utente;

public class AscoltoImplementazioneDao implements AscoltoDAO {

	private Connection connection;
	private TracciaImplementazioneDao ti;
	private UtenteImplementazioneDao ui;
	
	public AscoltoImplementazioneDao()
	{
		try {
			connection = Connessione.getInstance().getConnection();
			ti = new TracciaImplementazioneDao();
			
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public int insertAscolto(String query) {
		int esito = 0;
		
		try{
			PreparedStatement queryInsertAscolto = connection.prepareStatement(query);
			esito = queryInsertAscolto.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return esito;
	}
	
	//Qui mi da sia l'Utente che una Traccia
	public ArrayList<Ascolto> mostraAscolti(String query) 
	//prima di chiamre il metodo, il controller deve estrarre tutti i codT delle tracce avent il titolo cheisto dal utente e per ogni cod T,chimare questo metodo
	// quindi la query sara della forma "Select * from ascolti wehre nikname=txtutente and codt=codt_estratto"
	{
		ArrayList<Ascolto> ascolti=new ArrayList<Ascolto>();
		Ascolto a;
		String nikname;
		int Codt=0;
		int fascia=0;
		ArrayList<Traccia> t= new ArrayList<Traccia>();
		ArrayList<Utente> u=new ArrayList<Utente>();

		
		try{
			PreparedStatement queryInsertAscolto = connection.prepareStatement(query);
			ResultSet rs = queryInsertAscolto.executeQuery();
			while(rs.next())
			{
				Codt=rs.getInt("CodT");
				nikname=rs.getString("NikName");
				fascia=rs.getInt("Fascia");
				t=ti.takeTraccia(query1);//credo sia meglio creare un metodo apposito in questo caso (non saprei dove scrivere la query)
				u=ui.takeUtente(query2);// pure qui
				a=new Ascolto(u.get(0),t.get(0),fascia);
				ascolti.add(a);
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return ascolti ;
	}


}
