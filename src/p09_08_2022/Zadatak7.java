package p09_08_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak7 {

	public static void main(String[] args) {
		/*
		 * Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do prvog.
		 */
		Random random = new Random();
		ArrayList<Integer> niz = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			niz.add(random.nextInt(10));
			System.out.print(niz.get(i) + ", ");
		}
		System.out.println();
		System.out.println("Obrnuto: ");
		for (int i = niz.size() - 1; i >= 0; i--) {
			System.out.print(niz.get(i) + ", ");
		}
 
	}

}
