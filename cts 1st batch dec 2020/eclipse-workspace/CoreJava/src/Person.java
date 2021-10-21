
public class Person {

	int id; // instance variable
	String name; // instance variable
	static String country; // class variable

	static {
		country = "india";
		System.out.println("static block called");
	}

	public Person() {
		id = 1001;
		name = "ram kumar";

		System.out.println("constructor called ");
	}

	{
		id = 1002;
		name = "shyam kumar";

		System.out.println("init block1 called");
	}
	{
		System.out.println("init block2 called");
	}

	static void  personIno(Person p){
		
		System.out.println("id is " + p.id);
		System.out.println("name is " + p.name);
		System.out.println(" country is "+country);
		
	}
	
	
	public static void main(String[] args) {
		Person person = new Person();
		Person person1 = new Person();
		Person person2 = new Person();

		System.out.println("id is " + person.id);
		System.out.println("name is " + person.name);
		System.out.println("country is   " + country);
		System.out.println("country is   " + Person.country);
	}

}
