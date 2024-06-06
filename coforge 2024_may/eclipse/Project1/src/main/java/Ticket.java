public class Ticket {

	private int ticketid;
	private int price;
	private static int availableTickets;

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		if (availableTickets <= 0)
		{	System.out.println("invalid value for  availableTickets");
		    System.exit(0);
		}
		else
			Ticket.availableTickets = availableTickets;
	}

	public int calculateTicketCost(int nooftickets) {
		if (availableTickets <= 0)
			return -1;
		else {
			availableTickets = availableTickets - nooftickets;
			return nooftickets * price;
		}
	}

}
