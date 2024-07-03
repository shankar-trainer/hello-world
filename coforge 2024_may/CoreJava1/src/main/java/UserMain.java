
public class UserMain {

	public static void main(String[] args) {
		User user1=new User(767676,"prince kumar","delhi");
		User user2=new User(767679,"parvin kumar","mathura");
		User user3=new User(767673,"somesh kumar","chennai");
		
		
		System.out.println("User 1 data ");
		System.out.println("\tid "+user1.getUserId());
		System.out.println("\tname "+user1.getUserName());
		System.out.println("\tlocation "+user1.getUserLocation());
		
		System.out.println("country is "+User.getCountry());// className.static method
		
		
		System.out.println("PI is "+Math.PI);
		System.out.println("E is "+Math.E);
		System.out.println("sin 90 is "+Math.sin(Math.PI/2));
		
		System.out.println();
	}
}
