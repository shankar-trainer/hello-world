

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test1
 */
@WebServlet("/Test1")
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=	response.getWriter();
	try{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "mysql");
	ResultSet rs=	con.createStatement().executeQuery("select * from employee");
	
	while(rs.next())
	   out.print(rs.getString(1)+"  "+rs.getString(2)+"<br>");
	
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	}

	 
}
