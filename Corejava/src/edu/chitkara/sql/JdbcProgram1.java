package edu.chitkara.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProgram1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// 1st way to load driver
		// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//2nd way to load driver    
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chitkara", "root", "mysql");
		Connection connection =DatabaseUtil.myConnection(); 
		if (connection != null)
			System.out.println("connection established");
		else
			System.out.println("some problem");
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select * from employee");

		while (rs.next())
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3));

		ResultSet rs1 = st.executeQuery("select count(*) from employee");

		rs1.next();
		System.out.println("no of records present "+rs1.getInt(1));

//		rs.next();
		// System.out.println(rs.getInt("id") + "\t" + rs.getString(2) + "\t" +
		// rs.getDouble("salary"));

	}

}
