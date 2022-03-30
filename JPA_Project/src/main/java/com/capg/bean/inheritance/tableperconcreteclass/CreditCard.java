package com.capg.bean.inheritance.tableperconcreteclass;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CreditCard  extends Card{
 
	@Column(name = "amount_limit")
	private float limit;

public float getLimit() {
	return limit;
}

public void setLimit(float limit) {
	this.limit = limit;
}
  
}
