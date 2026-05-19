
public class Person {

	private int personId;
	private String personName;
	private int personAge;
	private String personLocation;
	private float personsalary;

	public Person(int personId, String personName, int personAge, String personLocation, float personsalary) {
		this(personId, personName, personAge);
		this.personLocation = personLocation;
		this.personsalary = personsalary;
	}

	public Person(int personId, String personName, int personAge) {
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}

	public int getPersonId() {
		return personId;
	}

	public String getPersonName() {
		return personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public String getPersonLocation() {
		return personLocation;
	}

	public float getPersonsalary() {
		return personsalary;
	}

	
}
