
public class Person {

	int personId;
	String personName;
	float personSalary;
	
	public Person(int personId, String personName, float personSalary) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personSalary = personSalary;
	}
	void personInfo() {
		System.out.println("----- Person Information -----");
		System.out.println("\n\tid : "+personId);
		System.out.println("\tname : "+personName);
		System.out.println("\tsalary : "+personSalary);
	}
	
	public static void main(String[] args) {
		Person person1=new Person(10001,"suresh kumar",45000);
		Person person2=new Person(10002,"rahul kumar",65000);
		
		System.out.println(" person 1");
		person1.personInfo();
		System.out.println(" person 2");
		person2.personInfo();
		
		// 2 reference  2 object 
		
		Person person3=person2;
		
		// 3 reference  2 object,   person3 and  person2 both refers the same object  
		
		System.out.println(" person 3");
		person3.personInfo();
	
		person3.personId=90003;
		person2.personName="suman kumar";
		
		person2.personInfo();
		person3.personInfo();
	}
}
