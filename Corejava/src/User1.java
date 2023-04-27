class User2{
	  static {
		   System.out.println("User2 static block called");
	   }
	 User2(){
		 System.out.println("user2 constructor ");
	 }
}
public class User1 extends User2 {
   static {
	   System.out.println("User1 static block called");
   }
	private int userId;
	public User1() {
	 System.out.println("User1 constructor called ");
		this.userId=10003;
	}
	
	{   // init block 
		System.out.println("init  block 1 called ");
		this.userId=10001;
	}
	
	{
		System.out.println("init  block 2 called ");
		this.userId=10002;

	}

	public static void main(String[] args) {
  System.out.println(new User1().userId);
	}
	
}
