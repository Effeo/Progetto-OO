package Main;

import ImplementazioniDao.AlbumImplementazioneDao;
import Model.Album;

public class Main {
	public static void main(String[] args) {
		
		AlbumImplementazioneDao albumImplementazioneDao = new AlbumImplementazioneDao();
		Album album = albumImplementazioneDao.takeAlbum(1);
		
		System.out.printf(album.getTitolo());
	}
}
