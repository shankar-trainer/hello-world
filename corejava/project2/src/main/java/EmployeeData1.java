import util.DatabaseConnection;

import java.sql.*;
import java.util.Scanner;

public class EmployeeData1 {

    public static void main(String[] args) {
        try {
            //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection
//                    ("jdbc:mysql://localhost:3306/cts", "root", "root");
Connection connection= DatabaseConnection.getMySqlConnection();
            Statement statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter id,name , salary");
            int id = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            float salary = scanner.nextFloat();
            //executeUpdate() -- insert , update, delete

           int res= statement.executeUpdate
                   ("insert into employee values("+id+",'"+name+"',"+salary+")");
           if(res==1)
               System.out.println(res+" record added");
           //executeQuery() -- select
            ResultSet resultSet = statement.executeQuery("select * from employee");
            while (resultSet.next())
                System.out.println
                        (resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getFloat(3));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
