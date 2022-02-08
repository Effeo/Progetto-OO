package ImplementazioniDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import ConnessioneDatabase.Connessione;
import DAO.AlbumDAO;
import Model.Album;

public class AlbumImplementazioneDao implements AlbumDAO {
	private Connection connection;
	
	public AlbumImplementazioneDao()
	{
		try {
			connection = Connessione.getInstance().getConnection();
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public Album takeAlbum(int codA) {
		Album album = null;
		
		String titolo, etichetta;
		int annou, ntracce, voto;
		Time durata;
		
		try {
			PreparedStatement queryTakeAlbum = connection.prepareStatement
			(" SELECT * FROM ALBUM WHERE CODA = " + codA);
			
			ResultSet rs = queryTakeAlbum.executeQuery();
			
			while(rs.next())
			{
				titolo = rs.getString("Titolo");
				etichetta = rs.getString("Etichetta");
				annou = rs.getInt("AnnoU");
				ntracce = rs.getInt("Ntracce");
				voto = rs.getInt("Voto");
				durata = rs.getTime("Durata");
				
				album = new Album(titolo, annou, durata, ntracce, etichetta, voto);// ce ne solo 1 ok, ma per logica ndrebbe fatto fuoir il while,secoondome
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return album;
	}
	
}
