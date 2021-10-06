package com.capgemini.mybook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.mybook.dto.Login;
import com.capgemini.mybook.util.DatabaseUtil;

public class LoginDaoImpl implements LoginDao {

	Connection connection;
	PreparedStatement pst;
	ResultSet rs;

	public LoginDaoImpl() throws SQLException {
		connection = DatabaseUtil.myconnection();
	}

	@Override
	public boolean LoginUser(Login login) throws SQLException {
		pst = connection.prepareStatement
	("select * from login where id=? and password=? and usertype=?");

		rs = pst.executeQuery();
		if (rs.next())
			return true;
		else
			return false;
	}

}
