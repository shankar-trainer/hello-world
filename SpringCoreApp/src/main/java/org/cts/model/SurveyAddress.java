package org.cts.model;

public class SurveyAddress {
  
	private String location;
	private String state;
	private String country;
	private int pin;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "SurveyAddress [location=" + location + ", state=" + state + ", country=" + country + ", pin=" + pin
				+ "]";
	}
	
	
	
	
	
}
