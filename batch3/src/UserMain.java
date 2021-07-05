
public class UserMain {

	public static void main(String[] args) {
	    User user1=new User(644545, "prince kumar", "noida");
	    User user2=new User(644546, "rahul kumar", "delhi");
	    User user3=new User(644547, "aman kumar", "gurgaon");
	    
	    System.out.println("no of objects created "+User.count);
		//System.out.println(User.getUserCountry());
		
	    User.userInfo(user1);
	    User.userInfo(user2);
	    User.userInfo(user3);
		
	}
}
