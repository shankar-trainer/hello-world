import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.audintel.database.util.DatabaseUtil;

public class ProductDetail {

	public static void main(String[] args) throws SQLException {
		
		Connection connection=DatabaseUtil.retrieveConnection();
		
		Statement st=connection.createStatement();
		
		ResultSet rs= st.executeQuery("select * from product");
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3));
		
	}
}
