package view;

import java.util.ArrayList;

import manejador.ManejadorWeb;
import model.Artista;

public class Prueba {

	public static void main(String[] args) {
		
		ManejadorWeb manejador = new ManejadorWeb("http://ws.audioscrobbler.com/2.0/?method=user.gettopartists&user=rj&api_key=35066a49f2deb23a3c35fd48ff5c9869");
		ArrayList<Artista> artistas = manejador.parsear();
		
		for (Artista artista:artistas) {
			System.out.println(artista);
		}

	}

}


