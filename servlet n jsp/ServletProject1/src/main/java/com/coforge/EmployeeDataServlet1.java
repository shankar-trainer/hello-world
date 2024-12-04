package com.coforge;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/EmployeeDataServlet1")
public class EmployeeDataServlet1 extends HttpServlet {

    String driver, url, user, pass;
    ServletContext context;

    Connection connection;
    ResultSet resultSet;
    Statement st;

    @Override
    public void init(ServletConfig config) throws ServletException {
        context = config.getServletContext();
        driver = context.getInitParameter("driver");
        user = context.getInitParameter("user");
        pass = context.getInitParameter("password");
        url = context.getInitParameter("url");
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            st = connection.createStatement();
            resultSet = st.executeQuery("select * from employee");
            while (resultSet.next())
                resp.getWriter().println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getFloat(3));
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
