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
	public Ecran[] getTabEcran(){
		return tabEcran;
	}
	//Constructeurs
	public Afficheur(Ecran[] tabEcran, List<Camera> listeCamera){
		this.tabEcran = tabEcran;
		Afficheur.listeCamera = listeCamera;
	}
	//Méthodes
	
}
