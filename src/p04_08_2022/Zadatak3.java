package p04_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji ucitava brojeve a, b i c sa tastature i proverava da li je 
	 * broj a u opsegu od b do c.

		………b=0……………a=22…………………c=50…………

	 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite a:");
		int a = s.nextInt();
		
		System.out.println("Unesite b:");
		int b = s.nextInt();
		
		System.out.println("Unesite c:");
		int c = s.nextInt();
//		a > b i mora a < c
//		a > b ili  a < c 
//		………b=0………………………………c=50………a=80…
		if(a >= b && a <= c) {
			System.out.println("A je u opsegu.");
		} else {
			System.out.println("A nije u opsegu.");
		}
		
		
		
		
	}

}
