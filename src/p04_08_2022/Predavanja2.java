package p04_08_2022;

import java.util.Scanner;

public class Predavanja2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite starost:");
		int starost = s.nextInt(); //-5
		
//		if (starost > 0 && starost < 19) {
//			System.out.println("Osoba je maloletna");
//		} else if (starost >= 19) {
//			System.out.println("Osoba je punoletna.");
//		} else {
//			System.out.println("Niste uneli validne podatke.");
//		}
		
//		// 17 - 88 - moze da se polaze
//		if (starost >= 17 && starost <= 88) {
//			System.out.println("Moze da polaze.");
//		} else {
//			System.out.println("Ne moze da polaze.");
//		}
		
//		100
//		false || true => true
		if (starost < 17 || starost > 88) {
			System.out.println("Ne moze da polaze.");
		} else {
			System.out.println("Moze da polaze.");
		}
		
		
		
		
		System.out.println("KRAJ");

	}

}
