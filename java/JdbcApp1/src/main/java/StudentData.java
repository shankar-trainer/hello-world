import java.sql.*;

/**
 * Created by shankar on 3/29/2023.
 */
public class StudentData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());// 1. way to  load the driver

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabase", "root", "");
        Statement st = connection1.createStatement();

        ResultSet resultSet = st.executeQuery("select * from student");

        ResultSetMetaData metaData = resultSet.getMetaData();

        for (int i = 1; i <=metaData.getColumnCount() ; i++) {
            System.out.print(metaData.getColumnName(i)+"\t");
        }
        System.out.println("\n");

        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3)+"\t"+resultSet.getFloat(4)+"\t"+resultSet.getDate(5));
        }

    }
}
