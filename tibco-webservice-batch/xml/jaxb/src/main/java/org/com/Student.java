package org.com;

import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	/*//private Stud stud;

	public Stud getStud() {
		return stud;
	}

	public void setStud(Stud stud) {
		this.stud = stud;
	}*/

	private List<Stud> slist;

	public List<Stud> getSlist() {
		return slist;
	}

	public void setSlist(List<Stud> slist) {
		this.slist = slist;
	}	
}

class Stud {
	private int roll;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	private String name;
	private String subject;

}