package p02_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
	/*
Naci zbir, razliku, kolicnik i proizvod brojeva a i b i rezultate smestati u odgovarajuce     promenljive.Na kraju programa odstampati rezultate
Primer izvrsenja:
a: 10
b: 2
Zbir je 12
Razlika je 8
Proizvod je 20
Kolicnik je 5

	 */

//		int a = 10;
//		int b = 2;
		int a = 10, b = 2, zbir = 0, razlika = 0, kolicnik = 0, proizvod = 0;

		zbir = a + b;
		razlika = a - b;
		kolicnik = a / b;
		proizvod = a * b;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("Zbir: " + (a + b));
		System.out.println("Razlika: " + razlika);
		System.out.println("Kolicnik: " + kolicnik);
		System.out.println("Proizvod: " + proizvod);
	}

}
