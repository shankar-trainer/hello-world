package com.abc.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.abc.database.util.DatabaseUtil;

public class DatabaseBatchProgram {

	public static void main(String[] args) throws SQLException {
		Connection connection=DatabaseUtil.myDatabaseConnection();
 
		 String st[]= {
				 "insert into employee values(40001,'parvin kumar',30000)",
				 "insert into employee values(40002,'amit kumar',35000)",
				 "insert into employee values(40003,'jeevan kumar',13000)",
				 "insert into employee values(40004,'rajesh kumar',50000)",
				 "insert into employee values(40005,'pankaj kumar',20000)",
				 "insert into employee values(40006,'jaswant kumar',10000)"
		 };
		 
		 Statement statement=connection.createStatement();
		 
		 for (int i = 0; i < st.length; i++) {
			statement.addBatch(st[i]);
		}
		 
    int ar[]= statement.executeBatch();
      for (int j : ar) {
		System.out.println(j+"  record added ");
	}
	}
}
