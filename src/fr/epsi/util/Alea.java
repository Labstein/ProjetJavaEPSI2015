package fr.epsi.util;

import java.util.Random;

public class Alea {
	public static int nbRandom(int min, int max){
		//TODO: v�rifier si ce code ne n�cessite pas d'�tre multithread� (classe ThreadLocalRandom ?)
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}
}
