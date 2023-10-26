package p02_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napisati program koji na ekranu stampa podatke u formatu:
//		Sifra [SIFRA PROIZVODA]
//		[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//		[BOJA], [VELICINA]
//
//		Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//
//		Primer izvrsenja:
//		Sifra x932k20
//		Nike Patike - $90 - Popust 13.5%
//		Crna, 46.5

	String sifra = "asdkfa89";
	String naziv = "Nike patike";
	int cena = 21;
	double popust = 13.5;
	popust = 12;
	String boja = "Bela";
	double velicina = 46.5;
	double x = 12;

	System.out.println("Sifra " + sifra);
	System.out.println(naziv + " - $" + cena + " - Popust " + popust + "%");
	System.out.println(boja + ", " + velicina);


	}

}
