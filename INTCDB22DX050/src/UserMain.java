
public class UserMain {

	public static void main(String[] args) {
		User user1=new User();
		//user1.userId=-7;//private members can be used with the class
		//user1.userName="";
		//user1.userSalary=0;
		
		user1.setUserId(1001);
		user1.setUserName("madan kumar");
		user1.setUserSalary(89000);
		
		
		System.out.println("id is "+user1.getUserId());
		System.out.println("name is "+user1.getUserName());
		System.out.println("salary is "+user1.getUserSalary());
		
	}
}
