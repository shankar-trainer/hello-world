

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.com.util.DataBaseUtil;


public class Test1 {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DataBaseUtil.myconnection();
		
		PreparedStatement pst1=con.prepareStatement("insert into student values(?,?)");
		pst1.setInt(1, 1001);
		pst1.setString(2, "ram kumar");
		
		//pst1.executeUpdate();
		
		
		PreparedStatement pst2=con.prepareStatement
				("insert into examination values(?,?,?)");
	    pst2.setInt(1, 9003);
	    pst2.setInt(2, 1001);
	    pst2.setString(3, "hindi");
	
		pst2.executeUpdate();
		
		System.out.println("added");
	}
}
