package edu.lpu.servlet;

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
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.lpu.model.Employee;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Configuration configuration=new Configuration();
        configuration.configure();
        
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();
        
        Transaction transaction=session.getTransaction();
     
		PrintWriter out	=	response.getWriter();
	     List<Employee> list = session.createQuery("from Employee").list();    
		
	     out.println("<table width='30%' align='center' border='1' bgcolor='yellow'>");
	     out.println("<tr>");
	     out.println("<th>Id</td>");
	     out.println("<th>Name</td>");
	     out.println("<th>Salary</td>");
	     
	     out.println("</tr>");
	     for(Employee e:list) {
	     out.print("<tr>");
	     out.print("<td>"+e.getId()+"</td>");
	     out.print("<td>"+e.getName()+"</td>");
	     out.print("<td>"+e.getSalary()+"</td>");
	     out.print("</tr>");
	     }    
	     out.println("</table>");
	}


}
