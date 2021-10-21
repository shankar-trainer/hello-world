package com.capgemini.mybook.controller;

public class LoginController {

	public void ConrolPage(String user) {
		if(user.equals("admin")) {
		AdminPage admin=new AdminPage();
		  admin.show();
		}
		
		else if(user.equals("user")) {
			UserPage user=new UserPage();
			  user.show();
		}
	}
	
	
}
