
public class User {

	private int userId;
	private String userName;
	private String userLocation;

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public User() {
           System.out.println("constructor called ");
	        userId=7876767;
	        userName="p kumar";
	        userLocation="thoraipakkam chenna";
	}
	
	
	public User(int userId, String userName, String userLocation) {
		System.out.println("overloaded constructor called");
		this.userId = userId;
		this.userName = userName;
		this.userLocation = userLocation;
	}

	public void userInfo() {
		System.out.println("\n\n"+getUserId());
		System.out.println(getUserName());
		System.out.println(getUserLocation());
	}
	
}
