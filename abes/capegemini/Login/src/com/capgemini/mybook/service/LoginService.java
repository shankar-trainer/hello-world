package com.capgemini.mybook.service;

import java.sql.SQLException;

import com.capgemini.mybook.exception.LoginException;

public interface LoginService {

	public void userLogin() throws LoginException, SQLException;
	
	
}
