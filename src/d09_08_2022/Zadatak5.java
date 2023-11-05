package d09_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji ucitava niz stringova duzine N, 
	 * tako da ucitavanje elemenata u niz a bude obrnuto. 
		Primer:
		Unesite N: 4
		Unesite string: xxx1
		Unesite string: xxx4
		Unesite string: xxx6
		Unesite string: xxx9

		Niz a: xxx9, xxx6, xxx4, xxx1
		Komentar: Stanje niza a u memoriji je:
			a[0]="xxx9",
			a[1]="xxx6",
			a[2]="xxx4",
			a[3]="xxx1",

	 */
		Scanner s = new Scanner(System.in);
		ArrayList<String> niz = new ArrayList<String>();
		System.out.println("Unesite N: ");
		int n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite string: ");
			String rec = s.next();
			niz.set(n - 1 - i, rec);
		}
		System.out.println("Niz a: ");
		for (int i = 0; i < niz.size(); i++) {
			System.out.print(niz.get(i) + ", ");
		}

	}

}
