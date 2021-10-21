import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTest1 {

	public static void main(String[] args) throws SQLException {

		// 1. Loading the driver

		// Class.forName("");

		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");

		if (connection != null)
			System.out.println("connection established");
		else
			System.out.println("some problem");

		Statement statement = connection.createStatement();
		
		Scanner  scanner=new Scanner(System.in);
		
		System.out.println("Enter id ");
		int id=scanner.nextInt();
		
		System.out.println("Enter name ");
		scanner.nextLine();
		String name=scanner.nextLine();
		
		System.out.println("Enter salary ");
		float salary=scanner.nextFloat();
			
		/*
		 * statement.executeUpdate
		 * ("insert into employee (empno, ename,salary) values ("+id+",'"+name+"',"+
		 * salary+")");
		 */	

		PreparedStatement pst=connection.prepareStatement
				("insert into employee (empno, ename,salary) values(?,?,?) ");
		
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setFloat(3, salary);
		
	int res=	pst.executeUpdate();
		System.out.println(res+" Record added");
		
		ResultSet records = statement.executeQuery("select * from employee");

		while (records.next())
System.out.println(records.getInt(1) + "   " + records.getString(2)+"  "+records.getFloat(4));
	
	}

}
