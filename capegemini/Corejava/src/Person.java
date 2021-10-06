public class Person {
	int id;
	String name;
	float salary;

 private Person() {
		id = 1001;
		name = "mohan kumar";
		salary = 23000;
		System.out.println("constructor called ");
	}
	void personInfo() {
		System.out.println("\nPerson Information ");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		person1.personInfo();
		person2.personInfo();
		person3.personInfo();
		
	}

}
