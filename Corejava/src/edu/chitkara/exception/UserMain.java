package edu.chitkara.exception;

public class UserMain {

	public static void main(String[] args) {
		User user=new User();
//		user.id=-9809;// set 
//		user.name="a";
//		
//		System.out.println("id is "+user.id);//get
		
		try {
		//user.setId(0);
		user.setId(1000);
		
		//user.setName("a");
		user.setName("ram kumar");
		
		System.out.println(user.getId());
		System.out.println(user.getName());
		}
		catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}
}
