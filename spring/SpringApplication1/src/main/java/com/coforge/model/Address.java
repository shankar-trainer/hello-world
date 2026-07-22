package com.coforge.model;

public class Address {
	private int addr_id;
	private String location;
	private String city;

	public int getAddr_id() {
		return addr_id;
	}

	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [addr_id=" + addr_id + ", location=" + location + ", city=" + city + "]";
	}

}
