package p09_08_2022;

import java.util.ArrayList;

public class Predavanja3 {

	public static void main(String[] args) {
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		
		brojevi.add(5); // 0
		brojevi.add(1); // 1
		brojevi.add(4); // 2 
		brojevi.add(3); // 3
		brojevi.add(1); // 3
		brojevi.add(1); // 3
		brojevi.add(1); // 3
		
		for (int i = 0; i < brojevi.size(); i++) {
			System.out.println(brojevi.get(i));
		}
	}

}
