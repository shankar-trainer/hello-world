import java.util.Scanner;

public class PalindromePrg2 {

	static boolean checkPalindrome(int p) {
		int y = p;
		int z, a = 0;
		do {
			z = p % 10;
			a = (a * 10) + z;
			p = p / 10;
		} while (p != 0);
		return (a == y);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = scanner.nextInt();
		System.out.println("palindrome " + checkPalindrome(x));
		scanner.close();
	}
}
