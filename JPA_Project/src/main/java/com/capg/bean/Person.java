package com.capg.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	private int personId;
	private String personName;
	private float personSalary;

	public int getPersonId() {
		return personId;
	}

	@Override
	public String toString() {
		return "Person \n\tpersonId=" + personId + ", \tpersonName=" + personName + ",\tpersonSalary=" + personSalary;
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

}
