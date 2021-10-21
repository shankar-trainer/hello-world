package org.cts.beans;

public class Address {

	private String sector;
	private String city;
	private String state;
	private int pin;
	
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "Address [sector=" + sector + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}
	
	
	
}
