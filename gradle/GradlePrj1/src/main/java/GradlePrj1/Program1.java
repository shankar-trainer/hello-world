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

	public static void main(String[] args) throws SQLException {
   
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection = DriverManager.getConnection
		("jdbc:mysql://127.0.0.1:3306/montran", "root", "mysql");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from employee");

		while (resultSet.next())
			System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + "  " + resultSet.getFloat("salary")
					+ "  " + resultSet.getDate(4));

	}
}
