
public class UserMain {

	public static void main(String[] args) {
		
		User user1=new User(10001,"parshant kumnar", 23000.00f);
		
		User.userInfo(user1);
		
		User user2=new User(10002,"amit kumnar", 28000.00f);
		
		User.userInfo(user1);
		User.userInfo(user2);
		
	}
}
