
public class User {
	private int userId;
	private String userName;;;;;;;
	private float userSalary;

	private static String userCountry;

	public User(int userId, String userName, float userSalary) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userSalary = userSalary;
	}

	static {
		userCountry = "india";
	}
	
	public static void userInfo(User user) {
		System.out.println("\nUser Information\n");
		System.out.println("\tid is "+user.userId);
		System.out.println("\tname is "+user.userName);
		System.out.println("\tsalary is "+user.userId);
		System.out.println("\tcountry  is "+userCountry);
	}
	

}
