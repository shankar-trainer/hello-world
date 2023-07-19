package com.conforge.model.onetoone_bidirectional;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private int personId;
	private String personName;
	private float personSalary;

	@OneToOne(cascade = CascadeType.ALL)
	private Phone phone;
	
	@OneToMany
	private Set<Car> carSet;
	
	
	public Set<Car> getCarSet() {
		return carSet;
	}

	public void setCarSet(Set<Car> carSet) {
		this.carSet = carSet;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}


	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public float getPersonSalary() {
		return personSalary;
	}

	public void setPersonSalary(float personSalary) {
		this.personSalary = personSalary;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personSalary=" + personSalary
				+ ", phone=" + phone + "]";
	}

	
}
