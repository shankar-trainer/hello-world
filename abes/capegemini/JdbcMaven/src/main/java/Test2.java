
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.com.util.DataBaseUtil;

public class Test2 {

	public static void main(String[] args) throws SQLException {

		Connection con = DataBaseUtil.myconnection();

		Statement st1 = con.createStatement();
		Statement st2 = con.createStatement();
		PreparedStatement pst1, pst2, pst3, pst4;

		ResultSet rs1 = st1.executeQuery("select count(*) from student");
		rs1.next();
		int length = rs1.getInt(1);
		int roll[] = new int[length];
		int x = 0;

		ResultSet rs2 = st1.executeQuery("select stud_roll from student");
		while (rs2.next()) {
			roll[x++] = rs2.getInt(1);
		}

		for (int i : roll) {
			pst1 = con.prepareStatement("select * from student where stud_roll=?");
			pst1.setInt(1, i);
			ResultSet rs3 = pst1.executeQuery();
			while(rs3.next())
			System.out.println(rs3.getInt(1) + " " + rs3.getString(2));
			
			pst2 = con.prepareStatement("select * from examination where exam_roll=?");

			pst2.setInt(1, i);
			ResultSet rs4 = pst2.executeQuery();
			while(rs4.next())
			System.out.println("\t\t"+rs4.getInt(2) + " " + rs4.getString(3));
		
		}

	}
}
