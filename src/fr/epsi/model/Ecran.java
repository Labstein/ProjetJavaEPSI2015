package fr.epsi.model;

import javafx.scene.image.ImageView;

public class Ecran {
	//Attributs
	private ImageView ecranAssocie;
	private Camera cameraCourante;
	private boolean modeAlea;
	//Accesseurs
	public Camera getCameraCourante() {
		return cameraCourante;
	}
	public void reinitCameraCourante(){
		cameraCourante = null;
	}
	public ImageView getEcranAssocie() {
		return ecranAssocie;
	}
	public void setEcranAssocie(ImageView ecranAssocie) {
		this.ecranAssocie = ecranAssocie;
	}
	public boolean isModeAlea() {
		return modeAlea;
	}
	public void setModeAlea(boolean modeAlea) {
		this.modeAlea = modeAlea;
	}
	//Constructeurs
	//Une cam�ra devra ensuite �tre ajout�e avant que l'�cran affiche quoi que ce soit
	public Ecran(ImageView ecranAssocie){
		this.ecranAssocie = ecranAssocie;
		cameraCourante = null;
		modeAlea = false;
	}
	//Ne devrait th�oriquement �tre utilis� que pour lancer l'�cran en mode al�atoire. 
	public Ecran(ImageView ecranAssocie, boolean modeAlea){
		this.ecranAssocie = ecranAssocie;
		cameraCourante = null;
		this.modeAlea = modeAlea;
	}
	//M�thodes
	public void afficherCamera(){
		ecranAssocie.setImage(cameraCourante.getRenduCamera());
	}
	public void afficherCamera(Camera nouvelleCamera){
		cameraCourante = nouvelleCamera;
		ecranAssocie.setImage(nouvelleCamera.getRenduCamera());
	}
}