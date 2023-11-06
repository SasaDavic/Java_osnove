package p15_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
Napisati metoda koja stampa zvezdicu sa razmakom. 
U glavnom programu je potrebno odstampati sledecu sliku koristeci metode koje smo definisali.
*  *  * 
*  *  
*  
	 */
		for (int i = 0; i < 3; i++) {
			printStar();
		}
		printLn();
		printStar();
		printStar();
		printLn();
		printStar();
		

	}
	public static void printStar() {
		System.out.print("* ");
	}
	public static void printLn() {
		System.out.println();
	}
}
