
public class PersonMain {

	public static void main(String[] args) {
		
		Person person[]=new Person[3];
		
		person[0]=new Person();
		person[1]=new Person(7665676,"lalan kumar",23);
		person[2]=new Person(878788,"kamal partap",25);
		
		for (Person person2 : person) {
			person2.personInfo();
		}
		
		
	}
}
