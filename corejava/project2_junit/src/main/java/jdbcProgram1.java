import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class jdbcProgram1 {

    public static void main(String[] args) //throws SQLException
    {
        try {
            // load the driver
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coforge_db", "root", "mysql");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coforge_db", "root", "mysql");

            if (connection != null)
                System.out.println("connection successful " + connection);
            else
                System.out.println("some problem");

            Statement statement = connection.createStatement();

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter id name city either (noida,delhi,chennai) gender either(male,female),  ");
            int id = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            String city = scanner.next();
            String gender = scanner.next();

            System.out.println("enter number of hobbies ");
            int n= scanner.nextInt();
            String hobbies[]=new String[n];

            System.out.println("hobbies one or more(music, movie ,touring, reading)");
            for (int i=0;i<hobbies.length;i++) {
                hobbies[i]= scanner.next();
            }
            String hb = String.join(",", hobbies);
            System.out.println("hobbies "+hb);
//            int i = statement.executeUpdate("insert into student (id,name,city) values(" + id + ",'" + name + "','" + city + "')");

            int i = statement.executeUpdate("insert into student  values(" + id + ",'" + name + "','" + city + "','"+gender+"','"+hb+"')");

            System.out.println(i + " record added");

            ResultSet resultSet = statement.executeQuery("select * from student");
//                 resultSet.next();
//        System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3));
            while (resultSet.next())
                System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("name") + "\t" + resultSet.getString("city") + "\t" + resultSet.getString("gender") + "\t" + resultSet.getString("hobbies"));
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
/*
                               beforeFirst()-- default position
 ResultSet -- pointer --        first
                                  2nd
                                  last
                                  afterLast
                                  methods are
                                  next(), first(), last()
 show create table student;
    CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `gender` enum('male','female') DEFAULT NULL,
  `hobbies` set('music','movie','touring','reading') DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `student_chk_1` CHECK ((`city` in (_utf8mb4'chennai',_utf8mb4'delhi',_utf8mb4'noida')))
)
 */