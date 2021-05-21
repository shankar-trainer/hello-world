
public class User {

	private int userId;
	private String userName;
	private String userLocation;

	// constructor instance variable

	private static String userState;
	private static String userCountry;

	static {
		System.out.println("static block called");
		userCountry = "india";
		userState = "tamil Nadu";
	}

	public User() {
		userId = 1001;
		userName = "a kumar";
		userLocation = "chennai";
		System.out.println("constructor called");
	}

	public static void main(String[] args) {
		User user = new User();
		System.out.println(user.userId);
		System.out.println(user.userName);
		System.out.println(user.userLocation);
		
		System.out.println(userState);
		System.out.println(User.userState);
		System.out.println(User.userCountry);
	}

}
