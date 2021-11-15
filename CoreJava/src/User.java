
public class User {

	private int userId;
	private String userName;
	private String userSSN;


//private
	
User() {
		System.out.println("constructor called");
		userSSN = "userssn2333";
		userName = "umesh parsad";
		userId = 7677667;
	}

	
	public void userInfo() {
		System.out.println("\nUser data");
		System.out.println("user1  id " + userId);
		System.out.println("user1  name " + userName);
		System.out.println("user1  ssn " + userSSN);
	}

	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();
		User user5 = new User();

		user1.userName = "suresh parsad";
		
		user1.userInfo();
		user2.userInfo();
		user3.userInfo();
		user4.userInfo();
		user5.userInfo();

	}
}
