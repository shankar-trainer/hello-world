
public class PersonMain {

	public static void main(String[] args) {
		
		Person person1=new Person(10001, "abhishek gupta", 20000.0f,"delhi",23);
		Person person2=new Person(10002, "suman gupta", 440000.0f,"noida",55);
		Person person3=new Person(10003, "pawan gupta", 560000.0f,"chennai",34);
		Person person4=new Person(10004, "raman gupta", 89000.0f,"banglore",28);
		
		person1.personInfo();
		person2.personInfo();
		person3.personInfo();
		person4.personInfo();
		
	}
}
