
public class User {

	int userId;
	String  userName;
	
	void userInfo() {
		System.out.println("\nUser information");
		System.out.println("\t id "+userId);
		System.out.println("\t name "+userName);
	}
	
	public static void main(String[] args) {
		
		User user1=new User(); // object object1
		
		user1.userId=1;
		user1.userName="vimal";
		
		User user2=new User(); // object object2
		
		user2.userId=2;
		user2.userName="kamal";

		// 2 references, 2 objects 
		
		user1.userInfo();
		user2.userInfo();
		
		User user3=user2;
		user3.userInfo();
		
		// 3 references, 2 objects, user2, user3 refers same object obj2
		
		user3.userId=899;
		user3.userName="suman";
		
		user2.userInfo();
		
		user1=null;    // garbage collection called by jvm and object1 memory will be released 
		user1.userInfo(); // error 
		
		// 3 references, 1 objects
	}
}
