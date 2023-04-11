
public class Person {

	private int id;
	private String name;
	private int age;
	

	void personInfo() {
		System.out.println(getClass().getName());
	}

	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	
}
