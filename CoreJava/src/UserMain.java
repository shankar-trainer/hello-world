
public class UserMain {

	public static void main(String[] args) {
		User u1=new User();
		User u2=new User(67667,"kamal kant",45000);
		User u3=new User(12343,"arvind kumar",48000);
		
		System.out.println("\nuser1 data ");
		System.out.println("user1 id "+u1.getUserId());
		System.out.println("user1 name "+u1.getUserName());
		System.out.println("user1 salary "+u1.getUserSalary());
		System.out.println("user1 state "+u1.getUserState());
		System.out.println("user1 country "+u1.getUserCountry());
	
		System.out.println("\nuser2 data ");
		System.out.println("user2 id "+u2.getUserId());
		System.out.println("user2 name "+u2.getUserName());
		System.out.println("user2 salary "+u2.getUserSalary());
		System.out.println("user2 state "+u2.getUserState());
		System.out.println("user2 country "+u2.getUserCountry());
		
		System.out.println("\nuser3 data ");
		System.out.println("user3 id "+u3.getUserId());
		System.out.println("user3 name "+u3.getUserName());
		System.out.println("user3 salary "+u3.getUserSalary());
		System.out.println("user3 state "+u3.getUserState());
		System.out.println("user3 country "+u3.getUserCountry());
			
	}
}
