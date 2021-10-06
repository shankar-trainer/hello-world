import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class JdbcTest2 {

	public static void main(String[] args) throws SQLException, ParseException {

		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

		Date date1 = dateFormat.parse("10-1-2019 12:33:44");
		Date date2 = dateFormat.parse("10-2-2019 12:33:44");
		java.sql.Date date11 = new java.sql.Date(date1.getTime());
		java.sql.Date date22 = new java.sql.Date(date2.getTime());
		PreparedStatement pst = connection.prepareStatement("insert into test11 values (?,?)");

		pst.setDate(1, date11);
		pst.setDate(2, date22);

		// pst.executeUpdate();

		System.out.println("date added");

		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select * from test11");

		rs.next();
		
	Date date8=	rs.getDate(1);
	Date date9=	rs.getDate(1);
	
	LocalDate date10=LocalDate.ofEpochDay(date8.getTime());
	LocalDate date12=LocalDate.ofEpochDay(date9.getTime());
	
	LocalDateTime dateTime1=LocalDateTime.of(date8.getYear(),date8.getMonth(), date8.getDate(), date8.getHours(), date8.getMinutes(),date8.getSeconds());
	LocalDateTime dateTime2=LocalDateTime.of(date9.getYear(),date9.getMonth(), date9.getDate(), date9.getHours(), date9.getMinutes(),date9.getSeconds());


    Period time = Period.between(date10, date12);
    
    int hr = dateTime2.getHour() - dateTime1.getHour();
    int mn = dateTime2.getMinute() - dateTime2.getMinute();

    
   
    
    
    System.out.print
    ("Age is: "+time.getYears()+ " years,"+time.getMonths()+ " months, " +time.getDays() );

	System.out.println("time is "+hr+"  "+mn);

	}

}
