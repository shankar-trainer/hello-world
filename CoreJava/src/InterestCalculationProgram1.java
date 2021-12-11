import java.util.Scanner;

public class InterestCalculationProgram1 {

	static float calculation() {
		Scanner scanner = new Scanner(System.in);
		float amt, rate;
		int time;
		do {
			System.out.println("Enter amount ");
			amt = scanner.nextFloat();
		} while (amt <= 0);
		do {
			System.out.println("Enter time ");
			time = scanner.nextInt();
		} while (time <= 0);
		do {
			System.out.println("Enter rate ");
			rate = scanner.nextFloat();
		} while (rate <= 0);
		scanner.close();
		return amt * rate * time / 100;
	}

	public static void main(String[] args) {
		System.out.println("Interest is " + calculation());
	}
}
