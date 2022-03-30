package com.capg.bean.inheritance.tableperconcreteclass;

import javax.persistence.Entity;

@Entity
public class DebitCard  extends Card{
 private String state;

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}
 
}
