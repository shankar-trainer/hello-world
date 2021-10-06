package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class dbTest1 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "mysql");
			if (connection != null)
				System.out.println("connection successful");

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
			
			int x=st.executeUpdate
			("insert into student values("+roll+",'"+name+"',"+marks+",'"+date2+"')");
			
			if(x==1)
				System.out.println("Record added\n\n");
			
			ResultSet rs = st.executeQuery("select * from student");
			ResultSetMetaData metaData=rs.getMetaData();
			
			for (int i = 1; i <=metaData.getColumnCount(); i++) {
				System.out.print(metaData.getColumnName(i)+"  ");
			}
			
			System.out.println("\n----------------Reverse Order----------------------\n");
       
			rs.afterLast();
       
			while (rs.previous())
				System.out
						.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3) + "  " + rs.getDate(4));

			Statement st1=connection.createStatement();
			ResultSet rs1=st1.executeQuery("select count(*) from student");
			if(rs1.next())
			    System.out.println("Total No of Records in table "+rs1.getInt(1));
			
			rs1=st1.executeQuery("select max(marks) from student");
			if(rs1.next())
			    System.out.println("maximum marks "+rs1.getInt(1));
			
			rs1=st1.executeQuery("select min(marks) from student");
			if(rs1.next())
			    System.out.println("minimum marks "+rs1.getInt(1));
		
			rs1=st1.executeQuery("select sum(marks) from student");
			if(rs1.next())
			    System.out.println("total marks "+rs1.getInt(1));
			
			rs1=st1.executeQuery("select avg(marks) from student");
			if(rs1.next())
			    System.out.println("average marks "+rs1.getInt(1));
			
			/*while (rs.next())
				System.out
						.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3) + "  " + rs.getDate(4));
*/
			
			
			/*
			 * rs.next();
			 * System.out.println(rs.getInt("roll")+"  "+rs.getString("name")
			 * +"  "+rs.getFloat(3)+"  "+rs.getDate(4));
			 */
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e.getMessage());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}
}
