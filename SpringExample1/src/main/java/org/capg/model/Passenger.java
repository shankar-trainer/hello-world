package org.capg.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Passenger {

	private int passengerId;
	private String passengerName;
	
	private String passengerEmail;
	private List<String> cityList;
	private Set<String> stateSet;
	private Map<String,String> countrycapital;
	private Properties cityTicket;
	
	public Map<String, String> getCountrycapital() {
		return countrycapital;
	}
	public void setCountrycapital(Map<String, String> countrycapital) {
		this.countrycapital = countrycapital;
	}
	public Properties getCityTicket() {
		return cityTicket;
	}
	public void setCityTicket(Properties cityTicket) {
		this.cityTicket = cityTicket;
	}
	
	
	
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	public List<String> getCityList() {
		return cityList;
	}
	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}
	public Set<String> getStateSet() {
		return stateSet;
	}
	public void setStateSet(Set<String> stateSet) {
		this.stateSet = stateSet;
	}

	
}
