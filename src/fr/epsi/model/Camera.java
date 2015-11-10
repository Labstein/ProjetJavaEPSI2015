package fr.epsi.model;

import javafx.scene.image.Image;

public class Camera {
	//Attributs
	private Image renduCamera;
	private String nomCamera;
	//Accesseurs
	public Image getRenduCamera() {
		return renduCamera;
	}
	public void setRenduCamera(Image renduCamera) {
		this.renduCamera = renduCamera;
	}
	public String getNomCamera() {
		return nomCamera;
	}
	public void setNomCamera(String nomCamera) {
		this.nomCamera = nomCamera;
	}
	//Constructeurs
	//Note : si un renduCamera n'est pas associ� ult�rieurement, une exception devra �tre lev�e lors du traitement
	public Camera(){
		this.renduCamera = null;
		this.nomCamera = "";
	}
	
	public Camera(Image renduCamera, String nomCamera){
		this.renduCamera = renduCamera;
		this.nomCamera = nomCamera;
	}
}
