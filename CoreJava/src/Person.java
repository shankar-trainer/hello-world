public class Person {

	private int id;
	
	public void setName(String name) {
		this.name = name;
	}

	private String name;
	private float salary;

	public Person() {
		System.out.println("constructor called ");
		id = 89998;
		name = "amitendra kumar";
		salary = 78000;
	}
	
	public Person(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void personInfo() {
		System.out.println("\nperson information\n");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary  is "+salary);
	}

	public static void main(String[] args) {

		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();

		person1.id=9;
		person1.name="lalan kumar";
		person1.salary=89000;
		
		System.out.println("\nperosn1 data\n");
		System.out.println(person1.id);
		System.out.println(person1.name);
		System.out.println(person1.salary);

		System.out.println("\nperson2 data\n");
		System.out.println(person2.id);
		System.out.println(person2.name);
		System.out.println(person2.salary);
	}
}
