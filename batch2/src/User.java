public class User {

	private String userName;
	private static String country;
	private int userId;
	static int count = 0;

	public User() {
		userId = 89889;
		userName = "a kumar";
		count++;
		System.out.println("constructor called");
	}

	public User(String userName, int userId) {
		super();
		this.userName = userName;
		this.userId = userId;
		count++;
	}

	static {
		country = "india";
		System.out.println("static block called ");
	}

	public int getUserId() {
		return userId;
	}

	static void userInfo(User u) {
		System.out.println("\nUser Data \nuser id is " + u.getUserId());
		System.out.println("user name is " + u.userName);
		System.out.println("country name is " + country);
	}

	public String getUserName() {
		return userName;
	}

	public static String getCountry() {
		return country;
	}
}
