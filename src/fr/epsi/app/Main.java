package fr.epsi.app;

import fr.epsi.ihm.view.MainView;

public class Main {
	public static void main(String[] args) {
		System.out.println("Démarrage de l'interface grahique...");
		javafx.application.Application.launch(MainView.class);	
	}
}
