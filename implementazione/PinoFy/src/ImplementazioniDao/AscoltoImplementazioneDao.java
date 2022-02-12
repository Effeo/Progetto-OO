package ImplementazioniDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import ConnessioneDatabase.Connessione;
import DAO.AscoltoDAO;
import Model.Traccia;
import Model.Utente;

public class AscoltoImplementazioneDao implements AscoltoDAO {

	private Connection connection;
	private TracciaImplementazioneDao ti;;
	
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

}
