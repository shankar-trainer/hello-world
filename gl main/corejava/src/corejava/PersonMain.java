package corejava;

public class PersonMain {

	public static void main(String[] args) {
		Person person=new Person();
	/*	person.id=1001;
		person.name="mohan kumar";
		person.age=55;*/
		
		
		person.setId(-100);
		person.setName("ram kumar");
		person.setAge(55);
		
		
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getAge());
	}
}
