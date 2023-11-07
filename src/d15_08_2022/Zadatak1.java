package d15_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
	/*
	 Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
	 Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
	 */
		
		Scanner s = new Scanner (System.in);
		System.out.println("Unesite a: ");
		int a = s.nextInt();
		System.out.print("Vrednost za 10 veca od broja a je: ");
		stampajVrednostZa10Vecu(a);
	}
	
	
	public static void stampajVrednostZa10Vecu(int a) {
		a += 10;
		System.out.println(a);
	}

}
