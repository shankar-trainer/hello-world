package org.com.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/login")
public class LoginController {
		
	
		public void ConrolPage(String user) {
			if(user.equals("admin")) {
			getAdmin();
			}
			else if(user.equals("user")) {
				getUser();
			}
		}

		@RequestMapping("/admin6")
		public String getAdmin() {
			AdminController admincontroller= new AdminController();
			
			return "admin works";
			
		}
		@RequestMapping("/user")
         public String getUser() {
			return "user works";
		}
}
		
		

