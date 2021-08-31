package com.abc.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import com.abc.database.util.DatabaseUtil;

public class LoginDao {
	Statement st;
	PreparedStatement pst;
	Connection con;
	ResultSet rs;

	public LoginDao() throws SQLException {
		con = DatabaseUtil.myConnection();
		st = con.createStatement();
	}

	public boolean checkLogin(String id, String pass) throws SQLException {
		pst = con
				.prepareStatement("select * from login where userid=? and  password=?");
		pst.setString(1, id);
		pst.setString(2, pass);
		rs = pst.executeQuery();
		if (rs.next())
			return true;
		else
			return false;
	}

}
