
public class User {

	private int userId;  //instance variable 
	private String userName;
	private String userLocation;
	private static String userCountry; // class or static variable
	
	static int  count=0 ;
	
	public User(int userId, String userName, String userLocation) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userLocation = userLocation;
		count++;
		System.out.println("constructor called");
	}
	
	static {
		userCountry="india";
		System.out.println("static block called");
	}

	static void userInfo(User user) {
		System.out.println("\nuser id "+user.getUserId());
		System.out.println("user name "+user.getUserName());
		System.out.println("user location "+user.getUserLocation());
		System.out.println("User country "+getUserCountry());
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

	public static String getUserCountry() {
		return userCountry;
	}
	
	
}
