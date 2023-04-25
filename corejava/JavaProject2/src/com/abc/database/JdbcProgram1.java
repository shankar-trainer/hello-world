package com.abc.database;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by shankar on 3/28/2023.
 */
public class JdbcProgram1 {

    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());// 1.step load the driver
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "");//2.step get connection
            Connection connection1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabase", "root", "");//2.step get connection
            //jdbc:mysql://address=(host=myhost)(port=1111)(key1=value1)/db
            if (connection != null)
                System.out.println("connection successful");
            else
                System.out.println("connection problem");

            Statement st = connection.createStatement();

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter roll");
            int roll=sc.nextInt();

            System.out.println("Enter Name");
            sc.nextLine();// input enter
            String name=sc.nextLine();

            System.out.println("Enter Subject");
            String subject=sc.next();

            System.out.println("Enter Marks");
            float marks=sc.nextFloat();

            //int i = st.executeUpdate("insert into student (roll,name,subject,marks) values(10008,'kamal partap','chemistry',78.56)");
            int i = st.executeUpdate("insert into student (roll,name,subject,marks) values("+roll+",'"+name+"','"+subject+"',"+marks+")");

            if(i==1)
                System.out.println(i+" Record Added");


            ResultSet resultSet = st.executeQuery("select * from student");

            while (resultSet.next())
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString("name") + "\t" + resultSet.getString(3) + "\t" + resultSet.getFloat(4) + "\t" + resultSet.getDate(5));


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
