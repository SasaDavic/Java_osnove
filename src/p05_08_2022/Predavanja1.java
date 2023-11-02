package p05_08_2022;

import java.util.Scanner;

public class Predavanja1 {

	public static void main(String[] args) {
		System.out.println("Pocetak");

		Scanner s = new Scanner(System.in);
//		System.out.println("Unesite n:");
//		int n = s.nextInt();
		
		
		for(int i = 10; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "*, ");
			} else {
				System.out.print(i + "&, ");
			}
		}

		
		System.out.println("Kraj");
	}

}
