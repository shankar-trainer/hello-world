
public class UserMain {

	public static void main(String[] args) {
		User user=new User();
		//user.userId;
		
		user.setUserId(19009);
		user.setUserName("janki kumar");
		user.setUderAge(34);
		
		System.out.println("User information ");
		System.out.println("\n\t user id "+user.getUserId());
		System.out.println("\n\t user name "+user.getUserName());
		System.out.println("\n\t user age "+user.getUderAge());
	}
}
