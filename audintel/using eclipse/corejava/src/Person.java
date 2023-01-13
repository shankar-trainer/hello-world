
public class Person {
	private int personId; // instance variable
	private String personName;
	private float personSalary;

	private static String city="hyderabad";// static or class variable
	private static String country;

	static {  // initialization of class/static variable
		country="india";
		System.out.println("static block1 called");
	}
	
	static {  // initialization of class/static variable
		System.out.println("static block2 called");
	}
	
	static {  // initialization of class/static variable
		country="srilanka";
		System.out.println("static block3 called");
	}
	

	public Person() {
		this.personId=989898;
		this.personName="bhaskar varma";
		this.personSalary=90000;
		System.out.println("constructor called");
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

	public static String getCity() {
		return city;
	}

	public static String getCountry() {
		return country;
	}

	public static void main(String[] args) {
	  Person person=new Person();	
		
	  System.out.println("id is "+person.getPersonId());
	  System.out.println("name is "+person.getPersonName());
	  System.out.println("salary is "+person.getPersonSalary());
      System.out.println("city is "+city);
      System.out.println("city is "+Person.city);
      System.out.println("country  is "+country);
      
	}

}
