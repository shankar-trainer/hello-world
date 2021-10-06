package org.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.com.util.DatabaseUtil;

public class LoginDao {
	Connection connection;
	ResultSet rs, rs1;
	PreparedStatement pst, pst1;

	public LoginDao() {
		try {
			connection = DatabaseUtil.myconnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String LoginValidate(int id, String pass) throws SQLException {
		pst = connection.prepareStatement("select * from login where id=?");
		pst.setInt(1, id);
		rs = pst.executeQuery();
		if (rs.next()) {
			pst1 = connection.prepareStatement
		("select * from login where password=?");
			pst1.setString(1, pass);
			rs1 = pst1.executeQuery();
			if(rs1.next())
				return "success";
			else
				return "id correct password wrong";
		}
		else 
			return "id not present";
	}

}
