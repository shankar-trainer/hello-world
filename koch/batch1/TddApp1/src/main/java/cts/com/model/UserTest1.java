package cts.com.model;


public class UserTest1 {

	public static void main(String[] args) {

		User user;
		User user1;
		user = new User();
		user1 = new User();
	
		user.setUserId(7878787);
		user.setUserName("devansh sharma");
		user.setUserSalary(23000.78f);

		user1.setUserId(7878787);
		user1.setUserName("devansh sharma");
		user1.setUserSalary(23000.78f);

		System.out.println(user.equals(user1));
	}
}
