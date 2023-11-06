package p15_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		//Napisati metodu koja stampa ime i prezime i u glavnom programu pozvati metodu na izvrsenje 5 puta.
		for (int i = 0; i < 5; i++) {
			stampajPunoIme("Mirko", "Mile");
		}
//		printFullName();
//		printFullName();
//		printFullName();
//		printFullName();
//		printFullName();
		
		for (int i = 0; i < 5; i++) {
			printFullName();
		}

	}
	
	public static void printFullName() {
		System.out.println("Milan Jovanovic");
	}
	

	public static void stampajPunoIme(String ime, String prezime) {
		System.out.println(ime + " " + prezime);
	}
	
}
