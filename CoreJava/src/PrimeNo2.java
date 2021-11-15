import java.util.Scanner;

public class PrimeNo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int counter = 2;

		while (counter <= n - 1) {
			if (n % counter == 0)
				break;
			counter++;
		}

		System.out.println(n + "  is prime  --" + (counter == n));
		scanner.close();
	}
}
