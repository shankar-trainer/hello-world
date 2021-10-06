package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import database.util.DatabaseUtil;

public class dbTest2 {

	public static void main(String[] args) throws SQLException, ParseException {
		//Class.forName("com.mysql.jdbc.Driver");
		/*DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "mysql");*/

		Connection connection=DatabaseUtil.retrieveConnection();
		
		Statement st = connection.createStatement();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter roll");
		int roll = scanner.nextInt();

		System.out.println("Enter name");
		scanner.nextLine();
		String name = scanner.nextLine();

		System.out.println("Enter marks");
		float marks = scanner.nextFloat();
		
		System.out.println("Enter dob dd\\MM\\yyyy format");
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd\\MM\\yyyy");

		String s=scanner.next();
      
		Date date1=	dateFormat.parse(s);
      	
		java.sql.Date date2=new java.sql.Date(date1.getTime());
//============	
		PreparedStatement preparedStatement = null;
		String sql="insert into student values(?,?,?,?)";
		
		preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, roll);
		preparedStatement.setString(2, name);
		preparedStatement.setFloat(3, marks);
		preparedStatement.setDate(4, date2);
		
		int s1=preparedStatement.executeUpdate();
		if(s1==1)
			System.out.println("Record added");
	}
}
