package com.capg.bean.inheritance.singletableperclass;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int actId;
	private String actName;
	private float actBalance;

	public int getActId() {
		return actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public float getActBalance() {
		return actBalance;
	}

	public void setActBalance(float actBalance) {
		this.actBalance = actBalance;
	}

}
