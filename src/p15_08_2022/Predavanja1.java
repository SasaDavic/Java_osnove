package p15_08_2022;

public class Predavanja1 {

	public static void main(String[] args) {
		printCao("Milan", "Jovanovic", 27);
		printCao("Nikola", "Nikolic", 30);
		
	}
//	name = "Milan"
	public static void printCao(String firstName, 
			String lastName, 
			int age) {
		System.out.println("Cao " + firstName + " " + lastName + "!");
		System.out.println("Age: " + age);

	}

}
