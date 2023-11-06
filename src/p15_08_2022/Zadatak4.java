package p15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
	 * Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. 
	 * Brojevi su ulazni parametri funkcije. 
	 * U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima. 
	 */

		printZbir(2, 3);
		kalkulator(5, 6);
		
	}
	
	
	public static void printZbir(int x, int y) {
		int z = x + y;
		System.out.println(x + " + " + y + " = " + z);
	}

	public static void kalkulator(int x, int y) {
		int razlika = x - y;
		int proizvod = x * y;
		int zbir = x + y;
		int kolicnik = x / y;
		
		System.out.println("Kolicnik " + kolicnik);
		System.out.println("Proizvod " + proizvod);
		System.out.println("Zbir " + zbir);
		System.out.println("Razlika " + razlika);
	}
}
