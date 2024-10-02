package com.coforge.database;

import java.sql.*;
import java.util.Scanner;

public class EmployeeData {
    public static void main(String[] args) {

        try {
            //Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coforge", "root", "mysql");

            if(connection!=null)
                System.out.println("connection established");
            else
                System.err.println("some problem");

            Statement statement = connection.createStatement();
            Scanner scanner=new Scanner(System.in);
            System.out.println("Adding Record");
            System.out.println("Enter id name and salary");
            int id=scanner.nextInt();
            scanner.nextLine();
            String name=scanner.nextLine();
            float sal=scanner.nextFloat();
             // statement.executeQuery() -- used for select statement
            // statement.executeUpdate() -- used for insert update and delete  statement
            statement.executeUpdate("insert into employee values("+id+",'"+name+"',"+sal+")");

//==================== select query
            ResultSet resultSet = statement.executeQuery("select * from employee");
            // ResultSet default position is beforeFirst

           while( resultSet.next())
            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getFloat(3));

//            System.out.println(resultSet.getInt("id")+"\t"+resultSet.getString("name")+"\t"+resultSet.getFloat("salary"));

        } catch (ClassNotFoundException e) {
            System.out.println("drive not present");
        }
        catch ( SQLException e){
            System.err.println("sql error "+e.getMessage());
        }
    }
}
/*
mysql> create database coforge;
mysql> use  coforge;
mysql> create table employee(id int primary key, name  varchar(20), salary float);
mysql> insert into employee values(10001,'ram kumar',20000),
                                  (10002,'amit kumar',34000),
                                  (10004,'suman kumar',450000);

  ResultSet  ---  beforeFirst-- default position(no record)
                   First     -- record starts

                   last
                   afterLast
*/