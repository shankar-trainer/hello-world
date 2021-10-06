package org.com.spel;

 
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private int personId;
	private String personName;
	private float personSalary;
	
	 
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
		return "Person [personId=" + personId + ", personName=" + personName + ", personSalary=" + personSalary + "]";
	}
	
	
	

}
