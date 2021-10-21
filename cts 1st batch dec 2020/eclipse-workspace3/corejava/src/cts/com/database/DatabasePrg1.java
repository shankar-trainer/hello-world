package cts.com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePrg1 {

	public static void main(String[] args) throws SQLException {

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "mysql");

		if (connection != null)
			System.out.println("connection successful ");
		else
			System.out.println("some problem");

		Statement st=connection.createStatement();
		
		
	int x=	st.executeUpdate("insert into product values(6765,'cycle ',10000.5)");
		if(x==1)
			System.err.println("Record added");
		
		
		ResultSet result = st.executeQuery("select * from product");
		
		/*result.next();
		System.out.println(result.getInt(1)+"   "+result.getString(2)+"  "+result.getFloat(3));

		result.next();
		System.out.println(result.getInt(1)+"   "+result.getString(2)+"  "+result.getFloat(3));
       */
		
		while(result.next())
		System.out.println(result.getInt(1)+"   "+result.getString(2)+"  "+result.getFloat(3));
		
	}
	
}
