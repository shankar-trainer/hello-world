package com.cg.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ticket")
public class Ticket implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ticketId;
	private Integer noOfSeats;
	@ElementCollection
	private List<String> seatName;
	private boolean ticketStatus;
	private String screenName;

	public Ticket() {

	}



	public Ticket(Integer ticketId, Integer noOfSeats, List<String> seatName, boolean ticketStatus, String screenName) {
		super();
		this.ticketId = ticketId;
		this.noOfSeats = noOfSeats;
		this.seatName = seatName;
		this.ticketStatus = ticketStatus;
		this.screenName = screenName;
	}



	public Integer getTicketId() {
		return ticketId;
	}



	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}



	public Integer getNoOfSeats() {
		return noOfSeats;
	}



	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}



	public List<String> getSeatName() {
		return seatName;
	}



	public void setSeatName(List<String> seatName) {
		this.seatName = seatName;
	}



	public boolean isTicketStatus() {
		return ticketStatus;
	}



	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}



	public String getScreenName() {
		return screenName;
	}



	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}



	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", noOfSeats=" + noOfSeats + ", seatName=" + seatName
				+ ", ticketStatus=" + ticketStatus + ", screenName=" + screenName + "]";
	}

	
}
