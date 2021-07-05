package corejava;

public class PersonMain {

	public static void main(String[] args) {
		Person person;
		
		person=new Employee();
		person.behaviour();
		
		person=new Patient();
		person.behaviour();
		
		person=new Audience();
		person.behaviour();
	}
}
