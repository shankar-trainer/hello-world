
public class Person {

	private int personId;
	private String personName;

	public Person() { // default constructor
		personId = 90989;
		personName = "sashi kant";
		System.out.println("constructor called");
	}

	public static void main(String[] args) {
//		int x;// local variable does not have any default value
		int x=0;// local variable does not have any default value
		System.out.println(x);
		
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();

		System.out.println(person1.personId);
		System.out.println(person1.personName);

		System.out.println();
		System.out.println(person2.personId);
		System.out.println(person2.personName);

		System.out.println();
		System.out.println(person3.personId);
		System.out.println(person3.personName);
	}

}
