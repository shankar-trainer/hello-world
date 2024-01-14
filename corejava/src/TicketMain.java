import java.util.Scanner;

public class TicketMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of bookings:");
		int booking = scanner.nextInt();

		System.out.println("Enter the available tickets:");
		Ticket.setAvailableTickets(scanner.nextInt());

		for (int i = 1; i <= booking; i++) {
			System.out.println("Enter the ticketid:");
			Ticket ticket = new Ticket();
			ticket.setTicketid(scanner.nextInt());

			System.out.println("Enter the price:");
			ticket.setPrice(scanner.nextInt());

			System.out.println("Enter the no of tickets:");
			int nooftickets = scanner.nextInt();

			System.out.println("Available tickets: " + Ticket.getAvailableTickets());

			System.out.println("Total amount " + ticket.calculateTicketCost(nooftickets));
			System.out.println("Available ticket after booking " + Ticket.getAvailableTickets());
		}

		scanner.close();
	}
}
