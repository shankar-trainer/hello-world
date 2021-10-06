package com.flight.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airport")
public class Airport {

	@Id
	private String airportCode;
	private String airportName;
	private String airportLocation;
	
	/**
	 * 
	 */
	public Airport() {
	}
	
	/**
	 * @param airportName
	 * @param airportLocation
	 * @param airportCode
	 */
	public Airport(String airportName, String airportLocation, String airportCode) {
		this.airportName = airportName;
		this.airportLocation = airportLocation;
		this.airportCode = airportCode;
	}

	/**
	 * @return the airportName
	 */
	public String getAirportName() {
		return airportName;
	}

	/**
	 * @param airportName the airportName to set
	 */
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	/**
	 * @return the airportLocation
	 */
	public String getAirportLocation() {
		return airportLocation;
	}

	/**
	 * @param airportLocation the airportLocation to set
	 */
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}

	/**
	 * @return the airportCode
	 */
	public String getAirportCode() {
		return airportCode;
	}

	/**
	 * @param airportCode the airportCode to set
	 */
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airportCode == null) ? 0 : airportCode.hashCode());
		result = prime * result + ((airportLocation == null) ? 0 : airportLocation.hashCode());
		result = prime * result + ((airportName == null) ? 0 : airportName.hashCode());
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
		Airport other = (Airport) obj;
		if (airportCode == null) {
			if (other.airportCode != null)
				return false;
		} else if (!airportCode.equals(other.airportCode))
			return false;
		if (airportLocation == null) {
			if (other.airportLocation != null)
				return false;
		} else if (!airportLocation.equals(other.airportLocation))
			return false;
		if (airportName == null) {
			if (other.airportName != null)
				return false;
		} else if (!airportName.equals(other.airportName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airport [airportName=" + airportName + ", airportLocation=" + airportLocation + ", airportCode="
				+ airportCode + "]";
	}
	
	
	
}
