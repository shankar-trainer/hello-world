public class User {

	private long userId;
	private String userName;
	private String userLocation;
	private static String country;
	
	public long getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public static String getCountry() {
		return country;
	}


	// constructor initializes instance variable  
	public User(long userId, String userName, String userLocation) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userLocation = userLocation;
	}
	

	public User() {
	System.out.println("constructor called ");
	}
	
	// static block initializes static/class members 
	static {
		country="India";
		System.out.println("static block1 called");
	}
	static {
		System.out.println("static block2 called");
	}
	
	public static void main(String[] args) {
		
		new User();
		new User();
		new User();
	}
}
