package database;


public class UsetTest {

	public static void main(String[] args) {
      //User user=new User();	
      
		User user=User.getUser();
       
        
        System.out.println("user1 id and name");
        System.out.println(user.getId()+"  "+user.getName());
        
        User user1=User.getUser();
       
        
        System.out.println("user2 id and name");
        System.out.println(user1.getId()+"  "+user1.getName());
	}
}
