package org.montran.model;

public class Lic {
	private int licId;
	private String licPolicyName;
	private float licPolicyCost;

	public int getLicId() {
		return licId;
	}

	public void setLicId(int licId) {
		this.licId = licId;
	}

	public String getLicPolicyName() {
		return licPolicyName;
	}

	public void setLicPolicyName(String licPolicyName) {
		this.licPolicyName = licPolicyName;
	}

	public float getLicPolicyCost() {
		return licPolicyCost;
	}

	public void setLicPolicyCost(float licPolicyCost) {
		this.licPolicyCost = licPolicyCost;
	}

	@Override
	public String toString() {
		return "Lic [licId=" + licId + ", licPolicyName=" + licPolicyName + ", licPolicyCost=" + licPolicyCost + "]";
	}

	
}
