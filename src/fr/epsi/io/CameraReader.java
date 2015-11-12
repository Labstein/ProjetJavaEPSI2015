package fr.epsi.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import java.lang.IllegalArgumentException;

import fr.epsi.model.Camera;
import javafx.scene.image.Image;

public class CameraReader {
	public static List<Camera> getAllCamera() throws IOException {
		//TODO: message de debug ; � supprimer ult�rieurement
		System.out.println("[DEBUG] Working directory = " + new File("").getAbsolutePath().toString());
		List<Camera> listeCamera = new ArrayList<Camera>();
		Files.walk(Paths.get(".\\cameras")).forEach(filePath -> {
		    if (Files.isRegularFile(filePath)) {
		    	try{
			        listeCamera.add(new Camera(new Image("file:" + filePath.toString()), filePath.getFileName().toString()));
			        System.out.println("[DEBUG] Chargement du fichier " + filePath.toString() + filePath.getFileName().toString());
		    	} catch(IllegalArgumentException e){
		    		System.err.println("Impossibilit� de charger le fichier cam�ra (" + filePath.getFileName().toString() + ")");
					e.printStackTrace();
		    	}
		    }
		});
		return listeCamera;
	}
}
