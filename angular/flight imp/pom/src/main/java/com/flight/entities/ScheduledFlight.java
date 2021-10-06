package com.flight.entities;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class ScheduledFlight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger scheduleId;

	
	@OneToOne
	private Flight flight;
	@NotNull
	private int availableSeats;

	@OneToOne
	private Schedule schedule;
	
	public ScheduledFlight() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the scheduleId
	 */
	public BigInteger getScheduleId() {
		return scheduleId;
	}

	/**
	 * @param scheduleId the scheduleId to set
	 */
	public void setScheduleId(BigInteger scheduleId) {
		this.scheduleId = scheduleId;
	}

	/**
	 * @return the availableSeats
	 */
	public int getAvailableSeats() {
		return availableSeats;
	}

	/**
	 * @param availableSeats the availableSeats to set
	 */
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	/**
	 * @return the flight
	 */
	public Flight getFlight() {
		return flight;
	}

	/**
	 * @param flight the flight to set
	 */
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	/**
	 * @return the schedule
	 */
	public Schedule getSchedule() {
		return schedule;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	/**
	 * @param flight
	 * @param availableSeats
	 * @param schedule
	 */
	public ScheduledFlight(Flight flight, int availableSeats, Schedule schedule) {
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.schedule = schedule;
	}

	

	
	
	
	
}
