package com.abc.main;

import com.abc.bean.User;
import com.abc.dao.UserDao;

public class UserMain {

	public static void main(String[] args) {
		User user[]=new User[4];
		user[0]=new User(554456, "s kumar", 67000, "chennai");
		user[1]=new User(554456, "p kumar", 17000, "delhi");
		user[2]=new User(554456, "a kumar", 69000, "noida");
		user[3]=new User(554456, "j kumar", 87000, "gurgaon");
		
		UserDao dao=new UserDao();
		
		for (User user2 : user) {
		   dao.addUser(user2);
		}
		
		for(User u:dao.getAllUser())
		  System.out.println(u);
	}
}

