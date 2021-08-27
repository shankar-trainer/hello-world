package com.example.model;

import com.opensymphony.xwork2.ActionSupport;

public class Product  extends ActionSupport{

	private int prdId;
	private String prdName;
	private float prdCost;

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

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}