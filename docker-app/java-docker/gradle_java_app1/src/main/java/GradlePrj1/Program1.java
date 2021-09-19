package GradlePrj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program1 {
 //docker inspect container id find IpAddress use it in program 
	public static void main(String[] args) throws SQLException {
   
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                   //allowPublicKeyRetrieval=true&useSSL=false
	
Connection connection=DriverManager.getConnection("jdbc:mysql://172.17.0.2:3306/db1", "root", "1234");
//	("jdbc:mysql://172.17.0.2:3306/db1?autoReconnect=true&useSSL=false", "root", "1234");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from employee");

		while (resultSet.next())
			System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + "  " + resultSet.getFloat(3));

	}
}
