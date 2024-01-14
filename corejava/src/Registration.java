
public class Registration {

	private int userId;
	private  String userName;
	private String  userLocation;
	private boolean   userMartialStatus;
	
	public Registration(int userId, String userName, String userLocation, boolean userMartialStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userLocation = userLocation;
		this.userMartialStatus = userMartialStatus;
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
	public boolean isUserMartialStatus() {
		return userMartialStatus;
	}
	
	
	
}
