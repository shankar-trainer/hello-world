package org.lpu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.lpu.model.Employee;

@WebServlet("/EmployeeData")
public class EmployeeData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
	     response.setContentType("text/html");
	     
	     Configuration configuration=new Configuration();
			configuration.configure();
			
			SessionFactory sf = configuration.buildSessionFactory();
			
			Session session=sf.openSession();
			
	      List<Employee> empList=  session.createQuery("from Employee").list();	
           out.println("<table border='2' bgcolor='yellow' align='center' width='40%'>");	
           out.println("<tr><th>Id</th><th>Name</th><th>Salary</th></tr>");
	      for(Employee emp:empList) {
	    	  out.println("<tr><td>"+emp.getId()+"</td><td>  "+emp.getName()+"</td><td>   "+emp.getSalary()+"</td></tr>");
	      }
	      out.println("</table>");	      
	}

}
