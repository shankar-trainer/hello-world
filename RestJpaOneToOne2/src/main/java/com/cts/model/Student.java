package com.cts.model;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
@Entity
public class Student {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int roll;
	private String name;
	
	//@OneToOne(orphanRemoval = true)
	@OneToOne(fetch = FetchType.EAGER   , cascade = CascadeType.ALL, orphanRemoval = true )
	
	//@JoinColumn(name = "aId")
	private Address address;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
