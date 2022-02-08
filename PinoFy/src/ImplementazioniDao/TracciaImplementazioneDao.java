package ImplementazioniDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import ConnessioneDatabase.Connessione;
import DAO.TracciaDAO;
import Model.Album;
import Model.Traccia;

public class TracciaImplementazioneDao implements TracciaDAO {
	
private Connection connection;
	
	public TracciaImplementazioneDao()
	{
		try {
			connection = Connessione.getInstance().getConnection();
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public Traccia takeTraccia(int codT) {
		Traccia traccia = null;
		
		String titolo, etichetta, genere, link, formato;
		Time durata;
		int annoU, qualita, voto, codA, codTC, codTR;
		boolean isCover, isRemastered;
		AlbumImplementazioneDao albumDao = null;
		TracciaImplementazioneDao tr = null;
		TracciaImplementazioneDao tc = null;
		Traccia tracciaR = null;
		Traccia tracciaC = null;
		Album album = null;
		
		try {
			PreparedStatement queryTakeTraccia = connection.prepareStatement
			(" SELECT * FROM TRACCIA WHERE CODT = " + codT);
			
			ResultSet rs = queryTakeTraccia.executeQuery();
			
			while(rs.next())
			{
				titolo = rs.getString("Titolo");
				etichetta = rs.getString("Etichetta");
				genere = rs.getString("Genere");
				link = rs.getString("Link");
				formato = rs.getString("Formato");
				durata = rs.getTime("Durata");
				annoU = rs.getInt("AnnoU");
				qualita = rs.getInt("Qualita");
				voto = rs.getInt("Voto");
				isCover = rs.getBoolean("IsCover");
				isRemastered = rs.getBoolean("IsRemastered");
				codA = rs.getInt("CodA");
				codTC = rs.getInt("CodTC");
				codTR= rs.getInt("CodTR");
				
				albumDao = new AlbumImplementazioneDao();
				tr = new TracciaImplementazioneDao();
				tc = new TracciaImplementazioneDao();
				album = albumDao.takeAlbum(codA);
				if(codTR != 0) { tracciaR = tr.takeTraccia(codTR);}
				if(codTC != 0) { tracciaC = tc.takeTraccia(codTC);}
				
				traccia = new Traccia(titolo, durata, etichetta, annoU, genere, link, formato, qualita, voto, isCover, isRemastered, album, tracciaR, tracciaC);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return traccia;
	}
}
