package com.coforge.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

    static Connection connection;

    static{
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getDatabaseConnection() throws SQLException {
        if(connection==null)
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/coforge_db", "root","mysql" );
        return  connection;
    }

}
