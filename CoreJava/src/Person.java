
public class Person {

	private int id;
	private String name;
	private float salary;
	private String state;
	private String country;

	public Person(String state, String country) {
		System.out.println("overloaded constructor2 ");
		this.state = state;
		this.country = country;
	}
	
	public Person() {
		this("west bangal","india");
	  System.out.println("default constructor ");
	  id=1001;
	  name="reeta bhaduri";
	  salary=90000;
	}

	public Person(int id, String name, float salary) {
		this("delhi","india");
		System.out.println("overloaded constructor1 ");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void personInfo() {
		System.out.println("\nPerson data \n");
		System.out.println("\tId is "+id);
		System.out.println("\tName is "+name);
		System.out.println("\tSalary  is "+salary);
		System.out.println("\n\tState  is "+state);
		System.out.println("\tCountry  is "+country);
	}
	
}
