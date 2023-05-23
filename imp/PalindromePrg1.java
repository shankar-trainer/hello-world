import java.util.Scanner;

public class PalindromePrg1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = scanner.nextInt();
		int y = x;
		int z, a = 0;
		do {
			z = x % 10;
			a = (a * 10) + z;
			x = x / 10;
		} while (x != 0);

		System.out.println("palindrome " + (a == y));
		scanner.close();
	}
}
