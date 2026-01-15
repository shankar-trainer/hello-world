public class Calculator {

	static float addition(float a, float b) {
		return a + b;
	}

	static float subtraction(float a, float b) {
		return a - b;
	}

	static float multiplication(float a, float b) {
		return a * b;
	}

	static float division(float a, float b) {
		return a / b;
	}

	public static void main(String[] args) {
		float x, y;
		java.util.Scanner sc = new java.util.Scanner(System.in);

		String ch = "y";

		do {
			System.out.println("enter two number");
			x = sc.nextFloat();
			y = sc.nextFloat();

			System.out.println("Select required operation");

			System.out.println("1. Addition");
			System.out.println("2. Subtraction ");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");

			int key = sc.nextInt();
			// String key=sc.next();
			switch (key) {
			case 1:
				// case "Addition":
				System.out.println("Addition of " + x + "and " + y + " is " + addition(x, y));
				break;

			case 2:
				System.out.println("Subtraction of " + x + "and " + y + " is " + subtraction(x, y));
				break;

			case 3:
				System.out.println("Multiplication of " + x + "and " + y + " is " + multiplication(x, y));
				break;

			case 4:
				System.out.println("Division of " + x + "and " + y + " is " + division(x, y));
				break;

			default:
				System.out.println("wrong choice");
			}
			System.out.println("continue y\\n");
			ch=sc.next();

		} while (ch.equals("y"));

	}
}
