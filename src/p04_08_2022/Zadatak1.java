package p04_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ispisuje da li je broj b manji od broja a. A i B unosimo sa tastature.
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite A: ");
		int a = s.nextInt();
		System.out.println("Unesite B: ");
		int b = s.nextInt();
		if (b < a) {
			System.out.println("B je manji od A");
		} else if (b == a) {
			System.out.println("A i B su jednaki");
		} else {
			System.out.println("A je manje od B");
		}
	}

}
