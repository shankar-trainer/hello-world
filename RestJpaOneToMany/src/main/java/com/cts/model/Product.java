package com.cts.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prdId;
	private String prdName;
	private float prdCost;
	private float prdTotalCost;
	
	public float getPrdTotalCost() {
		return prdTotalCost;
	}

	public void setPrdTotalCost(float prdTotalCost) {
		this.prdTotalCost = prdTotalCost;
	}

	private int prdCount;

	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public float getPrdCost() {
		return prdCost;
	}

	public void setPrdCost(float prdCost) {
		this.prdCost = prdCost;
	}

	public int getPrdCount() {
		return prdCount;
	}

	public void setPrdCount(int prdCount) {
		this.prdCount = prdCount;
	}

}
