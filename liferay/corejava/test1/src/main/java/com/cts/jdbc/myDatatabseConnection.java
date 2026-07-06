package com.cts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class myDatatabseConnection {

    static Connection connection;

    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            //Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static Connection getDatbaseConnection() throws SQLException {
        if(connection==null)
            //connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "");
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db2", "root", "");
     return connection;
    }

}
