package com.capg.bean.inheritance.tableperconcreteclass;

import javax.persistence.Entity;

@Entity
public class CreditCard  extends Card{
  private float limit;

public float getLimit() {
	return limit;
}

public void setLimit(float limit) {
	this.limit = limit;
}
  
}
