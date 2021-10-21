package com.capegemini.collection;

import java.util.Vector;

class Student{
	@Override
	public String toString() {
		return "Student";
	}
}

class Teacher{
	@Override
	public String toString() {
		return "Teacher";
	}
}

class Hod{
	@Override
	public String toString() {
		return "Hod";
	}
}
public class CollectionTest {
	public static void main(String[] args) {
		Vector vector=new Vector();
		vector.add(new Teacher());
		vector.add(new Hod());
		vector.add(new Student());
		
		for (Object object : vector) {
			System.out.println(object.toString());
		}
		
	}
}
