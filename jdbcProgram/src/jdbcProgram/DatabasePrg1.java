package jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.ResultSet;

public class DatabasePrg1 {

	public static void main(String[] args) throws SQLException {

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

		Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/db1", "root", "mysql");

		if (con != null)
			System.out.println("connection is successful ");
		else
			System.out.println("some problem");

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select * from emp");

		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3));

	}
}
