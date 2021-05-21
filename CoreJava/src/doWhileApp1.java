import java.util.Scanner;

public class doWhileApp1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Enter a positive no ");
			n = scanner.nextInt();
		} while (n <= 0);

		System.out.println("we got the number ");
	}
}
