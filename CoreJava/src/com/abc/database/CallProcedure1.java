package com.abc.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.abc.database.util.DatabaseUtil;

public class CallProcedure1 {

	
	public static void main(String[] args) throws SQLException {
		//CallableStatement callableStatement=DatabaseUtil.myDatabaseConnection().prepareCall("{call allemployee}");
		
		Connection connection = DatabaseUtil.myDatabaseConnection();
		CallableStatement callableStatement=connection.prepareCall("{call allemployee}");
		ResultSet executeQuery = callableStatement.executeQuery();
		
		while(executeQuery.next())
			System.out.println(executeQuery.getInt(1)+"\t"+executeQuery.getString(2));
	}
	
	
	
}

/*
 procedure without argument
 
change delimiter from ; to //
mysql> delimiter //
mysql> select * from employee;
    -> //
    
    create procedure 
    
mysql> create procedure allemployee()
    -> begin
    -> select * from employee;
    -> end;
    -> //
Query OK, 0 rows affected (0.23 sec)

 calling procedure 
 

mysql> call allemployee()//
 
 
 
 
 
 */
		