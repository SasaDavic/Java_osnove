package d15_08_2022;

public class Zadatak6 {

	public static void main(String[] args) {
	/*
Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.

Primer izvrsenja: 
izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

Napomena: Resiti bez koriscenja petlji. 

	 */
		int x = izbroji(5, 10);
		System.out.println(x);
		int y = izbroji(-5, 1);
		System.out.println(y);
		
		
	}
	public static int izbroji(int a, int b) {
		if (a < b) {
			return b - a - 1;
		} else if (b < a) {
			return a - b - 1;
		} else {
			return 0;
		}
	}
	

}
