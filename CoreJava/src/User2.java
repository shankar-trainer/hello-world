
public class User2 extends User1 {

	private String userLocation;

	public String getUserLocation() {
		return userLocation;
	}

	public User2(int userId, String userName, float userSalary, String userLocation) {
		super(userId, userName, userSalary);
				this.userLocation = userLocation;
	}

	public static void main(String[] args) {
		User2 user2 = new User2(787678, "rahul kumar", 76000, "chennai");
		System.out.println(user2.getUserId());
		System.out.println(user2.getUserName());
		System.out.println(user2.getUserSalary());
		System.out.println(user2.getUserLocation());
	}
}
