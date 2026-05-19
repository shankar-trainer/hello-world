package com.montran.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class Person {
	private int personId;
	private String personName;
	private float personSalary;

	public Person(int personId, String personName, float personSalary) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personSalary = personSalary;
	}

	public int getPersonId() {
		return personId;
	}

	public String getPersonName() {
		return personName;
	}

	public float getPersonSalary() {
		return personSalary;
	}

}

public class SupplierInterfaceEx2 {
	static List<Person> list1;

	static List<Person> getPerson() {
		list1 = new ArrayList<Person>();
		list1.add(new Person(1675676, "sunita", 25000.0f));
		list1.add(new Person(1675678, "amita", 35000.0f));
		list1.add(new Person(1675671, "kavira", 15000.0f));
		return list1;
	}

	public static void main(String[] args) {
//      Supplier<List<Person>> supplier=()->getPerson();
      Supplier<List<Person>> supplier=SupplierInterfaceEx2::getPerson; // static method reference
      
      supplier.get().stream().forEach(a->System.out.println(a.getPersonId()+"  "+a.getPersonName()+"  "+a.getPersonSalary()));
      
      Supplier<Integer> supplier2=()->"hello world".length(); // instance method reference
      System.out.println(supplier2.get());
      
	}
}
