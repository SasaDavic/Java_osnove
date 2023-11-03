package p08_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji sabira brojeve vece od nule a da ne predje sumu 100.
		1 + 2 + 3 + 4 + … 

	 */
		
		int suma = 0;
		
		
//		for (int i = 1; i < 100; i++) {		ovo ide redom od 1 do 99 i sabira brojeve tako da ne predje 100
//			while (suma < 100) {			tj. 1 + 2 + 3 + ... + 12 + 36	npr
//				suma += i;
//			}
//		}
		int prirodniBroj = 1;
		while (suma + prirodniBroj <= 100) {
			suma += prirodniBroj;
			prirodniBroj++;
		}
		
		
		
		System.out.println("Suma je " + suma);

	}

}
