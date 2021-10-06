

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/StudentData")
public class StudentData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	PrintWriter out=response.getWriter();
	try {
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//Class.forName("com.mysql.jdbc.Driver");
	//Connection	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "mysql");
	
		InitialContext ctx=new InitialContext();
		
		DataSource ds=	(DataSource) ctx.lookup("java:comp/env/jdbc/TestDB");
		
		Connection connection=ds.getConnection();
	
	Statement statement=connection.createStatement();
	ResultSet rs= statement.executeQuery("select * from employee");
	ResultSetMetaData metaData=rs.getMetaData();
	
	out.print("<table border='1' align='center' bgcolor='aqua' width='40%'>");
	out.print("<tr>");
	for (int i = 1; i <=metaData.getColumnCount(); i++) {
		out.print("<th>"+metaData.getColumnName(i)+"</th>");
	}
	out.print("</tr>");
	while(rs.next())
		out.print("<tr><td>"+rs.getInt(1)+"</td><td>  "+rs.getString(2)+"</td> <td> "+rs.getFloat(3)+"</td> </tr>");
	out.print("</table>");
	} catch (SQLException | NamingException e) {
		e.printStackTrace();
	}
	
		}


}
