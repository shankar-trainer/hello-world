public class Person {
	private int id;
	private String  name;
	private float salary;
	private String country;
	private String location;
	private int age;

	public Person(String location, int age) {
		this.location = location;
		this.age = age;
	}
	
	public Person(int id, String name, float salary,String location, int age) {
		this(location,age);
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country="India";
	}
	
	public void personInfo() {
		System.out.println("\nPerson Information\n");
		System.out.println("\tid is "+id);
		System.out.println("\tname is "+name);
		System.out.println("\tsalary is "+salary);
		System.out.println("\tage is "+age);
		System.out.println("\tlocation is "+location);
		System.out.println("\tcountry  is "+country);
	}
}
