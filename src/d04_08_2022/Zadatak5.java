package d04_08_2022;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature 
	 * (operator je string i moze imati vrednosti +, - , *, /) 
	 * racuna  i ispisuje na ekranu odgovarajuci zbir, razliku, proizvod ili kolicnik za 
	 * dva broja a i b uneta sa tastature.
			Primer 1:                                             	Primer 2:
			Unestite a: 6                                        	Unestite a: 6
			Unesite b: 3                                         	Unesite b: 3
			Unesite operator: +                             		Unesite operator: /
			Rezultat: 9                                           	Rezultat: 2
			
				 */
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite a: ");
		int a = s.nextInt();
		System.out.println("Unesite b: ");
		int b = s.nextInt();
		System.out.println("Unesite operator: ");
		String operator = s.next();
		int rez = 0;
		
		if(operator.equals("+")) {
			rez = a + b;
		} else if (operator.equals("-")) {
			rez = a - b;
		} else if (operator.equals("*")) {
			rez = a * b;
		} else if (operator.equals("/")) {
			rez = a / b;
		} else {
			System.out.println("Uneli ste pogresan operator.");
		}

		System.out.println("Rezultat je " + rez);
		
	}

}
