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
		System.out.println("[DEBUG] Working directory = " + new File("").getAbsolutePath().toString());
		List<Camera> listeCamera = new ArrayList<Camera>();
		//Lecture de tous les fichiers dans le dossier "cameras"
		Files.walk(Paths.get(".\\cameras")).forEach(filePath -> {
		    if (Files.isRegularFile(filePath)) {
		    	//Si les fichiers sont des images valides, elles sont ajoutées à la liste
		    	try{
			        listeCamera.add(new Camera(new Image("file:" + filePath.toString()), filePath.getFileName().toString()));
			        System.out.println("Chargement du fichier " + filePath.getFileName().toString());
		    	} catch(IllegalArgumentException e){
		    		System.err.println("Impossibilité de charger le fichier caméra (" + filePath.getFileName().toString() + ")");
					e.printStackTrace();
		    	}
		    }
		});
		return listeCamera;
	}
}
