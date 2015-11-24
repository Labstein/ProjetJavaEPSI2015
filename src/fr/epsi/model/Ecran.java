package fr.epsi.model;

import fr.epsi.exception.NullCameraException;
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
	//M�thodes
	public void afficherCamera(Camera nouvelleCamera)throws NullCameraException {
		if(nouvelleCamera == null)
			throw new NullCameraException();
		else{
			cameraCourante = nouvelleCamera;
			ecranAssocie.setImage(nouvelleCamera.getRenduCamera());
		}
	}
}
