package p09_08_2022;

import java.util.ArrayList;

public class Zadatak6 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji ispisuje niz brojeva na ekranu. Niz je definisan proizvoljno.
			Primer:
			1, 2, 34, 5, 7, -9
			KORISTECI PETLJU !!!!!!!!!!!!!!!!!!
	 */
		ArrayList<Integer> niz = new ArrayList<Integer>();
		niz.add(12);
		niz.add(62);
		niz.add(-96);
		niz.add(75);
		niz.add(7);
		niz.add(14);
		for (int i = 0; i < niz.size(); i++) {
			System.out.print(niz.get(i) + ", ");
		}

	}

}
