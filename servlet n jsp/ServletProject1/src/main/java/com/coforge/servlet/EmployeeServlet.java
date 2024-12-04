package com.coforge.servlet;

import com.coforge.dao.EmployeeDao;
import com.coforge.exception.EmployeeException;
import com.coforge.model.Employee;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

//@WebServlet("/EmployeeServlet")
@WebServlet(urlPatterns = "/EmployeeServlet", initParams = {@WebInitParam(name="country",value = "india"),@WebInitParam(name="capital",value = "new delhi")})

public class EmployeeServlet extends HttpServlet {
EmployeeDao employeeDao;
String cname,capital1;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        try {
            cname=servletConfig.getInitParameter("country");
            capital1=servletConfig.getInitParameter("capital");
            employeeDao=new EmployeeDao();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html");
        out.println("<h2>Country name is "+cname);
        out.println("<h2>Country capital is "+capital1);
        try {
            String operation = req.getParameter("submit");
            switch (operation) {

                case "allemp":
                    employeeDao.getAllEmployee().forEach(a -> out.println("<br>" + a.getEmpolyeeId() + "\t" + a.getEmpolyeeName() + "\t" + a.getEmpolyeeSalary()));
                    break;
                case "addemp":
                    Employee employee = new Employee();
                    employee.setEmpolyeeId(Integer.parseInt(req.getParameter("id")));
                    employee.setEmpolyeeName(req.getParameter("name"));
                    employee.setEmpolyeeSalary(Float.parseFloat(req.getParameter("salary")));
                    employeeDao.addEmployee(employee);
                    out.println("<br>Record added");
                    break;
                case "searchemp":
                    out.println(employeeDao.searchEmployee(Integer.parseInt(req.getParameter("id"))));
                    break;
                default:
                    out.println("wrong selection");
                    break;
            }
        } catch (EmployeeException|SQLException e) {
          out.println(e.getMessage());
        }

    }
}
