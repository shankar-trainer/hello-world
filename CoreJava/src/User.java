
public class User {

	private int userId;
	private String userName;
	private String userLocation;
	
	public  User() {
	  System.out.println("constructor called ");
	  userId=9899;
	  userLocation="delhi";
	  userName="pushpendra kumar";
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	
	
	
}
