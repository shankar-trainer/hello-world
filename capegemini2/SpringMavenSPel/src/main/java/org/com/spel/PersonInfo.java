package org.com.spel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PersonInfo {

	private List<Person> personList;

	@Value(value = "#{personInfo.personList[0]}")
	private Person firstPerson;
	@Value(value = "#{personInfo.personList[3]}")
	private Person lastPerson;

	public PersonInfo() {
		personList=new ArrayList<Person>();
		int id[] = { 1001, 1002, 1003, 1004 };
		String name[] = { "mohan kumar", "mahesh kumar", "lal babu", "sambhu kumar" };
		float salary[] = { 12000, 45000, 60000, 30000 };
		Person person[] = new Person[4];
		for (int i = 0; i < person.length; i++) {
			person[i] = new Person();
			person[i].setPersonId(id[i]);
			person[i].setPersonName(name[i]);
			person[i].setPersonSalary(salary[i]);
			personList.add(person[i]);
		}
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public Person getFirstPerson() {
		return firstPerson;
	}

	public void setFirstPerson(Person firstPerson) {
		this.firstPerson = firstPerson;
	}

	public Person getLastPerson() {
		return lastPerson;
	}

	public void setLastPerson(Person lastPerson) {
		this.lastPerson = lastPerson;
	}

}
