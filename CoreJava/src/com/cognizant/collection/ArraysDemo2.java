package com.cognizant.collection;

import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		Person person[]=new Person[4];
		int  id1[]= {1002,1003,1001,1005};
		String nm[]={"rakesh","amit","suresh","kailash"};
		float sal[]= {67000,12000,9000,4000};
		
		for (int i = 0; i <person.length; i++) {
			person[i]=new Person();
			person[i].setId(id1[i]);
			person[i].setName(nm[i]);
			person[i].setSalary(sal[i]);
		}
		//Collections.sort(list)
		Arrays.sort(person);//Person cannot be cast to class java.lang.Comparable
		
		for (Person p : person) {
			System.out.println(p.getId()+"  "+p.getName()+"  "+p.getSalary());
		}
		
	}
}


class Person  implements Comparable<Person>{
	
	@Override
	public int compareTo(Person o) {
		if(this.getId()>o.getId())
			return 1;
		else if(this.getId()<o.getId())
			return -1;
		else 
			return 0;
	}
	
	private int id;
	private String name;
	private float salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}