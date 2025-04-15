package com.cts.model;

import javax.annotation.PostConstruct;

public class Address {

	private int addrId;
	private String addrLocation;
	private String addrCity;

	@PostConstruct
	public void init() {
		System.out.println("address init called ...");
		this.addrCity="chennai";
		this.addrLocation="thoraipakkam";
		this.addrId=777676;
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getAddrLocation() {
		return addrLocation;
	}

	public void setAddrLocation(String addrLocation) {
		this.addrLocation = addrLocation;
	}

	public String getAddrCity() {
		return addrCity;
	}

	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", addrLocation=" + addrLocation + ", addrCity=" + addrCity + "]";
	}
	

}
