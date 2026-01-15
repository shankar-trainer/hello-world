package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
private  static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getMySqlConnection() throws SQLException {
        if (connection == null)
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/cts", "root", "root");
        return connection;
    }
}
