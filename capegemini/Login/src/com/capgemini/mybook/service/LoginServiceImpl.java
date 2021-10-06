package com.capgemini.mybook.service;

import java.io.Console;
import java.sql.SQLException;


import com.capgemini.mybook.dao.LoginDao;
import com.capgemini.mybook.dao.LoginDaoImpl;
import com.capgemini.mybook.dto.Login;
import com.capgemini.mybook.exception.LoginException;

public class LoginServiceImpl  implements LoginService{

	Login login;
    Console console;
    LoginDao dao;
    
    public LoginServiceImpl() throws SQLException {
	  console=System.console();
	  dao=new LoginDaoImpl();
    }
    
	@Override
	public void userLogin() throws LoginException, SQLException {
	  login=new Login();
	  System.out.println("Enter Id");
	  login.setId(console.readLine());
	  
	  System.out.println("Enter Password");
	  login.setPassword(console.readLine());

	  System.out.println("Re Enter Password");

	  if(!console.readLine().equals(login.getPassword())) {
		  System.err.println("Renter password is wrong");
		  System.out.println("Re Enter Password Again");
	  }
	  if(!console.readLine().equals(login.getPassword())) {
		  System.err.println("Renter password is wrong");
		  throw new LoginException("Reneter password wrong Login Denied");
	  }
	  
	  System.out.println("Enter UserType Admin or User");
	  login.setUserType(console.readLine());
	  
	 if( dao.LoginUser(login))
	 {
		 
	 }
	 	
	}

}
