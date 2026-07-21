package com.coforge.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue
	private int addr_id;

	private String city;
	private String state;
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Address [addr_id=" + addr_id + ", city=" + city + ", state=" + state + "]";
	}

	public int getAddr_id() {
		return addr_id;
	}

	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
