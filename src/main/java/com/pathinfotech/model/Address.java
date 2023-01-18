package com.pathinfotech.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private int addrId;
	private String addrLocation;
	private String addrCity;
	private  String  addrState;
	
	@PostConstruct
	public void initaddress() {
	  this.addrId=77777;
	  this.addrLocation="laxminagare";
	  this.addrCity="new delhi";
	  this.addrState="delhi";
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
	public String getAddrState() {
		return addrState;
	}
	public void setAddrState(String addrState) {
		this.addrState = addrState;
	}
	
}
