package p08_08_2022;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
Napisati program koji od korisnika ucitava brojeve sve dok ne unesu dve nule.
Primer:
Unesite broj:1
Unesite broj:2
Unesite broj:0
Unesite broj:1
Unesite broj:0
Kraj programa jer je uneto 2 nule.

	 */
		
		Scanner s = new Scanner(System.in);
		int brojac = 0;
		while (brojac < 2) {
			System.out.println("Unesite broj: ");
			int broj = s.nextInt();
			if (broj == 0) {
				brojac++;
			}
		}
		System.out.println("Kraj programa jer je uneto 2 nule.");
		
		// jos jedan primer
		//		while (brojJedinica < 1 || brojDvojki < 1 || brojTrojki < 1 )
		
		

	}

}
