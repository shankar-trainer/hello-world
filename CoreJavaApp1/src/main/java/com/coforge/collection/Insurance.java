package com.coforge.collection;

public class Insurance {
	private int insuranceId;
	private String insuranceName;
	private int insuranceYear;
	private float insurancePremium;

	public Insurance(int insuranceId, String insuranceName, int insuranceYear, float insurancePremium) {
		super();
		this.insuranceId = insuranceId;
		this.insuranceName = insuranceName;
		this.insuranceYear = insuranceYear;
		this.insurancePremium = insurancePremium;
	}

	
	public int getInsuranceId() {
		return insuranceId;
	}


	public String getInsuranceName() {
		return insuranceName;
	}


	public int getInsuranceYear() {
		return insuranceYear;
	}


	public float getInsurancePremium() {
		return insurancePremium;
	}


	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", insuranceName=" + insuranceName + ", insuranceYear="
				+ insuranceYear + ", insurancePremium=" + insurancePremium + "]";
	}
	

}
