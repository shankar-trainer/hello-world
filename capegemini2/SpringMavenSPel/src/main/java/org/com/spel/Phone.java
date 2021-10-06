package org.com.spel;

public class Phone {
	private long phNo; 
	private String phType;
	private float cost;
	
	
	@Override
	public String toString() {
		return "Phone [phNo=" + phNo + ", phType=" + phType + ", cost=" + cost + "]";
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getPhType() {
		return phType;
	}
	public void setPhType(String phType) {
		this.phType = phType;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
	

}
