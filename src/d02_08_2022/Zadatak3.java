package d02_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		/*  (Za vezbanje)Napisati program koji cuva i stampa podatke jednog bug reporta. 
		 * Bug je onaj koji ste radili na manuelnom delu
		 
			 “Aplikacija: Viber
			Opis problema: Ne uspevam sliku da pošaljem, izađe mi greška. 
			Probao sam sliku koju imam u telefonu sačuvanu da pošaljem.
			Zadatak: Proveriti slučaj koji je korisnik prijavio (zamislite da slanje slike zaista ne radi) 
			i sastavite bug report.”. 
			Bug report od informacija ima:
			ID (broj)
			Title
			Severity
			Priority
			Description
			Environment
			Steps to reproduce (jedna promenlijva)
			Expected result
			Actual result
			Imate slobodu da stampate podatke kako vam se najvise svidja.
*/
		
		String id = "#1005";
		String title = "Viber - nemoguce slanje slike";
		String description = "Aplikacija pokazuje gresku kada kliknemo na dugme send";
		String enviroment = "Mobilna aplikacija, Viber - Version 17.6.0.15";
		String steps = "Otvorimo Viber aplikaciju, izaberemo sliku iz galerije, kliknemo na dugme send.";
		String actualR = "Pojavljuje se greska: Oops, something went wrong.";
		String exspectedR = "Slika bi trebalo da bude poslata";
		String example = "screenshot photo";


		String severity = "High";
		String priority = "High";
		
		System.out.println("Bug report");
		System.out.println("ID: " + id);
		System.out.println("Title: " + title);
		System.out.println("Description: " + description);
		System.out.println("Environment: " + enviroment);
		System.out.println("Steps to reproduce: " + steps);
		System.out.println("Actual result: " + actualR);
		System.out.println("Expected result: " + exspectedR);
		System.out.println("Example: " + example);
		System.out.println("Additional info:  ");
		System.out.println("Severity: " + severity);
		System.out.println("Priority: " + priority);
		System.out.println("Reported by: ");

	}

}
