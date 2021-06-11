
public class UserMain {

	public static void main(String[] args) {
		
		User user1=new User();
		User user2=new User(1002,"saurabh kumar","ooty");
		User user3=new User(1003,"shashi  kumar","banglore");

		user1.userInfo();
		user2.userInfo();
		user3.userInfo();
	
		//user1=null;
		
		User user4=user1;
		
		user4.userInfo();
		
		user4=new User(9999, "amit kumar","UP Noida");
		user4.userInfo();
		
		user1=user4;
		
		user1.userInfo();
		
	}
}
