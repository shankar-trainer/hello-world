package org.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer prdId;

	private String prdName;
	private float prdCost;
	public Integer getPrdId() {
		return prdId;
	}
	public void setPrdId(Integer prdId) {
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
