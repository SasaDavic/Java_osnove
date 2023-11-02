package d05_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji pronalazi 7 stepen broja 2. 
		Izvrsenje:
		2 na stepen 7 je 128

	 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int broj = s.nextInt();
		System.out.println("Koji stepen tog broja zelite da izracunate? ");
		int stepen = s.nextInt();
		int rezultat = 1;
		for (int i = 1; i <= stepen; i++) {
			rezultat *= broj;
		}
		System.out.println(broj + " na stepen " + stepen + " je " + rezultat);
	}

}
