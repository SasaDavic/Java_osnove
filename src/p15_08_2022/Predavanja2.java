package p15_08_2022;

public class Predavanja2 {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		
		int z = sumiraj(10, 20);
		System.out.println(z);
		double x = multiply(10, 4);
		System.out.println(x);
	}
// 	void => nemam povratnu vredost
//	int
//	double
//	String
//	char
//	ArrayList<String>
	public static int sumiraj(int a, int b) {
		return a + b;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
	}

}
