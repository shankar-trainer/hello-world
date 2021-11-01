package org.capg.model;

public class PersonBirthday {
	private int day;
	private int month;
	private int year;

	public PersonBirthday(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "\n\nPersonBirthday \n\tday=" + day + ", \n\tmonth=" + month + ", \n\tyear=" + year ;
	}
}
