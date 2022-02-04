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
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import edu.lpu.model.Employee;
import edu.lpu.util.HibernateUtil;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=	response.getWriter();
	SessionFactory factory=HibernateUtil.SF_factory();
	 
	 Session session=factory.openSession();
	
	  Query createQuery = session.createQuery("from  Employee");
	    List<Employee> list = createQuery.list();
        for (Employee employee2 : list) {
			out.println("<br>"+employee2.getId()+"  "+employee2.getName()+"  "+employee2.getSalary());
		}
	
	}

}




