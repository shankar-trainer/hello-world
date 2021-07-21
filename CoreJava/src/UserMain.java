
public class UserMain {

	public static void main(String[] args) {
		User user1=new User();
		User user2=new User(9001,"shiv kumar","madurai",true);
		User user3=new User(9008,"anand kumar","delhi",false);
		User user4=new User(9005,"kamlesh kumar","noida",true);
		
		user1.userInfo();
		user2.userInfo();
		user3.userInfo();
		user4.userInfo();
		
	}
}
