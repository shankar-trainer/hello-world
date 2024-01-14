public class User {
	int userId;
	String userName;

	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	// default constructor
	public User() {
		userId = 8776776;
		userName = "mohan kumar";
		System.out.println("default constructor called ");
	}

	// overloaded / parameterized constructor
//	public User(int userId, String userName) {
//		System.out.println(" overloaded constructor called ");
//		this.userId=userId;
//		this.userName=userName;
//	}

	void userInfo() {
		System.out.println("\n User Information");
		System.out.println("\t userId :" + userId);
		System.out.println("\t userName :" + userName);
	}

}
