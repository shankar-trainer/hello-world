
public class TicketMain {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter no of bookings:");
		int no_booking = sc.nextInt();

		Ticket ticket=new Ticket();
		
		System.out.println("Enter the available tickets:");
		int availableTickets = sc.nextInt();
		Ticket.setAvailableTickets(availableTickets);
		
		do {
			

			System.out.println("Enter the ticketid:");
			int ticketid = sc.nextInt();

			System.out.println("Enter the price:");
			int price = sc.nextInt();

			System.out.println("Enter the no of tickets:");
			int noofticket = sc.nextInt();

			ticket.setPrice(price);
			ticket.setTicketid(ticketid);
			
			System.out.println("Available tickets:"+Ticket.getAvailableTickets());
			int calculateTicketCost = ticket.calculateTicketCost(noofticket);
			if(calculateTicketCost==-1)
			{
				System.out.println("tickets not available ");
				System.exit(1);
			}
			
			System.out.println("Total amount: "+calculateTicketCost);
			System.out.println("Available ticket after booking :"+Ticket.getAvailableTickets());
						
			no_booking--;

		} while (no_booking >= 1);

		sc.close();
	}
}
