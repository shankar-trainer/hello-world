package org.com.edu;
public class Person {
	int id;
	String name;
	float salary;

	void personInfo() {
		System.out.println("Person Information");
	}
}
class Teacher {
	Person person = new Person() {
		@Override
		void personInfo() {
			System.out.println("Id is " + id);
			System.out.println("Name is   " + name);
			System.out.println("Salary is   " + salary);
		}
	};

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.person.id = 1001;
		teacher.person.name = "pankaj kumar";
		teacher.person.salary = 67000;
		teacher.person.personInfo();
		
		Person person1 = new Person() {
			@Override
			void personInfo() {
				System.out.println("Id is " + id);
				System.out.println("Name is   " + name);
				System.out.println("Salary is   " + salary);
			}
		};
		
		person1.id = 1002;
		person1.name = "raman kumar";
		person1.salary = 69000;
		person1.personInfo();
		
	}
}