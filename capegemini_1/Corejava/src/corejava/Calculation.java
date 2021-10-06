package corejava;

public class Calculation {

	static void addition() {
     System.out.println("addition");
	}

	static void addition(int a, int b) {
		System.out.println("addition of int is "+(a+b));
	}

	static void addition(int a, int b, int c) {
		System.out.println("addition of 3 int is "+(a+b+c));
	}

	static void addition(float a, float b) {
		System.out.println("addition of 2 decimal is "+(a+b));
	}

	static void addition(String a, String b) {
		System.out.println("full name is "+(a+"   "+b));
	}

	public static void main(String[] args) {
		addition();
		addition("ram", "kumar");
		addition(1,2,3);
		addition(1,2);
		addition(1.0f,2.0f);
	}
}
