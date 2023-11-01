package p04_08_2022;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji sa tastature ucitava sledece podatke:
pol osobe 
cena proizvoda
da li je proizvod neophodan (unosimo da ili ne)
I na kraju ispisuje informaciju da li ce se proizvod kupiti. 
Proizvod se kupuje ako je pol osobe zenski i proizvod je neophodan, nezavisno od cene proizvoda.

	 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite pol:");
		System.out.println("Da li si muskarac:");
		String pol = s.next();
		
		System.out.println("Unesite cenu:");
		double cena = s.nextDouble();
		
		System.out.println("Unesite da li je neophodan(true/false):");
//		String neophodan = s.next();
		boolean neophodan = s.nextBoolean();
//		pol == "zenski" && nephodan == "da"
		if (pol.equals("zenski") && neophodan == true) {
			System.out.println("Proizvod se kupuje.");
		} else {
			System.out.println("Proizvod se ne kupuje.");
		}
	}

}
