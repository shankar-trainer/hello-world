package com.cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     //1st step loading the driver
		Class.forName("oracle.jdbc.OracleDriver");//1st way to load driver
	//2nd step -- get connection
     
		Connection connection = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
        if(connection!=null)
        	System.out.println("connection successful "+connection);
        else
        	System.out.println("some problem");
        
        
        Statement st=connection.createStatement();
        
        ResultSet rs = st.executeQuery("select * from employee");
       while( rs.next())
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getFloat(3)+"  "+rs.getString(4));
        
        
	}
}
