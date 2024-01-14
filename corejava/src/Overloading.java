//polymorphism using overloading(compile time)
public class Overloading {

	static void addition(int a, int b) {
		System.out.println("integer 2 args addition  " + (a + b));
	}

	static void addition(int a, int b, int c) {
		System.out.println("integer 3 args addition  " + (a + b + c));
	}

	static void addition(String a, String b) {
		System.out.println("full name is " + (a.concat(" " + b)));
		System.out.println("full name is " + a + " " + b);
	}

	static void addition(float a, float b) {
		System.out.println("decimal addition is " + (a + b));
	}

	public static void main(String[] args) {
		addition("ram", "kumar");
		addition(11f, 2.4f);
		addition(11, 22);
		addition(11, 22, 33);
	}
}
