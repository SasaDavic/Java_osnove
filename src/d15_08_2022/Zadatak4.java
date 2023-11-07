package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
	/*
Napisati metodu koja stampa podatke o korisniku u formatu:
JMBG: [jmbg]
Ime: [ime]
Prezime: [prezime]
God. rodjenja: [god]
Aktivan: [true/false]
Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
Metoda nista ne vraca.

	 */
		stampaj("010203698554", "Mina", "Lakic", 2002, false);
	}
	
	public static void stampaj(String jmbg, String ime, String prezime, int godRodjenja, boolean aktivan) {
		System.out.println("JBMG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("Godina rodjenja: " + godRodjenja);
		System.out.println("Aktivan: " + aktivan);
	}

}
