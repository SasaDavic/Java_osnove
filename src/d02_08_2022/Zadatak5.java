package d02_08_2022;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// Napisati program koj racuna z prema formuli: (x - y) na kvadrat. X i Y se unose sa tastature.

				Scanner s = new Scanner(System.in);
				double x, y, z;
				
				System.out.println("Unesite x: ");
				x = s.nextDouble();
				
				System.out.println("Unesite y: ");
				y = s.nextDouble();
				
				z = (x - y)*(x - y);
				System.out.println("(x - y) na kvadrat je: " + z);
				
	}

}
