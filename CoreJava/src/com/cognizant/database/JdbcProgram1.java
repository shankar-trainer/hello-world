package com.cognizant.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.cognizant.database.util.DataBaseUtil;

public class JdbcProgram1 {

	public static void main(String[] args) throws SQLException {
		//step 1 load the driver 
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		// step 2 get connection
		
		//Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		Connection connection=DataBaseUtil.retrieveConnection();
		
		if(connection!=null)
			System.out.println("connection is successful");
		else 
			System.out.println("connection problem");
		
		
		Statement st=connection.createStatement();
		
		ResultSet rs = st.executeQuery("select * from employee");
		
		ResultSetMetaData metaData=rs.getMetaData();
		int  colcount=metaData.getColumnCount();
		
		for(int x=1;x<=colcount;x++)
		  System.out.print(metaData.getColumnName(x)+"    ");
		
		System.out.println();
		
		while(rs.next())
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getFloat(3));
		//rs.next();
		//System.out.println(rs.getInt("id")+"  "+rs.getString("name")+"  "+rs.getFloat("salary"));
	
		
		connection.close();
		st.close();
		rs.close();
			
	}
}
