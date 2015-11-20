package fr.epsi.model.thread;
import fr.epsi.util.Alea;
import fr.epsi.exception.NullCameraException;
import fr.epsi.model.Afficheur;
import fr.epsi.model.Camera;
import fr.epsi.model.Ecran;
//Note : pour arr�ter le thread, utiliser thread.interrupt(). Oui, c'est normal que �a renvoie une exception.
public class ThreadImageAlea implements Runnable {
	private Ecran ecranGere;
	//Repr�sente le temps en millisecondes entre le choix de deux images al�atoires
	private int tempsAlea;
	//Constructeur
	public ThreadImageAlea(Ecran ecran, int temps){
		this.ecranGere = ecran;
		this.tempsAlea = temps;
	}
	/*
	Lancer le thread avec :
	Runnable r = new ThreadImageAlea(ecran, temps);
	new Thread(r).start();
	 */
	public void run(){
		while (true) {
			//Afficher une image al�atoire
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
		return Afficheur.getListeCamera().get(Alea.nbRandom(0, Afficheur.getListeCamera().size()));
	}
}
