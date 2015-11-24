package fr.epsi.model.thread;
import java.util.concurrent.ThreadLocalRandom;

import fr.epsi.exception.NullCameraException;
import fr.epsi.model.Afficheur;
import fr.epsi.model.Camera;
import fr.epsi.model.Ecran;
//Note : pour arr�ter le thread, utiliser thread.interrupt(). Oui, c'est normal que �a renvoie une exception.
public class ThreadImageAlea implements Runnable {
	private Ecran ecranGere;
	//Repr�sente le temps en millisecondes entre le choix de deux images al�atoires
	private int tempsAlea;
	boolean continuer;
	//Constructeur
	public ThreadImageAlea(Ecran ecran, int temps){
		this.ecranGere = ecran;
		this.tempsAlea = temps;
		this.continuer = true;
	}
	/*
	Lancer un thread avec :
		new Thread(new ThreadImageAlea(ecran, temps)).start();
	*/
	public void run(){
		while (continuer) {
			//Afficher une image al�atoire
			try {
				ecranGere.afficherCamera(choixCameraAlea());
			} catch (NullCameraException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Attendre
			try {
				Thread.sleep(tempsAlea);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Recommencer si on en a le droit
			if(!ecranGere.isModeAlea())
				continuer = false;
		}
		return;
	}
	
	public Camera choixCameraAlea(){
		return Afficheur.getListeCamera().get(ThreadLocalRandom.current().nextInt(0, Afficheur.getListeCamera().size()));
	}
}
