package com.cts.model;
public class Address {
	
	private int addrId;
	private String addrLocation;
	private  String addrCity;
	private String addrState;

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", addrLocation=" + addrLocation + ", addrCity=" + addrCity
				+ ", addrState=" + addrState + "]";
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
