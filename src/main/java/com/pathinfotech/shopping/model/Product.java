package com.pathinfotech.shopping.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Product {

	private int prdId;
	private  String prdName;
	private  float prdCost;
	
	@Override
	public int hashCode() {
		return Objects.hash(prdCost, prdId, prdName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Float.floatToIntBits(prdCost) == Float.floatToIntBits(other.prdCost) && prdId == other.prdId
				&& Objects.equals(prdName, other.prdName);
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
	public float getPrdCost() {
		return prdCost;
	}
	public void setPrdCost(float prdCost) {
		this.prdCost = prdCost;
	}


}
