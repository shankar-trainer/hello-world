
public class User {
	private int id;
	private String name;
	private float salary;
	private String location;

	// public User() {// default constructor
	private	 User() {// default constructor
		 System.out.println("constructor called ");
		 this.id=77878;
		 this.name="vimal kumar";
		 this.salary=67000.0f;
		 this.location="chennai";
	}
	public User(int id, String name, float salary, String location) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
	}


	public void userInfo() {
		System.out.println("\nuser information ");
		System.out.println("\tid is " + id);
		System.out.println("\tname is " + name);
		System.out.println("\tsalary is " + salary);
		System.out.println("\tlocation is " + location);
	}

	public static void main(String[] args) {

		User user1 = new User();
		User user2 = new User(7878788,"sumanth sharma",45000,"hyderabad");
		
		System.out.println("user1 data");
		user1.userInfo();
		
		System.out.println("\nuser2 data");
		user2.userInfo();

	}

}
