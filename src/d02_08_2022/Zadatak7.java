package d02_08_2022;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		/* Napisati program koji ucitava stranicu jednakostranicnog trougla sa tastature i 
		 * ispisuje povrsinu i obim trougla. Koren iz tri neka bude konstanta 1.73
		 
		Primer izvrsenja programa:
			Unesite stranicu trougla: 10
			Povrsina je 43.25
			Obim je 30
			*/
		
		Scanner s = new Scanner(System.in);
		double a, p, o;
		
		System.out.println("Unesite stranicu trougla: ");
		a = s.nextDouble();

		o = 3 * a;
		p = a * a * 1.73 / 4;
		
		System.out.println("Povrsina je: " + p);
		System.out.println("Obim je: " + o);
		
		


	}

}
