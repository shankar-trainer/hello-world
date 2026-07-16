package com.coforge.servlet;

import com.coforge.util.DatabaseUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/student")
public class StudentServlet  extends HttpServlet {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    @Override
    public void init() throws ServletException {
        try {
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/coforge_db", "root","mysql" );
            connection= DatabaseUtil.getDatabaseConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            statement= connection.createStatement();
            resultSet=statement.executeQuery("select * from student");

            PrintWriter out=resp.getWriter();
            resp.setContentType("text/html");
out.println("<table style='border:solid;margin:100pt'>");
            while(resultSet.next()){
            out.println("<tr><td>"+resultSet.getInt(1)+"</td><td>"+resultSet.getString(2)+"</td><td>"+resultSet.getString(3)+"</td></tr>");
            }
            out.println("</table>");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
