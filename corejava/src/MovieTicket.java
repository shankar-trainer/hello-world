import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {

		int no_of_ticket = 0;
		float total_cost = 0;
		char circle, refreshment, coupon_code;
		float refreshment_total = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the no of tickets:");
		no_of_ticket = scanner.nextInt();

		if (no_of_ticket < 5 || no_of_ticket > 40) {
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
			return;
		}

		System.out.println("Do you want refreshment:");
		refreshment = scanner.next().charAt(0);

		System.out.println("Do you have coupon code:");
		coupon_code = scanner.next().charAt(0);

		System.out.println("Enter the circle:");
		circle = scanner.next().charAt(0);

		if (refreshment == 'y')
			refreshment_total = no_of_ticket * 50;

		if (circle == 'k')
			total_cost = no_of_ticket * 75;

		else if (circle == 'q')
			total_cost = no_of_ticket * 150;

		else {
			System.out.println("Invalid Input");
			return;
		}

		if (no_of_ticket > 20)
			total_cost = total_cost - (total_cost * 10 / 100);

		if (coupon_code == 'y')
			total_cost = total_cost - (total_cost * 2 / 100);

		total_cost = total_cost + refreshment_total;
		System.out.println("Ticket cost:" + total_cost);
		scanner.close();
	}
}
