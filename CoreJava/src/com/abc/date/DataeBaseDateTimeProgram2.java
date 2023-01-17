package com.abc.date;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.abc.database.util.DatabaseUtil;

public class DataeBaseDateTimeProgram2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		
		System.out.println("Enter id name and salary");
		
		int id=sc.nextInt();
		sc.nextLine();
		String nm=sc.nextLine();
		float salary =sc.nextFloat();
		

		 System.out.println("Enter dob in dd-MM-yyyy format");
		 String dob=sc.next();

		 System.out.println("Enter in time in hh:mm:ss format");
		 String in_time=sc.next();

		 Connection connection;
		 PreparedStatement preparedStatement;
		try {
			connection = DatabaseUtil.myDatabaseConnection();
			preparedStatement	=connection.prepareStatement("insert into employee values(?,?,?,?,?)");
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, nm);
			preparedStatement.setFloat(3, salary);
		
			Date parse = dateFormat.parse(dob);
			Date intime = timeFormat.parse(in_time);
		   	
			Time time=new Time(intime.getTime());
			
			preparedStatement.setDate(4, new java.sql.Date(parse.getTime()));
			preparedStatement.setTime(5, time);
			
			if(preparedStatement.executeUpdate()==1)
				System.out.println("Record added ");
			else
				System.out.println("some problem");
		} catch (SQLException e) {
			System.err.println("sql error "+e);
		} catch (ParseException e) {
			System.err.println("date time  parse error "+e);
		}
	}
}
