package Main;

import ImplementazioniDao.*;
import Model.*;

public class Main {
	public static void main(String[] args) {
		
		AlbumImplementazioneDao albumImplementazioneDao = new AlbumImplementazioneDao();
		Album album = albumImplementazioneDao.takeAlbum(1);
		
		TracciaImplementazioneDao tracciaImplementazioneDao = new TracciaImplementazioneDao();
		Traccia traccia = tracciaImplementazioneDao.takeTraccia(1);
		
		System.out.printf(album.getTitolo() + "\n");
		System.out.printf(traccia.getTitolo());
	}
}
