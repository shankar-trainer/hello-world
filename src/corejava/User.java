package corejava;

public class User {
	int userId;
	String userName;
	float userSalary;

	public User() // default constructor
	{
		userId = 98898;
		userSalary = 34000;
		userName = "aman kumar";
	}

	public void userInfo() {
		System.out.println("User Information ");
		System.out.println("\tuser id " + userId);
		System.out.println("\tuser name " + userName);
		System.out.println("\tuser salary " + userSalary);
	}

	public static void main(String[] args) {

		User user1 = new User();
		User user2 = new User();
		user1.userInfo();
		user2.userInfo();

		user2.userId = 87788;
		user2.userName = "suman kumar";
		user2.userSalary = 90000;

	}
}
