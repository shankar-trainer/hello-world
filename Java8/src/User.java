
public class User {
	private int userId;
	private String userName;
	private int userAge;
	private String userCountry;

	 User() {
		this("nepal");
		userAge = 44;
		userName = "amit kumar";
		userId = 787897;
		System.out.println("default constructor called ");
	}
	
	 User(int userId, String userName, int userAge) {
		 //this();
		this("india");// another current class constructor 
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		System.out.println("overloaded  constructor called ");
	}
	 User(int userId, String userName, String userCountry) {
	     this.userId=userId;
	     this.userName=userName;
	     this.userCountry=userCountry;
	     System.out.println("overloaded  constructor3 called ");
	 }
	
	 User( String country) {
		 this(9998,"s kumar","sri lanka");
		this.userCountry=country;
		System.out.println("overloaded  constructor2 called ");
	}

	void userInfo() {
		System.out.println("\n user id "+userId);
		System.out.println(" user name "+userName);
		System.out.println(" user age "+userAge);
		System.out.println(" user country  "+userCountry);
	}
	public static void main(String[] args) {
		
		User user1=new User();
		User user2=new User(787887,"amita sinha",34);
		User user3=new User(77687,"muthu maharaja",55);
		
		user1.userInfo();
		user2.userInfo();
		user3.userInfo();
	}
}