package com.capgemini.mybook.dao;

import java.sql.SQLException;

import com.capgemini.mybook.dto.Login;

public interface LoginDao {

	public boolean LoginUser(Login login)  throws SQLException;
	
	
}
