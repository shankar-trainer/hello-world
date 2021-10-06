package database;

public class User {
 
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	 

	public String getName() {
		return name;
	}

	 
	private User() {
	}
	
    static User user=null;
    
    public static User getUser(){
    	if(user==null){
    		user=new User();   
    		user.id=1001;
    		user.name="chaman kumar";
    	}
    	return user;
    }

}
