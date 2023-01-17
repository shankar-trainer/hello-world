package com.abc.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.abc.database.util.DatabaseUtil;

public class CallProcedure2 {

	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = DatabaseUtil.myDatabaseConnection();
		CallableStatement callableStatement=connection.prepareCall("{call searchemployee(?,?,?)}");
		callableStatement.setInt(1, 100188);
		callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
		callableStatement.registerOutParameter(3, java.sql.Types.FLOAT);
		
		callableStatement.execute();
		
		String name = callableStatement.getString(2);
		float salary = callableStatement.getFloat(3);
		if(name==null || salary==0)
			System.out.println("not found");
		else 
			System.out.println("found \nname "+name+"\nsalary"+salary);
		}
	
}

/*
create procedure with argument 
  mysql> create procedure searchemployee(id1 int,out name1 varchar(20),out salary1 float )
    -> begin
    -> select name,salary into name1,salary1 from employee  where id=id1;
    -> end;
    -> //
Query OK, 0 rows affected (0.04 sec)

mysql> call searchemployee(1001,@myname,@mysalary)//

print value 

mysql> select @myname,@mysalary// 
 
 
 */
		