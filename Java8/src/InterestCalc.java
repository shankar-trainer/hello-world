import java.util.Scanner;
/**
 * 
 *  @author admin
 *  @apiNote  
 *  This program is for interest calculation 
 */

public class InterestCalc {

	/** 
	 * it has 3 variable 
	 * amount, rate and time   
	 */
	public static void main(String[] args) {
		float amount;
		float rate;
		int time;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("enter amount");
			amount = scanner.nextFloat();
		} while (amount <= 0);

		do {
			System.out.println("enter rate");
			rate = scanner.nextFloat();
		} while (rate <= 0);

		do {
			System.out.println("enter time");
			time = scanner.nextInt();
		} while (time <= 0);

		float interest = amount * rate * time / 100;
		System.out.println(
				"amount is " + amount + "\nrate is " + rate + "\ntime is " + time + "\nInterest is " + interest);
		scanner.close();
	}
}
