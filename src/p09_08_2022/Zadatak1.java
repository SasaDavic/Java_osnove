package p09_08_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i 
	 * prikazuje sumu nultog i zadnjeg elementa tog niza.
	 */
		ArrayList<Integer> niz = new ArrayList<Integer>();
		niz.add(90);
		niz.add(80);
		niz.add(70);
		niz.add(60);
		niz.add(50);
		int suma = niz.get(0) + niz.get(niz.size() - 1);
		System.out.println("Suma je " + suma);

	}

}
