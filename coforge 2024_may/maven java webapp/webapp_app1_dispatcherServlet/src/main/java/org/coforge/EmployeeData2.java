package org.coforge;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/EmployeeData2")
public class EmployeeData2 extends HttpServlet {

    DataSource dataSource;
    InitialContext context;
    ResultSet resultSet;
    Statement statement;
   Connection connection;
    @Override
    public void init() throws ServletException {

            try {
                context = new InitialContext();
                dataSource = (DataSource) context.lookup("java:/comp/env/jdbc/TestDB");
                connection = dataSource.getConnection();
            } catch (NamingException |SQLException  e) {
                throw new RuntimeException(e);
            }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from employee");
            out.println("<style> td{border:solid red;}</style>");

            out.println("<table style='border:double;background-color:yellow;margin-left:300pt;padding:20pt'>");
            while (resultSet.next()) {
                out.println("<tr style='border:solid blue;'><td>" + resultSet.getInt(1) + "</td><td>  " + resultSet.getString(2) + "</td> <td>   " + resultSet.getFloat(3)+"</td></tr>");
 //               out.println("<br>" + resultSet.getInt(1) + "  " + resultSet.getString(2) + "    " + resultSet.getFloat(3));
            }
            out.println("</table>");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
