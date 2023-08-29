
public class Calculation {

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
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x, y;

		System.out.println("Enter two no");
		x = sc.nextInt();
		y = sc.nextInt();

		int sum_result = addition(x, y);
		int sub_result = subtraction(x, y);

		System.out.println("Addition of " + x + " and " + y + " is " + sum_result);
		System.out.println("Subtraction of " + x + " and " + y + " is " + sub_result);

		System.out.println("Multiplication  of " + x + " and " + y + " is " + multiplication(x, y));
		System.out.println("Division  of " + x + " and " + y + " is " + division(x, y));

	}

}
