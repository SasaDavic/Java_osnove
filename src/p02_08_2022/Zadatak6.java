package p02_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji sa tastature ucitava ime, prezime, broj telefona, email. 
		 * korisnika i prikazuje u formatu:
					[Ime] [Prezime] - [JMBG]
					Broj Tel: [Broj telefona], 
					Email: [Email],
					
					Unesite ime: Milan
					Unesite prezime: Jovanvoci
					Unesite broj: +209329832
					Unesite email: milan@gmail.com
					Unesite jmbg: 329032938923
					
					Milan Jovanovic - 329032938923
					Broj tel:  +209329832
					Email: milan@gmail.com

		 */
		
		Scanner s =  new Scanner(System.in);
		String ime, prezime, brTelefona, email, jmbg;
		
		System.out.println("Unesite ime: ");
		ime = s.next();
		System.out.println("Unesite prezime: ");
		prezime = s.next();
		System.out.println("Unesite broj: ");
		brTelefona = s.next();
		System.out.println("Unesite email: ");
		email = s.next();
		System.out.println("Unesite jmbg: ");
		jmbg = s.next();
		
		System.out.println(ime + " " + prezime + " - " + jmbg);
		System.out.println("Broj tel: " + brTelefona);
		System.out.println("Email: " + email);

	}

}
