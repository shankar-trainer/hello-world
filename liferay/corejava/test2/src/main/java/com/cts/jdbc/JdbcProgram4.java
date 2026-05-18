package com.cts.jdbc;


import java.sql.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class JdbcProgram4 {
    public static void main(String[] args) {
        try {
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//Load Driver 1st way
            // DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
// 2nd way
            Class.forName("org.mariadb.jdbc.Driver");
//          DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","root");

            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db2", "root", "");
            System.out.println("connection successful");

            Statement statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);
            int id;
            String name;
            LocalDate localDate;
            System.out.println("enter id name and dob (yyyy-mm-dd) ");
            id = scanner.nextInt();
            scanner.nextLine();
            name = scanner.nextLine();
            String s = scanner.next();
            localDate = LocalDate.parse(s);


            PreparedStatement preparedStatement= connection.prepareStatement("insert into employee values(?,?,?)");

            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);

            preparedStatement.setDate(3, java.sql.Date.valueOf(localDate));
            int p= preparedStatement.executeUpdate();


            if (p == 1)
                System.out.println("record added");

            ResultSet resultSet = statement.executeQuery("select * from employee");

            while (resultSet.next())
                System.out.println(resultSet.getInt(1) + "\t " + resultSet.getString(2) + "\t" + resultSet.getDate(3));

            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
    }
}
// alter table employee  add column dob date;
// update employee set dob='2000-11-26';