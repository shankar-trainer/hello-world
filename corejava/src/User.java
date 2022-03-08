// chaining of constructor
public class User {

	private int userId;
	private String userName;

	private String userLocation;
	private float salary;

	public User() {
		System.out.println("default constructor ");
	}

	public User(int userId, String userName) {
		// this();// call default constructor
		this("delhi", 56000);// second overloaded constructor
		this.userId = userId;
		this.userName = userName;
		System.out.println("first overloaded constructor ");
	}

	public User(String userLocation, float salary) {
		// this("delhi",56000); // recursion error
		this.userLocation = userLocation;
		this.salary = salary;
		System.out.println("second overloaded constructor ");
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public float getSalary() {
		return salary;
	}

}
