package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i 
	 * koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
	 */
		ArrayList<Integer> niz = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			niz.add(random.nextInt(11));
			System.out.print(niz.get(i) + ", ");
		}
		System.out.println();
		int a = niz.get(0);
		niz.set(0, niz.get(niz.size() - 1));
		niz.set(niz.size() - 1, a);
		for (int i = 0; i < 5; i++) {
			System.out.print(niz.get(i) + ", ");
		}
		
		
	}

}
