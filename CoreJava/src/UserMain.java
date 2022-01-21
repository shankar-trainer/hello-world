
public class UserMain {

	public static void main(String[] args) {
		User user=new User();
		
		//user.userId=0;
		user.setUserId(76776);
		user.setUserName("amit kumar");
		user.setUseLocation("new delhi");
		
		System.out.println("user id "+user.getUserId());
		System.out.println("user name "+user.getUserName());
		System.out.println("user location "+user.getUseLocation());
		
	}
}
