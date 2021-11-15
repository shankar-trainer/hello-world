import java.util.Scanner;

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

	static int quotient(int a, int b) {
		return a / b;
	}

	static int remainder(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ch = "y";
		do {
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication ");
			System.out.println("4.Division");
			System.out.println("5.Quotient");
			System.out.println("6.Remainder");
			System.out.println("\nEnter Operation code");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("addition is "+addition(a, b));
				break;
			case 2:	
				System.out.println("subtraction is "+subtraction(a, b));
				break;
			case 3:	
				System.out.println("multiplication is "+multiplication(a, b));
				break;
			case 4:	
				System.out.println("division is "+division(a, b));
				break;
			case 5:	
				System.out.println("quotient is "+quotient(a, b));
				break;
			case 6:	
				System.out.println("remainder is "+remainder(a, b));
				break;
			default:
				System.out.println("Illegal operation code");
			}
			System.out.println("Continue y\\n");
			ch = sc.next();
		} while (ch.equals("y"));
		sc.close();
	}

}
