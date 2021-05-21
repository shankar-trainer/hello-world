import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no1");
		int x = scanner.nextInt();

		System.out.println("Enter no1");
		int y = scanner.nextInt();

		System.out.println("select operation ");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

		// char op=scanner.next().charAt(0);
		int op = scanner.nextInt();

		if (op == 1) {
			System.out.println("addition is " + (x + y));
		} else if (op == 2) {
			System.out.println("subtraction is " + (x - y));
		} else if (op == 3) {
			System.out.println("Multiplication is " + (x * y));
		} else if (op == 4) {
			System.out.println("Division is " + (x / y));
		}

		else
			System.out.println("wrong input");

	}
}
