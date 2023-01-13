package com.audintel.collection;

public class UserMain {

	public static void main(String[] args) {
		int id[]= {677667,565656,5667567};
		String nm[]= {"amrit kumar","sumit kumar","rahul kumar"};
		float salary[]= {12000,40000,11000};
		
		UserDao dao=new UserDao();
		
		User user[]=new User[3];
		
		for (int i = 0; i < user.length; i++) {
			user[i]=new User();
			user[i].setUserId(id[i]);
			user[i].setUserName(nm[i]);
			user[i].setUserSalary(salary[i]);
			
			dao.addUser(user[i]);
		}
		
		System.out.println("All Users List");
		
		for(User u:dao.getAllUser())
			System.out.println(u.getUserId()+"\t"+u.getUserName()+"\t"+u.getUserSalary());
	
		
		  System.out.println("search operation ");
		  System.out.println(dao.searchUser(user[0]));
		  User user1=new User();
		  user1.setUserId(677667);
		  user1.setUserName("amrit kumar");
		  user1.setUserSalary(12000);
		  
		  System.out.println(dao.searchUser(user1));
		  System.out.println("\ndelete operation ");
		  dao.removeUser(user1);
		  System.out.println(dao.searchUser(user1));
		  	  
	
	}
}
