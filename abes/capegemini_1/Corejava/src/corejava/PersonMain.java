package corejava;

public class PersonMain {

	public static void main(String[] args) {
	
		Person person1=new Person(1001, "ravi kumar");
		Person person2=new Person(1001, "ravi kumar");
		
		if(person1.equals(person2))
			System.out.println("equals");
		else
			System.out.println("not equals");
	}
}
