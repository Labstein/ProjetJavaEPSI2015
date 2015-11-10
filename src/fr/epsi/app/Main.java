package fr.epsi.app;

import java.util.ArrayList;
import fr.epsi.model.Afficheur;
import fr.epsi.model.Camera;
import fr.epsi.model.Ecran;

public class Main {

	private final static int NB_MAX_MONITEURS = 9;
	
	public static void main(String[] args) {
		Afficheur mainAfficheur = new Afficheur(new Ecran[NB_MAX_MONITEURS], new ArrayList<Camera>());
		
	}

}
