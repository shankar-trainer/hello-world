
public class UserMain {

	public static void main(String[] args) {
		
		User user=new User(1001, "amit kumar");
		
		System.out.println("user information");
		System.out.println("\tuser id  "+user.getUserId());
		System.out.println("\tuser name  "+user.getUserName());
		System.out.println("\tuser salary  "+user.getSalary());
		System.out.println("\tuser  location "+user.getUserLocation());
		
		
	}
}
