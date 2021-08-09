
public class User {

	private int userId;
	private String userName;
	private String userLocation;
	private boolean permanentEmployee;

	public User() {
		System.out.println("default constructor called");
		userId = 98998;
		userName = "mohan kumar";
		userLocation = "chennai";
		permanentEmployee = false;
	}

	public User(int userId, String userName, String userLocation, boolean permanentEmployee) {
		System.out.println("overloaded constructor called");
		this.userId = userId;
		this.userName = userName;
		this.userLocation = userLocation;
		this.permanentEmployee = permanentEmployee;
	}

	void  userInfo(){
		System.out.println("\nUser Information \n");
		System.out.println("Id is "+userId);
		System.out.println("Name "+userName);
		System.out.println("Location "+userLocation);
		System.out.println("permanentEmployee  "+permanentEmployee);
	}
}
