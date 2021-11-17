import java.util.Scanner;

public class OddLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = "y";

		int sum = 0, x = 0;
		while (s.equals("y")) {
			System.out.println("Enter number");
			x = sc.nextInt();
			sum = sum + x;

			System.out.println("next number y\\n");
			s = sc.next();

		}
		System.out.println("sum is " + sum);
	}
}
