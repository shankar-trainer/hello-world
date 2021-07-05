
public class UserMain {

	public static void main(String[] args) {
		System.out.println(User.getCountry());
		User user1=new User();
		User user2=new User("arvind kumar",878787);
		User user3=new User("mahesh kumar",878778);
		
		//System.out.println(user1.getUserId());
		//System.out.println(user1.getUserName());
	
		System.out.println("no of objects created "+User.count);
	
		User.userInfo(user1);
		User.userInfo(user2);
		User.userInfo(user3);
	}
}
