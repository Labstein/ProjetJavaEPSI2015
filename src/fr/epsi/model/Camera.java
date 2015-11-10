package fr.epsi.model;

import javafx.scene.image.Image;

public class Camera {
	//Attributs
	private Image renduCamera;
	//Accesseurs
	public Image getRenduCamera() {
		return renduCamera;
	}
	
	public void setRenduCamera(Image renduCamera) {
		this.renduCamera = renduCamera;
	}
	//Constructeurs
	//Note : si un renduCamera n'est pas associ� ult�rieurement, un exception sera lev�e lors du traitement
	public Camera(){
		this.renduCamera = null;
	}
	
	public Camera(Image renduCamera){
		this.renduCamera = renduCamera;
	}
}
