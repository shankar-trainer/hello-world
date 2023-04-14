
public class User {
  int id;
   String name;
   String location;

   public  User() {
	   System.out.println("constructor called ");
       id=77667;
       name="kamal kumar";
       location="chandigadh";
    }
   
   public static void main(String[] args) {
	
	   
	   User user1=new User();
	   User user2=new User();
	   User user3=new User();
	   
	   	   System.out.println("\tid "+user1.id);
	   	   System.out.println("\tname "+user1.name);
	   System.out.println("\tlocation "+user1.location);
}
}
