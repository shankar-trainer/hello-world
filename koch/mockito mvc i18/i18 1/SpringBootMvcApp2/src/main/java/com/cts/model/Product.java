package com.cts.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Product {

	@NotNull(message = "product id is empty")
	private Integer prdId;
	@NotEmpty(message = "Product Name is empty")
	private String prdName;
	@NotNull(message = "Cost is blank")
	private Float cost;

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

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

}
