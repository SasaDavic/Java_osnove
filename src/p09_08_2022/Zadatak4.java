package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i 
	 * koji prikazuje element na poziciji K. K unosi korisnik.
			Primer:
			Unesite pozicjiu: 2
			Na pozicji 2 je vrednost 7.
	 */
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		ArrayList<Integer> niz = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			niz.add(random.nextInt(11));
			System.out.println("Clan niza br. " + i + " je: " + niz.get(i));
		}
		System.out.println("Unesite poziciju: ");
		int x = s.nextInt();
		System.out.println("Na poziciji " + x + " je vrednost " + niz.get(x));
	}

}
