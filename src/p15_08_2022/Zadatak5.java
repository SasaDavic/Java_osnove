package p15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
	/*
	 * Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti
	 */

		
		apsolutno(-1);
		apsolutno(9);
		
	}
	public static void apsolutno(int broj) {
		if (broj < 0) {
			System.out.println("Apsolutna vrednost je " + -1 * broj);
		} else {
			System.out.println("Apsolutna vrednost je " + broj);
		}
	}

}
