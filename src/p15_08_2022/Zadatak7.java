package p15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
	/*
	 * Napisati metodu koja vraca suprotno negativni broj od prosledjenog. 
	 * Metoda prima broj N i vraca ga sa negativnom vrednoscu.
Primer: Ako se metoda pozove za N=10, vraca -10
	Ako se metoda pozove za N=-11, vraca 11

	 */
		int s = 15;
		int p = suprotan(s);
		System.out.println("Suprotan broj od broja " + s + " je " + p);
		

	}
	public static int suprotan (int broj) {
		return -broj;
	}

}
