import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		boolean status = false;
		int count = 2;
		do {

			if (n % count == 0) {
				status = true;
				break;
			}
			count++;
		} while (count < n);
		if (status)
			System.out.println("not prime");
		else
			System.out.println("prime no ");
	}
}
