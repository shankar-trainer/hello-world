package com.flight.entities;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger bookingId;

	@OneToOne
	private User userId;

	private LocalDateTime bookingDateTime;

	private Double ticketCost;

	@OneToOne
	private ScheduledFlight scheduledFlight;

	private int noOfPassengers;

	@OneToMany
	private List<Passenger> passenger;

	public Booking() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the bookingId
	 */
	public BigInteger getBookingId() {
		return bookingId;
	}

	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(BigInteger bookingId) {
		this.bookingId = bookingId;
	}

	/**
	 * @return the userId
	 */
	public User getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(User userId) {
		this.userId = userId;
	}

	/**
	 * @return the bookingDateTime
	 */
	public LocalDateTime getBookingDateTime() {
		return bookingDateTime;
	}

	/**
	 * @param bookingDateTime the bookingDateTime to set
	 */
	public void setBookingDateTime(LocalDateTime bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}

	/**
	 * @return the ticketCost
	 */
	public Double getTicketCost() {
		return ticketCost;
	}

	/**
	 * @param ticketCost the ticketCost to set
	 */
	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}

	/**
	 * @return the scheduledFlight
	 */
	public ScheduledFlight getScheduledFlight() {
		return scheduledFlight;
	}

	/**
	 * @param scheduledFlight the scheduledFlight to set
	 */
	public void setScheduledFlight(ScheduledFlight scheduledFlight) {
		this.scheduledFlight = scheduledFlight;
	}

	/**
	 * @return the noOfPassengers
	 */
	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	/**
	 * @param noOfPassengers the noOfPassengers to set
	 */
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	/**
	 * @return the passenger
	 */
	public List<Passenger> getPassenger() {
		return passenger;
	}

	/**
	 * @param passenger the passenger to set
	 */
	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}

	/**
	 * @param userId
	 * @param bookingDateTime
	 * @param ticketCost
	 * @param scheduledFlight
	 * @param noOfPassengers
	 * @param passenger
	 */
	public Booking(User userId, LocalDateTime bookingDateTime, Double ticketCost, ScheduledFlight scheduledFlight,
			int noOfPassengers, List<Passenger> passenger) {
		this.userId = userId;
		this.bookingDateTime = bookingDateTime;
		this.ticketCost = ticketCost;
		this.scheduledFlight = scheduledFlight;
		this.noOfPassengers = noOfPassengers;
		this.passenger = passenger;
	}

}
