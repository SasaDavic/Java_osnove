package d15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
	//	Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. 
	//	U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

		int x = vratiNajmanji(1, 2, 3);
		int y = vratiNajmanji(9, 8, 7);
		int z = vratiNajmanji(4, 6, 5);
		int d = vratiNajmanji(2, 3, 2);
		System.out.println("Najmanja vrednost je redom: " + x + ", " + y + ", " + z + ", " + d);
		
	}
	
	public static int vratiNajmanji (int a, int b, int c) {
		if(a <= b && a <= c) {
			return a;
		} else if (b <= a && b <= c) {
			return b;
		}
		return c;
	}
	

}
