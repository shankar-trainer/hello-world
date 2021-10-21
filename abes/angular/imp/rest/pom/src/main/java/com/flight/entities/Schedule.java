package com.flight.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduleId;
	@OneToOne(targetEntity = Airport.class)
	private Airport sourceAirport;
	@OneToOne(targetEntity = Airport.class)
	private Airport destinationAirport;
	private LocalDateTime arrival;
	private LocalDateTime departureTime;

	public Schedule() {
	}

	/**
	 * @return the scheduleId
	 */
	public int getScheduleId() {
		return scheduleId;
	}

	/**
	 * @param sourceAirport
	 * @param destinationAirport
	 * @param arrival
	 * @param departureTime
	 */
	public Schedule(Airport sourceAirport, Airport destinationAirport, LocalDateTime arrival,
			LocalDateTime departureTime) {
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrival = arrival;
		this.departureTime = departureTime;
	}

	/**
	 * @param scheduleId the scheduleId to set
	 */
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	/**
	 * @return the sourceAirport
	 */
	public Airport getSourceAirport() {
		return sourceAirport;
	}

	/**
	 * @param sourceAirport the sourceAirport to set
	 */
	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}

	/**
	 * @return the destinationAirport
	 */
	public Airport getDestinationAirport() {
		return destinationAirport;
	}

	/**
	 * @param destinationAirport the destinationAirport to set
	 */
	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	/**
	 * @return the arrival
	 */
	public LocalDateTime getArrival() {
		return arrival;
	}

	/**
	 * @param arrival the arrival to set
	 */
	public void setArrival(LocalDateTime arrival) {
		this.arrival = arrival;
	}

	/**
	 * @return the departureTime
	 */
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrival == null) ? 0 : arrival.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destinationAirport == null) ? 0 : destinationAirport.hashCode());
		result = prime * result + scheduleId;
		result = prime * result + ((sourceAirport == null) ? 0 : sourceAirport.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schedule other = (Schedule) obj;
		if (arrival == null) {
			if (other.arrival != null)
				return false;
		} else if (!arrival.equals(other.arrival))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destinationAirport == null) {
			if (other.destinationAirport != null)
				return false;
		} else if (!destinationAirport.equals(other.destinationAirport))
			return false;
		if (scheduleId != other.scheduleId)
			return false;
		if (sourceAirport == null) {
			if (other.sourceAirport != null)
				return false;
		} else if (!sourceAirport.equals(other.sourceAirport))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", sourceAirport=" + sourceAirport + ", destinationAirport="
				+ destinationAirport + ", arrival=" + arrival + ", departureTime=" + departureTime + "]";
	}



}
