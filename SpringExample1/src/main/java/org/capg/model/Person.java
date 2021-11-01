package org.capg.model;

public class Person {

	private int personId;
	private String  personName;
	private  PersonBirthday bday;
	                                   //loose coupling
	public Person(int personId, String personName, PersonBirthday bday) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.bday = bday;
	}
	@Override
	public String toString() {
		return "\nPerson \n\tpersonId=" + personId + ", \n\tpersonName=" + personName + "\nBirthday"  +bday ;
	}

	/*
	public Person() {
     bday=new PersonBirthday(22, 12, 1998);// only one value // tight coupling	
	}
	*/
	
	
}
