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
		   // only positive  values are allowed
		Ticket.availableTickets = availableTickets;
	}


	public int calculateTicketCost(int nooftickets) {
		  // no ticket available 
		return -1;
	}
}
