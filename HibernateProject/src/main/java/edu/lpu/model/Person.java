package edu.lpu.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	@Id
	private int id;
	private String name;
	@OneToMany
	private  Set<Address> set_address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Address> getSet_address() {
		return set_address;
	}
	public void setSet_address(Set<Address> set_address) {
		this.set_address = set_address;
	}
	
}
