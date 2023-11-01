package p04_08_2022;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji simulira ponasanje kontrole za zvuk na jutjubu.. 
	 * Kada se ucita video difoltna jacina zvuka je 75.
		Korisnik unosi akciju sa tastature. Jednu od sledecih:
		pojacaj - pojacava zvuka za 10
		smanji - smanjuje zvuk za 10.
		mute - postavlja zvuk na 0.
		Na kraju programa odstampati jacinu zvuka
		Primer izvrsenja 1:
		Jacina zvuka je 75.
		Unesite akciju: pojacaj
		Nova jacina zvuka je 85

	 */
		Scanner s = new Scanner(System.in);
		
		int zvuk = 75;
		System.out.println("Unesite akciju (pojacaj, smanji, mute):");
		String akcija = s.next();
		System.out.println("Stara jacina zvuka je" + zvuk);
//		equals => == 
//		contains => akcija.contains("p") => true
		
		
		if (akcija.equals("pojacaj")) {
			zvuk = zvuk + 10;
		} else if (akcija.equals("smanji")) {
			zvuk = zvuk - 10;
		} else {
			zvuk = 0;
		}
		
		System.out.println("Nova jacina zvuka je " + zvuk);
		
		
	}

}
