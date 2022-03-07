import java.util.Scanner;
public class Prime {

	static boolean checkPrime(int c) {
		if (c == 1)
			return true;
		int i;
		
		for (i = 2; i <= c - 1; i++) {
			if (c % i == 0)
				break;
		}
		
		if (i == c)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter n number to check prime no");
		int n = scanner.nextInt();

		if (checkPrime(n))
			System.out.println(n + " is prime no");
		else
			System.out.println(n + " is not  prime no");
		scanner.close();

	}
}
