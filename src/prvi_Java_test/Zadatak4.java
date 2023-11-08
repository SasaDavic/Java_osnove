package prvi_Java_test;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
Zadatak (Metode)
Napisati metodu koja vrsi konverziju metara u centimetre, decimetre i kilometre. 
Metoda kao parametre prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju a vraca 
konvertovanu vrednost.

Podsetnik za konverziju jedinica:
1m = 100 cm
1m = 10 dm
1m = 0.001 km

Primer poziva metode
Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5

U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati odgovarajuce poruke na ekranu.

Primer izvrsenja programa:
3.5m je 350cm
3.5m je 35dm
3.5m je 0.0035km

	 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite vrednost u metrima: ");
		double m = s.nextDouble();
		System.out.println("Jedinica u kojoj treba izvrsiti konverziju: ");
		String j = s.next();
		double x = konverzija(m, j);
		System.out.println("Konvertovana vrednost je " + x + j);
	}
	public static double konverzija(double vrednost, String jedinica) {
		if (jedinica.equals("cm")) {
			return vrednost * 100;
		} else if (jedinica.equals("dm")) {
			return vrednost * 10;
		} else if (jedinica.equals("km")) {
			return vrednost / 1000;
		}
		return 0;
	}

}
