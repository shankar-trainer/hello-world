import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class JdbcTest3 {

	public static void main(String[] args) throws SQLException, ParseException {

		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
		PreparedStatement pst = connection.prepareStatement("insert into test11 values(?,?)");

		/*
		 * pst.setTimestamp(1, new Timestamp(LocalTime.now().getSecond()*1000L));
		 * pst.setTimestamp(2, new Timestamp(LocalTime.now().getSecond()));
		 */
		  pst.setTimestamp(1, new Timestamp(new Date().getTime()));
		  pst.setTimestamp(2, new Timestamp(new Date().getTime()));
		 
		
		pst.executeUpdate();

		Statement st = connection.createStatement();

		ResultSet rs = st.executeQuery("select * from test11");

		while (rs.next()) {
			System.out.println(rs.getTime(1) + "  " + rs.getTime(2));

		}

	}

}
