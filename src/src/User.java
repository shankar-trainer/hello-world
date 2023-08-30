
public class User {
	int userId;
	String userName;
	
	


	public User() {
		System.out.println("constructor called ");
	}

	{
		userName="anand kumar";
		userId=7878788;
		System.out.println("init block1 called");
	}
	{
		userName="suman kumar";
		userId=7878789;
	
		System.out.println("init block2 called");
	}

	public void userInfo() {
		System.out.println("\tUser id " + userId);
		System.out.println("\tUser name " + userName);
	}

	public static void main(String[] args) {
		User user = new User();
		user.userInfo();
	}
}
