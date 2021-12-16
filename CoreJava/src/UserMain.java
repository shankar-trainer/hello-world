
public class UserMain {

	public static void main(String[] args) {
		
		User user1=new User();
		User user2=new User();
		User user3=new User();
		
		user2.setUserId(87887);
		user2.setUserLocation("madurai");
		user2.setUserName("Muthu swami");
		
		System.out.println("\nuser1 data\n");
		System.out.println("user id "+user1.getUserId());
		System.out.println("user name "+user1.getUserName());
		System.out.println("user location "+user1.getUserLocation());
		
		System.out.println("user2 data\n");
		System.out.println("user id "+user2.getUserId());
		System.out.println("user name "+user2.getUserName());
		System.out.println("user location "+user2.getUserLocation());
		
		System.out.println("user3 data\n");
		System.out.println("user id "+user3.getUserId());
		System.out.println("user name "+user3.getUserName());
		System.out.println("user location "+user3.getUserLocation());
	}
}
