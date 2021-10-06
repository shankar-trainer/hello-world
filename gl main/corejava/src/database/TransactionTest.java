package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import database.util.DatabaseUtil;

public class TransactionTest {

	public static void main(String[] args) throws SQLException {

		Connection connection = DatabaseUtil.retrieveConnection();
		connection.setAutoCommit(false);
		
		PreparedStatement preparedStatement=connection.prepareStatement
				("insert into book values(80089,'bal bharti', 'story',67)");
		
		int x=preparedStatement.executeUpdate();
		if(x==1)
			System.out.println("Record added");
		
		System.out.println("commit y\\n");
		
		if(new Scanner(System.in).next().equalsIgnoreCase("y"))
			connection.commit();
		else
			connection.rollback();
		
		
		
	}
}
