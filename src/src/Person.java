public class Person {
	long id;
	String name;
	int age;

	public Person() {
		System.out.println("default constructor called");
		id = 988998;
		name = "suman kumar";
		age = 33;
	}

	public Person(long id, String name, int age) {
		System.out.println("overloaded constructor called");
	  this.id=id;
	  this.name=name;
	  this.age=age;
	}

	public void personInfo() {
		System.out.println("person information ");
		System.out.println("\tid  : " + id);
		System.out.println("\tname  : " + name);
		System.out.println("\tage  : " + age);
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person(766776,"anand kumar",55);
		Person p3 = new Person(566556,"jayant kumar",44);

		p1.personInfo();
		p2.personInfo();
		p3.personInfo();
	}
}
