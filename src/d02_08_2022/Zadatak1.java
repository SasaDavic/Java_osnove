package d02_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		/* 
		 * Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici. 
		 * Od informacija se pamti broj kartice (16 cifara sa razmacima), mesec i godina do kada vazi kartica,
		 * kao i ime i prezime vlasnika kartice. Kartica se stampa sa zvezdicama i ne brinite ukoliko 
		 * neka zvezdica mrdne i nije u liniji to ce zavisiti od duzine imena.

		 */
		
		String ime, prezime, brKartice, mesecIsteka, godVazenja;
		ime = "Sasa";
		prezime = "Davic";
		brKartice = "1234 4564 8523 6478";
		mesecIsteka = "03";
		godVazenja = "23";
		
		System.out.println("*************************************");
		System.out.println("*  Credit Card                      *");
		System.out.println("*    ****                           *");
		System.out.println("*    ****                           *");
		System.out.println("*       " + brKartice + "         *");
		System.out.println("*                  valid > " + mesecIsteka + "/" + godVazenja + "    *");
		System.out.println("*                                   *");
		System.out.println("*    " + ime + " " + prezime +  "                     *");
		System.out.println("*************************************");
		
		


	}

}
