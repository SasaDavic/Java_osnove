package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak11 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji vrsi mesanje niza. Niz je duzine 10, proizvoljnih brojeva. 
Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
primer jedne zamene:
Ako je niz
1,2,3,4,5,6,7,8,9,10
i prvi random indeks je 4 a drugi random indeks je 6
1,2,3,4,7,6,5,8,9,10

	 */
		Random random = new Random();
		ArrayList<Integer> niz = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			niz.add(random.nextInt(20));
			System.out.print(niz.get(i) + ", ");
		}
		for (int i = 0; i < 8; i++) {
			int a = random.nextInt(10);
			int b = random.nextInt(10);
			System.out.println();
			int a1 = a + 1;
			int b1 = b + 1;
			System.out.println("Menjamo mesta " + a1 + "tom i " + b1 + "tom clanu niza");
			int c = niz.get(a);
			int d = niz.get(b);
			niz.set(a, d);
			niz.set(b, c);
			int x = i + 1;
			System.out.println("Promena " + x + ":");
			for (int j = 0; j < 10; j++) {
				System.out.print(niz.get(j) + ", ");
			}
		}

	}

}
