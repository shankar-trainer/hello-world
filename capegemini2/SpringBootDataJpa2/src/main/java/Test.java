import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) throws SQLException {
		
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
		
		ResultSet rs= connection.createStatement().executeQuery("select id, location from school");
		
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		
		
	}
}
