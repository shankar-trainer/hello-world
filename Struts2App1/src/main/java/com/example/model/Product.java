package com.example.model;

import com.opensymphony.xwork2.ActionSupport;

public class Product extends ActionSupport {

	private int prdId;
	private String prdName;
	private double prdCost;

	public double getPrdCost() {
		return prdCost;
	}

	public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}

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

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
