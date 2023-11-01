package p04_08_2022;

import java.util.Scanner;

public class Predavanja1 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Unesite broj:");
	int broj = s.nextInt();
	
	if (broj != 0) {
		System.out.println("Niste uneli nulu");
	} else {
		System.out.println("Uneli ste nulu.");
	}
	
	System.out.println("KRAJ");// TODO Auto-generated method stub

	}

}
