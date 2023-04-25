import java.sql.*;
import java.util.Scanner;

public class JdbcProgram2 {

    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());// 1.step load the driver
            Connection connection1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabase", "root", "");
            Statement st = connection1.createStatement();

            Scanner sc = new Scanner(System.in);

            System.out.println("insert operation");
            System.out.println("Enter roll");
            int roll = sc.nextInt();

            System.out.println("Enter Name");
            sc.nextLine();// input enter
            String name = sc.nextLine();

            System.out.println("Enter Subject");
            String subject = sc.next();

            System.out.println("Enter Marks");
            float marks = sc.nextFloat();


            PreparedStatement pst = connection1.prepareStatement("insert into student (roll,name,subject,marks) values(?,?,?,?)");
            pst.setInt(1, roll);
            pst.setString(2, name);
            pst.setString(3, subject);
            pst.setFloat(4, marks);

            int i = pst.executeUpdate();

            if (i == 1)
                System.out.println(i + " Record Added");

            System.out.println("update operation");
            //-----------------------------  update operation ----------------------

            System.out.println("Enter roll to update");
            roll = sc.nextInt();

            System.out.println("Enter Name value to update");
            sc.nextLine();
            name = sc.nextLine();

            pst = connection1.prepareStatement("update student set name=? where roll=?");
            pst.setString(1, name);
            pst.setInt(2, roll);
            i = 0;
            i = pst.executeUpdate();
            if (i == 1)
                System.out.println("record updated");

            ResultSet resultSet = st.executeQuery("select * from student");

            while (resultSet.next())
                System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString("name") + "\t" + resultSet.getString(3) + "\t" + resultSet.getFloat(4) + "\t" + resultSet.getDate(5));


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
