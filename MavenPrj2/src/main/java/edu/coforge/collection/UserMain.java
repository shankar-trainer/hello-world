package edu.coforge.collection;

public class UserMain {

	public static void main(String[] args) {
		
		
		User user1=new User(56765567, "amarnath gupta");
		User user2=new User(56765567, "amarnath gupta");
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user1.equals(user2));
		
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		
		
		 
	}
}
