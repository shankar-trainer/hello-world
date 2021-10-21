
public class PersonMain {


	public static void main(String[] args) {
		 Person person=new Person();
		 System.out.println("id is "+person.id);
		 System.out.println("name is "+person.name);
		 //System.out.println("country is   "+country);
		 System.out.println("country is   "+Person.country);
		 
		 System.out.println("Math PI "+Math.PI);
		 
		 System.out.println("Math PI "+Math.sin(Math.PI/2));
	
		 System.out.println("==================");
		 
		 Person.personIno(person);
		 
		 
		 
		 
	}
}
