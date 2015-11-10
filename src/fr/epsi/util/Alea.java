package fr.epsi.util;

import java.util.Random;

public class Alea {
	public static int nbRandom(int min, int max){
		//TODO: vérifier si ce code ne nécessite pas d'être multithreadé (classe ThreadLocalRandom ?)
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}
}
