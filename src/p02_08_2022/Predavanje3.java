package p02_08_2022;

import java.util.Scanner;

public class Predavanje3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite vase ime:");
		String ime = s.next();
		System.out.println("Unesi vrednost za a:");
		int a = s.nextInt();
		System.out.println("Unesi vrednost za b:");
		int b = s.nextInt();
		
		int zbir = a + b;
		System.out.println("Hej " + ime + "e!");
		System.out.println("Zbir je " + zbir);
	}

}
