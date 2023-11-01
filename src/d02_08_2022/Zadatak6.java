package d02_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		/*  Napisati program koji ima informacije koje ucitava informacije sa tastature:
		Ime 
		Prezime
		godinu rodjenja
		I stampa informaicije u formatu:
		[ime] [prezime] - [startost] god

		Primer izvrsenja: 
		Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
		Milan Jovanovic - 26 god
*/

Scanner s = new Scanner(System.in);

String ime, prezime;
int godRodjenja;

System.out.println("Unesite Vase ime: ");
ime = s.next();
System.out.println("Unesite Vase prezime: ");
prezime = s.next();
System.out.println("Unesite godinu rodjenja: ");
godRodjenja = s.nextInt();


godRodjenja = s.nextInt();


	}

}
