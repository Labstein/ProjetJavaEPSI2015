package fr.epsi.model;

import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Moniteur {
	//Attributs
	private static Map<String, Camera> listeCamera;
	private String cameraCourante;
	//Accesseurs
	public String getCameraCourante() {
		return cameraCourante;
	}
	
	public void reinitCameraCourante(){
		cameraCourante = null;
	}
	//Constructeurs
	public Moniteur(){
		cameraCourante = null;
	}
	//Méthodes
	//Il est nécessaire d'appeler cette méthode avant de pouvoir afficher quoi que ce soit
	public static void initialiserCameras(HashMap<String, Camera> listeCamera){
		Moniteur.listeCamera = listeCamera;
	}
	
	public Image afficherCamera(){
		return listeCamera.get(cameraCourante).getRenduCamera();
	}
	
	public Image afficherCamera(String nomCamera){
		cameraCourante = nomCamera;
		return listeCamera.get(cameraCourante).getRenduCamera();
	}
	
	public Image afficherCameraAlea(){
		Set<String> keySet = listeCamera.keySet();
		return afficherCamera(keySet.toArray(new String[keySet.size()])[Alea.nbRandom(0, (listeCamera.size()-1))]);
	}
}
