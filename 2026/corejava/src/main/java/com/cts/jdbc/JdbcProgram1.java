package com.cts.jdbc;


import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcProgram1 {
    public static void main(String[] args) {

        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","root");
            System.out.println("connection successful");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
