package d15_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
	 Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije 
	 vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
		ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
		ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

	 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int a = s.nextInt();
		System.out.println("Unesite broj: ");
		int b = s.nextInt();
		System.out.println(noviBroj(a, b));
		
		
	}
	
	public static String noviBroj(int x, int y) {
		return x + "" + y;
	}
	

}
