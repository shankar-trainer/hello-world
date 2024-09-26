import java.util.Scanner;

public class InterestCalculation1 {

	static float interest() {
		Scanner scanner = new Scanner(System.in);

		float amt = 0, rate = 0;
		int time = 0;

		do {
			System.out.println("Enter amt >=0");
			amt = scanner.nextFloat();
		} while (amt < 0);

		do {
			System.out.println("Enter rate >=0");
			rate = scanner.nextFloat();
		} while (rate < 0);

		do {
			System.out.println("Enter time >=0");
			time = scanner.nextInt();
		} while (time < 0);

		return amt * rate * time / 100;

	}

	public static void main(String[] args) {
		System.out.println("Interest is " + interest());
	}
}
