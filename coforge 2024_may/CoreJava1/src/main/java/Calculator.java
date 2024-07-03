public class Calculator {

	static int addition(int a, int b) {
		return a + b;
	}

	static int subtraction(int a, int b) {
		return a - b;
	}

	static int multiplication(int a, int b) {
		return a * b;
	}

	static int division(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		int a = 10, b = 5;
		System.out.println("Addition of " + a + " and " + b + " is " + addition(a, b));
		System.out.println("Subtraction of " + a + " and " + b + " is " + subtraction(a, b));
		System.out.println("Multiplication of " + a + " and " + b + " is " + multiplication(a, b));
		System.out.println("Division of " + a + " and " + b + " is " + division(a, b));
	}

}
