package p05_08_2022;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
	/*
(ZA VEZBANJE) Napisati program koji iscrtava timeline na youtube videu. 
Korisnik unosi duzinu videa u sekundama i trenutno vreme u videu, 
a program iscrtava timeline tako sto deo koji je pogledan iscrtava zvezdicama a ostatak sa crticama. 
Timeline je kontrola koja ima tacno 100 karaktera.
Primer izvrsenja:
Unesite duzinu videa (s): 203
Unesite trenutno vreme videa (s): 20
(Objasnjenje:Ako video ima 203s a mi smo na 20s, to znaci da je pogledano 9.85% videa 
(zaokruzicemo to na 9zvezdice ostatak do 100 su crtice)
*********-------------------------------------------------------------------------------------------

MOGUCA SU DVA RESENJA:
Jedno je sa jednom petljom koja u sebi ima if i else
Drugo je sa 2 petlje, jedna stampa zvezdice a druga stampa crtice

	(DOPUNA TAKODJE ZA VEZBANJE)
Pretvorite vremena u minute i sekune i stavite ih ispod prikaza:
Primer izvrsenja:
Unesite duzinu videa (s): 203
Unesite trenutno vreme videa (s): 20
(Objasnjenje:Ako video ima 203s a mi smo na 20s, to znaci da je pogledano 9.85% videa 
(zaokruzicemo to na 9zvezdice ostatak do 100 su crtice)
*********-------------------------------------------------------------------------------------------
 0:20 / 3:23


	 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite duzinu videa (s): ");
		int duzinaVidea = s.nextInt();
		System.out.println("Unesite trenutno vreme videa (s): ");
		int trenutnoVremeVidea = s.nextInt();
		
		int procenatOdgledanog = trenutnoVremeVidea * 100 / duzinaVidea;
		int minOdgledano = trenutnoVremeVidea / 60;
		int minVideo = duzinaVidea /60;
		int secOdgledano = trenutnoVremeVidea % 60;
		int secVideo = duzinaVidea % 60;
		
		for (int i = 1; i < 101; i++) {
			if (i <= procenatOdgledanog) {
				System.out.print("*");
			} else {
				System.out.print("-");
			}			
		}
		System.out.println();
		System.out.println(minOdgledano + ":" + secOdgledano + " / " + minVideo + ":" + secVideo);
		//II nacin
		
		for (int i = 1; i <= procenatOdgledanog ; i++) {
			System.out.print("*");
		}
		for (int i = procenatOdgledanog + 1; i <= 100 ; i++) {
			System.out.print("-");
		}
		
		
		
		
		
		

	}

}
