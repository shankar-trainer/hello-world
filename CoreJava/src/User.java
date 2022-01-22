public class User {

	private int userId;
	private String userName;
	private float userSalary;
	private String userState;
	private String userCountry;

	public User() { // no argument constructor , default constructor
		System.out.println("constructor called ");
		userSalary = 99789;
		userId = 8998;
		userName = "rama kant ";
	}

	public User(int userId, String userName, float userSalary) {
		this("Up", "India"); // must be first line
		System.out.println("overloaded constructor called ");

		this.userId = userId;// this keyword is current class reference variable
		this.userName = userName;
		this.userSalary = userSalary;
	}

	public User(String userState, String userCountry) {
		this.userState = userState;
		this.userCountry = userCountry;
	}

	public String getUserState() {
		return userState;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public float getUserSalary() {
		return userSalary;
	}

}
