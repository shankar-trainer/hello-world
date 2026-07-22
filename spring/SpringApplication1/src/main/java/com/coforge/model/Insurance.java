package com.coforge.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Insurance {

	private int insuranceId;
	private String insuranceName;
	
	@PostConstruct
	public void  init() {
		System.out.println("insurance init called");
		this.insuranceId=8777887;
		this.insuranceName="healthcare insurance";
	}
	
	@PreDestroy
	public void  cleanup() {
		System.out.println("destroy called ");
	}
	
	
	public int getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	
	
}
