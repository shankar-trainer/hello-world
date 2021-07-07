import java.util.Scanner;

public class InterestCalculation {

	public static void main(String[] args) {

		int amt, time;
		float rate;
		// above all values must be positive

		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter amount");
			amt = scanner.nextInt();
		} while (amt <= 0);

		do {
			System.out.println("Enter time");
			time = scanner.nextInt();
		} while (time <= 0);

		do {
			System.out.println("Enter rate");
			rate = scanner.nextFloat();
		} while (rate <= 0);
		float i = amt * time * rate / 100;

		System.out.println("Interest is " + i);
	}
}
