package com.edu;

public class Person {

	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return  "Person Information\n\nId is "+id+"\nName is "+name;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	public static void main(String[] args) throws CloneNotSupportedException {

		Person person1 = new Person(1001, "mohan kumar");
		Person person2 = new Person(1002, "ram kumar");
		
		Object clone = person2.clone();
		
//		Person person3=(Person) clone;
		
		
		System.out.println(person1.hashCode());
		System.out.println(person1.hashCode());
		
		if(person1.equals(person2))
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println(person1);
		System.out.println(person2);
	//	System.out.println(person3);

	}
}
