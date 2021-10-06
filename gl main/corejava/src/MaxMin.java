import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int max = 0, min = 0, n;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Enter no");
			n = scanner.nextInt();
			if (i == 1) {
				max = min = n;
			}

			else if (n>= max)
				max = n;
			else if (n <= min)
				min = n;
		}

		System.out.println("max is " + max);
		System.out.println("min is " + min);
	}
}
