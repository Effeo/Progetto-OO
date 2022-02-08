package ImplementazioniDao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import Model.Album;
import Model.Artista;
import Model.Playlist;
import Model.Traccia;
import Model.Utente;

public class Altro {
	//questo va in PlaylistImplementazioneDAO
	public ArrayList<Playlist> takePlaylist(String query) {
		ArrayList<Playlist> pippo=new ArrayList<Playlist>();
		Playlist p;
		String titolo;
		int numTracce;
		boolean visibilita;
		Time durata;
		Utente u;
		String utente;
		// devo creare pure le variabili per Utente
		String nickname;
		String mail;
		String password;
		String nome;
		String cognome;
		String nazione;
		String descrizione;
		String sesso;
		Date datan;
		boolean isPremium;
		boolean isAdmin;
		
		try {PreparedStatement queryTakePlaylist=connection.prepareStatement(query);
		ResultSet rs=queryTakePlaylist.executeQuery();
		while(rs.next()) {
			titolo=rs.getString("Titolo");
			numTracce=rs.getInt("Ntracce");
			visibilita=rs.getBoolean("Visibilita"); //nel DB sta l'accento
			durata=rs.getTime("Durata");
			utente=rs.getString("NickName");
		//ora se visibilita e' true dobbiamo dargli la Playlist , ma nel model io passo un riferimento ad utente,ora ho una stringa...
		
		if(visibilita) {
			// qui mi e piu comodo lasciarlo cosi che fare una lista di utenti ed asseganre un utente al take utente,se vuoi cambia
			PreparedStatement queryTakeUtente=connection.prepareStatement("SELECT * FROM UTENTE WHERE NickName='"+utente+"'");
			ResultSet rs1=queryTakeUtente.executeQuery();
			while(rs1.next()) {
				nickname=rs1.getString("NickName");
				mail=rs1.getString("Email");
				password=rs1.getString("Password");
				nome=rs1.getString("Nome");
				cognome=rs1.getString("Cognome");
				nazione=rs1.getString("Nazione");
				descrizione=rs1.getString("Descrizione");
				sesso=rs1.getString("Sesso");
				datan=rs1.getDate("DataN");
				isPremium=rs1.getBoolean("IsPremium");
				isAdmin=rs1.getBoolean("IsAdmin");
			}
			u=new Utente(nickname,mail,password,nome,cognome,nazione,descrizione,sesso,datan,isPremium,isAdmin);
			
			p=new Playlist(titolo,numTracce,visibilita,durata,u);
			pippo.add(p);
			}
		//mostriamo solo quelle visibile del Utente ,cosi se ne crea piu di uno mostraimo cmq solo le visibili
		
		}
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		return pippo;
	}
	//Questo va in AlbumIMplementazioneDAO
	
	public ArrayList<Album> takeAlbum(String query) {
		ArrayList<Album> album= new ArrayList<Album>();
		Album a = null;
		
		String titolo, etichetta;
		int annou, ntracce, voto;
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
				
				a = new Album(titolo, annou, durata, ntracce, etichetta, voto);
				album.add(a);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return album;
	}
	
	//questa va in TRacciaImplementazioenDAO
	
	public ArrayList<Traccia> takeTraccia(String query) {
		ArrayList<Traccia> traccia = new ArrayList<Traccia>();
		Traccia t; 
		
		String titolo, etichetta, genere, link, formato;
		Time durata;
		int annoU, qualita, voto, codA, codTC, codTR;
		boolean isCover, isRemastered;
		AlbumImplementazioneDao albumDao = null;
		TracciaImplementazioneDao tr = null;
		TracciaImplementazioneDao tc = null;
		Traccia tracciaR = null;
		Traccia tracciaC = null;
		ArrayList<Album> album = new ArrayList<Album>();
		Album a;
		
		try {
			PreparedStatement queryTakeTraccia = connection.prepareStatement
			(query);
			
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
				album = albumDao.takeAlbum("SELECT * FROM ALBUM WHERE CodA="+codA);//pure qui faccio prima a mano
				a=album.get(0);
				if(codTR != 0) { 
					ArrayList<Traccia> trr= new ArrayList<Traccia>();
					Traccia tracciaR;
					trr=tr.takeTraccia("SELECT * FROM TRACCIA WHERE CodT="+codTR); //senza bug se DB buono
					tracciaR=trr.get(0);
					
				}
					
				if(codTC != 0) { 
					ArrayList<Traccia> tcc= new ArrayList<Traccia>();
					Traccia tracciaC;
					tcc=tr.takeTraccia("SELECT * FROM TRACCIA WHERE CodT="+codTC); // senza bug se DB buono
					tracciaC=tcc.get(0);
				}
				
				t = new Traccia(titolo, durata, etichetta, annoU, genere, link, formato, qualita, voto, isCover, isRemastered, a, tracciaR, tracciaC);
				traccia.add(t);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return traccia;
	}



// questa va in ArtistaImplementazioneDao
public ArrayList<Artista> takeArtisti(String query){
	ArrayList<Artista> artisti=new ArrayList<Artista>();
	Artista a;
	String nomearte;
	String descrizione;
	int voto;
	
	try {PreparedStatement queryTakePlaylist=connection.prepareStatement(query);
	ResultSet rs=queryTakePlaylist.executeQuery();
	while(rs.next()) {
		nomearte=rs.getString("NomeArte");
		descrizione=rs.getString("Descrizione");
		voto=rs.getInt("Voto");
		a=new Artista(nomearte,descrizione,voto);
		artisti.add(a);
	}
	}
	catch(SQLExeption e) {e.printStackTrace();}
	return artisti;
	
	
}

//questa va in UtenteImplementazioneDAO

public ArrayList<Utente> takeUtenti(String query){
	ArrayList<Utente> utente= new ArrayList<Utente>();
	Utente u = null;
	
	String nickname, nome, cognome, nazione, descrizione, passwordU, sesso, mail;
	Date datan;
	boolean isPremium, isAdmin;
	
	
	
	
	try {
		PreparedStatement querytakeUser = connection.prepareStatement
		(query);
		
		ResultSet rs = querytakeUser.executeQuery();
		
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
			mail=rs.getString("Email");
			
			u=new Utente(nickname,mail,passwordU,nome,cognome,nazione,descrizione,sesso,datan,isPremium,isAdmin);
			utente.add(u);
	
			
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	
	return utente;
}
}

