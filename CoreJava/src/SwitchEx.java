import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		int x, y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter two no ");
		x = scanner.nextInt();
		y = scanner.nextInt();

		System.out.println("enter choice ");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

		int k = scanner.nextInt();

		switch (k) {
		case 1:
			System.out.println("Addition is " + (x + y));
			break;
		case 2:
			System.out.println("Subtraction is " + (x - y));
			break;
		case 3:
			System.out.println("Multiplication  is " + (x * y));
			break;
		case 4:
			System.out.println("Division is " + (x / y));
			break;

		default:
			System.out.println("illegal choice");
			break;
		}
		scanner.close();
	}
}
