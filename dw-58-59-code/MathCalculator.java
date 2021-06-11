
public class MathCalculator {

	static void addition(int a, int b) {
		System.out.println("addition of " + a + " and " + b + " is " + (a + b));
	}

	static void subtraction(int a, int b) {
		System.out.println("subtraction of " + a + " and " + b + " is " + (a - b));
	}

	static void multiplication(int a, int b) {
		System.out.println("multiplication of " + a + " and " + b + " is " + (a * b));
	}

	static void division(int a, int b) {
		System.out.println("division of " + a + " and " + b + " is " + (a / b));
	}

	public static void main(String[] args) {
		addition(1, 2);
		subtraction(22, 3);
		multiplication(22, 3);
		division(12, 2);
		
		System.out.println("hello world  " );
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.sin(Math.PI/2));
	}
}
