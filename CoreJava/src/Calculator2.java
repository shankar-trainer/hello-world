import java.util.Scanner;

public class Calculator2 {

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
		switch (op) {
		case 1:
			System.out.println("addition is " + (x + y));
			break;
		case 2:
			System.out.println("subtraction is " + (x - y));
			break;
		case 3:
			System.out.println("Multiplication is " + (x * y));
			break;

		case 4:
			System.out.println("Division is " + (x / y));
			break;

		default:
			System.out.println("wrong input");
			break;
		}

	}
}
