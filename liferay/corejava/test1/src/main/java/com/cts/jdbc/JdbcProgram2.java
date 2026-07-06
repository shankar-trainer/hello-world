package com.cts.jdbc;


import java.sql.*;

public class JdbcProgram2 {
    public static void main(String[] args) {
        try {
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//Load Driver 1st way
           // DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
// 2nd way
          //  Class.forName("org.mariadb.jdbc.Driver");
//          DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","root");

            //Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db2", "root", "");

            Connection connection =myDatatabseConnection.getDatbaseConnection();
            System.out.println("connection successful");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from employee");

            while (resultSet.next())
                System.out.println(resultSet.getInt(1) + "\t " + resultSet.getString(2) + "\t" + resultSet.getDate(3));

//            resultSet.next();
//            System.out.println(resultSet.getInt("id") + "\t " + resultSet.getString("name"));

            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        //catch (ClassNotFoundException e) {
//            System.err.println(e);
//        }
    }
}
// alter table employee  add column dob date;
// update employee set dob='2000-11-26';