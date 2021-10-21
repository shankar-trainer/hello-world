package org.cts.beans;

public class Person {

	private int person_Id;
	private String person_Name;
	private String person_Location;
	
	private Phone phone;

	public Person(int person_Id, String person_Name, String person_Location, Phone phone) {
		super();
		this.person_Id = person_Id;
		this.person_Name = person_Name;
		this.person_Location = person_Location;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [person_Id=" + person_Id + ", person_Name=" + person_Name + ", person_Location="
				+ person_Location + ", phone=" + phone + "]";
	}
	
	
	
	
}
