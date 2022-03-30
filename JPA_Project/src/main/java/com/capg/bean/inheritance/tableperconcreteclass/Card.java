package com.capg.bean.inheritance.tableperconcreteclass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private float balance;
	private String payment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
}
