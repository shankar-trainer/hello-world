import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {

		// int n = 1562;
		System.out.println("Enter number ");
		int n = new Scanner(System.in).nextInt();
		int sum = 0;
		int x = 0;

		// for (; n != 0;)
		while (n != 0) {
			x = n % 10;
			sum = sum + x;
			n = n / 10;
		}
		System.out.println("sum of digit  is " + sum);
	}
}
