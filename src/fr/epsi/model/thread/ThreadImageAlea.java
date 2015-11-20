package fr.epsi.model.thread;
import fr.epsi.util.Alea;
import fr.epsi.model.Afficheur;
public class ThreadImageAlea extends Thread {
	
	public void run() {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i <= Afficheur.getListeCamera().size(); i++) {
			
		}
			
		while (System.currentTimeMillis() < (start + 5000)) {
			
		}
	}
}
