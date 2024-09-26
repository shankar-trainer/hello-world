package com.montran.model;

public class Ticket {
	private int ticketId;
	private float ticketCost;
	private String ticketToLocation;
	private String ticketFromLocation;
	private String ticketType;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public float getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(float ticketCost) {
		this.ticketCost = ticketCost;
	}

	public String getTicketToLocation() {
		return ticketToLocation;
	}

	public void setTicketToLocation(String ticketToLocation) {
		this.ticketToLocation = ticketToLocation;
	}

	public String getTicketFromLocation() {
		return ticketFromLocation;
	}

	public void setTicketFromLocation(String ticketFromLocation) {
		this.ticketFromLocation = ticketFromLocation;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

}
