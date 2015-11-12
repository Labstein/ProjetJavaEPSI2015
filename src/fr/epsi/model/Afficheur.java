package fr.epsi.model;

import java.util.List;

public class Afficheur {
	//Attributs
	private Ecran[] tabEcran;
	private static volatile  List<Camera> listeCamera;
	//Accesseurs
	public static List<Camera> getListeCamera(){
		return listeCamera;
		
	}
	//Constructeurs
	public Afficheur(Ecran[] tabEcran, List<Camera> listeCamera){
		this.tabEcran = tabEcran;
		this.listeCamera = listeCamera;
	}
	//Méthodes
	
}
