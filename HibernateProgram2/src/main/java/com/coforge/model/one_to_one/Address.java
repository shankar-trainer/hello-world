package com.coforge.model.one_to_one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue
	private int addr_id;
	private String addr_City;
	private String addr_State;
	private int pin;


	public int getAddr_id() {
		return addr_id;
	}

	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}

	public String getAddr_City() {
		return addr_City;
	}

	public void setAddr_City(String addr_City) {
		this.addr_City = addr_City;
	}

	public String getAddr_State() {
		return addr_State;
	}

	public void setAddr_State(String addr_State) {
		this.addr_State = addr_State;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

}
