package p02_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
Napisati program koji racuna prosecnu vrednost za tri decimalna broja a, b i c. 
Vrednosti za a, b i c su proizvoljne. 
Primer izvrsenja:
a: 10.0
b: 5.0
c: 6.0
Srednja vrednost je 7.0

	 */
		double a = 6.0;
		double b = 1.0;
		double c = 21.23;
		double avg = (a + b + c) / 3;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

		System.out.println("Srednja vrednost je " + avg);
	}

}
