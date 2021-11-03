package org.capg.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Product {

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
	
	
}
