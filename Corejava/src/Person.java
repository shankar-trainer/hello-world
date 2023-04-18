
public class Person {

	private int personId;
	private  String personName;
	private float  personSalary;

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
	public float getPersonSalary() {
		return personSalary;
	}
	public void setPersonSalary(float personSalary) {
		this.personSalary = personSalary;
	}
	
    void personInfo() {
    	System.out.println("Person information");
    	System.out.println("\tId "+getPersonId());
    	System.out.println("\tname "+getPersonName());
    	System.out.println("\tsalary "+getPersonSalary());
    }
	
	
}
