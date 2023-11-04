package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) 
	 * i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.
	 */
		ArrayList<Integer> niz = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			niz.add(random.nextInt(10));
			System.out.print(niz.get(i) + ", ");
		}
		System.out.println();
		niz.set(3, niz.get(3) * 10);
		for (int i = 0; i < 5; i++) {
			System.out.print(niz.get(i) + ", ");
		}

	}

}
