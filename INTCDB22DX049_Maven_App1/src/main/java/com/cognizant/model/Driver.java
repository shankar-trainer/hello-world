package com.cognizant.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

//@Component
public class Driver {

	private int driverId;
	private String  driverName;
	private int driverAge;
	
	//@PostConstruct
	public void driverinit() {
		this.driverId=9009;
		this.driverName="sushant bhaskar";
		this.driverAge=23;
	}
	
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public int getDriverAge() {
		return driverAge;
	}
	public void setDriverAge(int driverAge) {
		this.driverAge = driverAge;
	}
	
	
}
