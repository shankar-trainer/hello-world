package com.cts.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Hospital {

	private int hospitalRegNo;
	private String hospitalName;
	private String hospitalLocation;

	@PostConstruct
	public void init() {
		hospitalRegNo=677676;
		hospitalName="apollo ";
		hospitalLocation="perumgudi chennai";
		
		System.out.println("hospital init called ");
	}
	
	public int getHospitalRegNo() {
		return hospitalRegNo;
	}

	public void setHospitalRegNo(int hospitalRegNo) {
		this.hospitalRegNo = hospitalRegNo;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalLocation() {
		return hospitalLocation;
	}

	public void setHospitalLocation(String hospitalLocation) {
		this.hospitalLocation = hospitalLocation;
	}

}
