
public class PersonMain {

	public static void main(String[] args) {
	
		Person person1=new Person();// 1 reference variable 1 object
		Person person2=new Person();// 1 reference variable 1 object
		
		person1.setPersonId(5456656);
		person1.setPersonName("surendra kumar");
		person1.setPersonSalary(20000);
		
		
		person2.setPersonId(5456659);
		person2.setPersonName("mohan kumar");
		person2.setPersonSalary(90000);
		
		person1.personInfo();
		person2.personInfo();
		
		// total 2 reference variable and 2 object
		
		Person person3=person1;//person1 and person3 both refers same object 
		
		//total 3 reference variable and 2 object
		
		person3.personInfo();
     
		person3.setPersonId(1);
		
		System.out.println("person1 id "+person1.getPersonId());
		System.out.println("person3 id "+person3.getPersonId());
		
	}
}
