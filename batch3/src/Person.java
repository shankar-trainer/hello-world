
public class Person {

	private int personId;
	private String  personName;
	private float personSalary;
	private String  personLocation;
	private String  personSSN;
	
	public Person(int personId, String personName, float personSalary, String personLocation, 
			String personSSN) {
	
		this(personId,personName,personSSN);
		this.personId = personId;
		this.personLocation = personLocation;
		this.personSSN = personSSN;
	}
	
	public Person(int personId, String personName, String personSSN) {
		this.personId = personId;
		this.personName=personName;
		this.personSSN=personSSN;
	}
	
	public void  personInfo() {
		System.out.println("person information\n");
		System.out.println("id "+personId);
		System.out.println("name "+personName );
		System.out.println("Location  "+personLocation);
		System.out.println("SSN "+personSSN);
	}
	
}
