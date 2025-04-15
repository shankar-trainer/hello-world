package com.example.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Insurance {

	private int insuranceId;
	private String insuranceName;
	private float insurancePremimum;
	
	@PostConstruct
	public void init() {
		this.insuranceId=87878787;
		this.insuranceName="jeevan surbhi";
		this.insurancePremimum=15000.0f;
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


	public float getInsurancePremimum() {
		return insurancePremimum;
	}


	public void setInsurancePremimum(float insurancePremimum) {
		this.insurancePremimum = insurancePremimum;
	}


	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", insuranceName=" + insuranceName + ", insurancePremimum="
				+ insurancePremimum + "]";
	}
	
	
	
}
