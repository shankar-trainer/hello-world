import java.sql.*;

public class EmployeeData {

    public static void main(String[] args) throws SQLException {

        //Step1. Load the driver
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        //Step 2. Create Connection with database

        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/cts", "root", "root");

        if(connection!=null)
            System.out.println("connection successful");
        else
            System.out.println("some problem in connection");

        //Step3 Create Statement to execute sql query

        Statement statement = connection.createStatement();

        //Step4 execute sql query

        ResultSet resultSet = statement.executeQuery("select * from employee");
          // ResultSet column index starts from 1 to n
        while(resultSet.next())
        System.out.println
                (resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getFloat(3));
//        resultSet.next();
//        System.out.println
//                (resultSet.getInt("id")+"\t"+resultSet.getString("name")+"\t"+resultSet.getFloat("salary"));
    }
}
/*
ResultSet
           pointer
                         beforeFirst -- default pointer position
                         First
                         2
                         3
                         last
                         afterLast


 */