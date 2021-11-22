
import java.sql.*;

public class  Test1 {
    public static void main(String[] args) {
    	//oracle xe 18
        String url = "jdbc:oracle:thin:@//localhost:1521/XE";
        String username = "system";
        String password = "manager";

        String sql = "select * from employee";
        Connection connection;
        try {
        	DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        	connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            System.out.println(statement.execute(sql));
            connection.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
