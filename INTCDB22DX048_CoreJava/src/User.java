
public class User {

	private int id;
	private String name;
	private float salary;

	public User() {// default constructor
		System.out.println("constructor called");
		id = 87878;
		name = "pushpendra kumar";
		salary = 56000;
	}
	public User(int id, String name, float salary) {
		System.out.println("overloaded constructor called");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void userInfo() {
		System.out.println("\nUser Information ");
		System.out.println("\tid is " + id);
		System.out.println("\tname is " + name);
		System.out.println("\tsalary is " + salary);
	}

	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User(1009,"lalan kuamr",34000);
		User user3 = new User(122121,"ashish kumar",780000);

		user1.userInfo();
		user2.userInfo();
		user3.userInfo();
	}
}
