package d05_08_2022;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
	/*
Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih 
formira rezultujuci broj kao na primeru
Unesite N: 5
Unesite broj: 1
Unesite broj: 2
Unesite broj: 0
Unesite broj: 4
Unesite broj: 1
Rezultujuci broj je 12041

	 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite N: ");
		int n = s.nextInt();
		String cifra = "";
		for (int i = 0; i < 5; i++) {
			System.out.println("Unesite broj: ");
			int broj = s.nextInt();
			cifra = cifra + broj;
		}
		System.out.println("rezultujuci broj je " + cifra);
	}

}
