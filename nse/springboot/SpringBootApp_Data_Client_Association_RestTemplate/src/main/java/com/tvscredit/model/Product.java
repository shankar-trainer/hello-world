package com.tvscredit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private long prdId;
	private  String prdName;
	private double prdCost;

	public long getPrdId() {
		return prdId;
	}
	public void setPrdId(long prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public double getPrdCost() {
		return prdCost;
	}
	public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}
	
	
	
}
