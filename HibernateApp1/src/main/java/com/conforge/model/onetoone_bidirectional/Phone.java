package com.conforge.model.onetoone_bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Phone {
	@Id
	@GeneratedValue
	private int phoneId;
	private String phoneModel;
	private float phoneCost;
	
	@OneToOne(mappedBy = "phone")
	Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	public float getPhoneCost() {
		return phoneCost;
	}

	public void setPhoneCost(float phoneCost) {
		this.phoneCost = phoneCost;
	}

	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneModel=" + phoneModel + ", phoneCost=" + phoneCost + ", person="
				+ person + "]";
	}

	
}
