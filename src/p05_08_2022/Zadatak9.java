package p05_08_2022;

public class Zadatak9 {

	public static void main(String[] args) {
	/*
	 * Napisati program koji sumira brojeve od 1 do 10 i na kraju programa ispisuje sumu.
suma = 1 + 2 + 3 + � + 10 (ovo je objasnjenje)
Primer izvrsenja:
Suma brojeva od 1 do 10 je 55

	 */
		int suma = 0;
		
//		for (int i = 1; i <= 10; i++) {				ako sabirate 10 + 20 + ... + 100
//			suma = suma + i * 10;
//		}
		
		
		for (int i = 1; i < 11; i++) {
			suma += i;
		}
		System.out.println("Suma brojeva od 1 do 10 je: " + suma);
		
		

	}

}
