package fr.epsi.model.thread;
import java.util.concurrent.ThreadLocalRandom;

import fr.epsi.exception.NullCameraException;
import fr.epsi.model.Afficheur;
import fr.epsi.model.Camera;
import fr.epsi.model.Ecran;
//Note : pour arrêter le thread, utiliser thread.interrupt(). Oui, c'est normal que ça renvoie une exception.
public class ThreadImageAlea implements Runnable {
	private Ecran ecranGere;
	//Représente le temps en millisecondes entre le choix de deux images aléatoires
	private int tempsAlea;
	//Constructeur
	public ThreadImageAlea(Ecran ecran, int temps){
		this.ecranGere = ecran;
		this.tempsAlea = temps;
	}
	/*
	Lancer un thread avec :
		new Thread(new ThreadImageAlea(ecran, temps)).start();
	L'index d'un thread dans tabThread est censé correspondre à l'index de son écran associé dans tabEcran
	 */
	public void run(){
		while (true) {
			//Afficher une image aléatoire
			try {
				ecranGere.afficherCamera(choixCameraAlea());
			} catch (NullCameraException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//Attendre et recommencer
			try {
				Thread.sleep(tempsAlea);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Camera choixCameraAlea(){
		return Afficheur.getListeCamera().get(ThreadLocalRandom.current().nextInt(0, Afficheur.getListeCamera().size()));
	}
}
