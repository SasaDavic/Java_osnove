package p04_08_2022;

import java.util.Scanner;

public class Predavanja3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite omiljeni klub:");
		String klub = s.next();
//		klub.equals("Zvezda")) => klub == "Zvezda"
		if (klub.equals("Zvezda")) {
			System.out.println("Mnogo smo jaci!");
		} else if (klub.equals("Partizan")) {
			System.out.println("Mnogo smo jaki ali partizan.");
		} else {
			System.out.println("Nikom nista.");
		}
		
		
		System.out.println("KRAJ");

	}

}
