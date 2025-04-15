package singleton;

public class UserMain {
	public static void main(String[] args) {

		//User user=new User();
		User user1=User.getUserInstance();
		
		user1.setUserId(10001);
		user1.setUserName("avinash kumar");
		
		User user2=User.getUserInstance();
		
		user2.setUserId(10002);
		user2.setUserName("sharvan kumar");
		
		System.out.println("User1 data");
		System.out.println("\tId :"+user1.getUserId());
		System.out.println("\tName :"+user1.getUserName());
		
		System.out.println("\nUser2 data");
		System.out.println("\tId :"+user2.getUserId());
		System.out.println("\tName :"+user2.getUserName());
		
		
	}
}
