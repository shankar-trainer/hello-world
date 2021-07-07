
public class Person {

	private int personId;
	private String personName;
	private String personLocation;

	public Person() {
		this.personId = 977887;
		this.personName = "ravi kant";
		this.personLocation = "chennai";

		System.out.println("default constructor ");
	}
	

	public Person(int personId, String personName, String personLocation) {
System.out.println("overloaded  constructor called ");
		this.personId = personId;
		this.personName = personName;
		this.personLocation = personLocation;
	}


	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonLocation() {
		return personLocation;
	}

	public void setPersonLocation(String personLocation) {
		this.personLocation = personLocation;
	}

	public static void main(String[] args) {

		Person person = new Person();

		System.out.println(person.getPersonId());
		System.out.println(person.getPersonName());
		System.out.println(person.getPersonLocation());
		
		Person person2=new Person(7676776, "vimla devi", "madurai");
		Person person3=new Person(7676779, "sharmila devi", "ooty");
		
		
		System.out.println("Person2 Record ");
		System.out.println(person2.getPersonId());
		System.out.println(person2.getPersonName());
		System.out.println(person2.getPersonLocation());

		System.out.println("Person3 Record ");
		System.out.println(person3.getPersonId());
		System.out.println(person3.getPersonName());
		System.out.println(person3.getPersonLocation());
		
	}

}
