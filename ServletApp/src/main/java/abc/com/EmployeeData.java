package abc.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeData")
public class EmployeeData extends HttpServlet {

	Statement st;
	Connection con;
	ResultSet rs;

	@Override
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/montran", "root", "mysql");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {

			st = con.createStatement();
			rs = st.executeQuery("select * from employee");
			while (rs.next()) {
				out.print("<br>" + rs.getInt(1) + "  " + rs.getString(2) + " " + rs.getFloat(3) + "  " + rs.getDate(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
