package fr.epsi.ihm.view;

import java.io.IOException;
import java.util.ArrayList;

import fr.epsi.io.CameraReader;
import fr.epsi.model.Afficheur;
import fr.epsi.model.Camera;
import fr.epsi.model.Ecran;
import javafx.stage.Stage;

public class MainView extends javafx.application.Application {
	
	private final static int NB_MAX_MONITEURS = 9;
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Falcon Watch");
		try {
			Afficheur mainAfficheur = new Afficheur(new Ecran[NB_MAX_MONITEURS], new ArrayList<Camera>(CameraReader.getAllCamera()));
		} catch (IOException e) {
			System.err.println("Impossibilité d'accéder au dossier des fichiers caméra.");
			e.printStackTrace();
		}
		System.out.println("Chargement des images achevé");
		
		
		primaryStage.show();
		
	}
}
