package p09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
	/*
		Napisati program koji ucitava sa tastature N karaktera i kreira niz koji predstavlja palindrom.
		Na kraju programa odstampati novo kreirani niz.
		Primer izvrsenja:
		Unesite N: 4
		Unesite karakter: M
		Unesite karakter: b
		Unesite karakter: n
		Unesite karakter: c
		Palindrom:
		M, b, n, c, c, n, b, M
		Napomena: U memoriji niz treba da ima sve ove elemente.

	 */
		ArrayList<String> niz = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite N: ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite karakter: ");
			String a = s.next();
			niz.add(a);
		}
		for (int i = n - 1; i >= 0; i--) {
			niz.add(niz.get(i));
		}
		
		/*
		 * II nacin
		 * int m = 1;
		for (int i = n; i < 2*n; i++) {			
			niz.add(niz.get(n - m));
			m++;
		}
		 */
		System.out.println("Palindrom:");
		for (int i = 0; i < niz.size(); i++) {
			System.out.print(niz.get(i) + ", ");
		}
		
		
	}

}
