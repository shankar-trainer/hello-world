package com.cognizant.model;

public class Address {

	private int addrId;
	private String addrCity;
	private String  addrLocation;
	private int addrPin;
	
	private String  addrState;

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getAddrCity() {
		return addrCity;
	}

	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}

	public String getAddrLocation() {
		return addrLocation;
	}

	public void setAddrLocation(String addrLocation) {
		this.addrLocation = addrLocation;
	}

	public int getAddrPin() {
		return addrPin;
	}

	public void setAddrPin(int addrPin) {
		this.addrPin = addrPin;
	}

	public String getAddrState() {
		return addrState;
	}

	public void setAddrState(String addrState) {
		this.addrState = addrState;
	}
	
}
