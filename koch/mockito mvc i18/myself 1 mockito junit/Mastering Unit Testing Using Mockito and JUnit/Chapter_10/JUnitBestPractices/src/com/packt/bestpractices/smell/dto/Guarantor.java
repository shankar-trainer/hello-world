package com.packt.bestpractices.smell.dto;

public class Guarantor {
	private GuarantorType guarantorType;
	private Organization organization;
	private Person person;

	public GuarantorType getGuarantorType() {
		return guarantorType;
	}

	public void setGuarantorType(GuarantorType guarantorType) {
		this.guarantorType = guarantorType;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
