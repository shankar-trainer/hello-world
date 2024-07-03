package org.coforge;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/EmployeeData")
public class EmployeeData extends HttpServlet {

    Connection connection;
    ResultSet  resultSet;
    Statement statement;

    @Override
    public void init() throws ServletException {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "mysql");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        try {
            statement=connection.createStatement();
        resultSet=statement.executeQuery("select * from employee");

        while(resultSet.next()){
            out.println("<br>"+resultSet.getInt(1)+"  "+resultSet.getString(2)+"    "+resultSet.getFloat(3));
        }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
