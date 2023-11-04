package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i 
	 * koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
			Primer:
			Unesite pozicjiu od 0 do 9: 3
			Unesite novu vrednost: 11
			Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.
	 */
		
		Random random = new Random();
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> niz = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			niz.add(random.nextInt(10));
			System.out.print(niz.get(i) + ", ");
		}
		System.out.println();
		System.out.println("Unesite poziciju od 0 do 9: ");
		int a = s.nextInt();
		System.out.println("Unesite novu vrednost: ");
		int b = s.nextInt();
		niz.set(a, b);
		for (int i = 0; i < niz.size(); i++) {
			System.out.print(niz.get(i) + ", ");
		}
		System.out.println();
		System.out.println("Element na " + a + ". treba da ima vrednost " + b + " u Vasem programu!");
		

	}

}
