package p15_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
	/*
	 * Napisati dve metode, jedna metoda sluzi za stampanje imena a druga sluzi za stampanje prezimena. 
	 * U glavnom programu pozvati metode na izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.
Primer izvrsenja:
Milan Jovanovic
Milan Jovanovic
Milan Jovanovic
Milan Jovanovic
Milan Jovanovic

	 */
	for (int i = 0; i < 5; i++) {
		printName("Milan ");
		printLastname();
	}	

	}
	
	public static void printName(String ime) {
		System.out.print(ime);
	}
	public static void printLastname() {
		System.out.println("Jovanovic");
	}

}
