package ImplementazioniDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import ConnessioneDatabase.Connessione;
import DAO.AlbumDAO;
import Model.Album;
import Model.Artista;

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
	public ArrayList<Album> takeAlbum(String query) {
		ArrayList<Album> album= new ArrayList<Album>();
		ArrayList<Artista> artisti = new ArrayList<Artista>();
		ArtistaImplementazioneDao ai = new ArtistaImplementazioneDao();
		Album a = null;
		
		String titolo, etichetta, queryArtisti;
		int annou, ntracce, voto, codA;
		Time durata;
		
		try {
			PreparedStatement queryTakeAlbum = connection.prepareStatement
			(query);
			
			ResultSet rs = queryTakeAlbum.executeQuery();
			
			while(rs.next())
			{
				titolo = rs.getString("Titolo");
				etichetta = rs.getString("Etichetta");
				annou = rs.getInt("AnnoU");
				ntracce = rs.getInt("Ntracce");
				voto = rs.getInt("Voto");
				durata = rs.getTime("Durata");
				codA = rs.getInt("CodA");
				
				queryArtisti = "SELECT * FROM ARTISTA, INCIDE WHERE INCIDE.NOMEARTE = ARTISTA.NOMEARTE AND INCIDE.CODA = " + codA;
				artisti = ai.takeArtista(queryArtisti);
				a = new Album(titolo, annou, durata, ntracce, etichetta, voto, artisti);
				album.add(a);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return album;
	}
	
}
