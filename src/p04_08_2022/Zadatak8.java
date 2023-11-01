package p04_08_2022;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji ispisuje za uneti broj a da li je deljiv sa 2 i deljiv sa 3.
Upoznajte se sa opertorom moduo % dok ne dodjemo do tog operatora.

	 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Upisite broj: ");
		int broj = s.nextInt();
		
		if (broj % 2 == 0 && broj % 3 == 0) {
			System.out.println("A je deljivo i sa 2 i sa 3");
		} else {
			System.out.println("A nije deljivo sa 2 i 3");
		}
		
/*		if (broj % 2 == 0) {
			System.out.println("Broj je deljiv sa 2!");
		} else {
			System.out.println("Nije deljiv brojem 2!");
		}
		if (broj % 3 == 0) {
			System.out.println("Broj je deljiv brojem 3!");
		} else {
			System.out.println("Nije deljiv brojem 3");
		}
		*/
		
	}

}
