import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");
		int a = sc.nextInt();

		System.out.println("Enter second number");
		int b = sc.nextInt();

		System.out.println("Addition  of " + a + " and " + b + " is " + (a + b));
		System.out.println("Subtraction  of " + a + " and " + b + " is " + (a - b));
		System.out.println("Multiplication  of " + a + " and " + b + " is " + (a * b));
		System.out.println("Division   of " + a + " and " + b + " is " + (a / b));

		sc.close();

	}

}
