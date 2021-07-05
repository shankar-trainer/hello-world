
public class Calculation {

	static float addition(float a, float b) {
		return a + b;
	}

	static void subtraction(float a, float b) {
		System.out.println("subtraction is " + (a - b));
	}

	static float multiplication(float a, float b) {
		return a * b;
	}

	static float division(float a, float b) {
		return a / b;
	}

	public static void main(String[] args) {
		int x = 10, y = 5;
		System.out.println("Addition is " + addition(x, y));
		subtraction(x, y);

		System.out.println("Multiplication is " + multiplication(x, y));
		System.out.println("Divison  is " + division(x, y));
	}
}
