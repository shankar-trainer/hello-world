
public class UserMain {

	public static void main(String[] args) {

		User user1 = new User();
		User user2 = new User(45454,"aman kumar");
		User user3 = new User(565656,"suman kumar");

		user1.userInfo();
		user2.userInfo();
		user3.userInfo();
	}
}
