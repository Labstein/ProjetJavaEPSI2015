package fr.epsi.model;

import java.util.List;
import java.util.Observable;


public class Afficheur extends Observable{
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
