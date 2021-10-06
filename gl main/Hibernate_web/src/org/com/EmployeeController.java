package org.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.model.Employee;
import org.com.model.EmployeeDao;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        String operation=request.getParameter("operation");
        EmployeeDao dao=new EmployeeDao();
        Employee emp=null;
        Employee emp1=null;
        switch (operation) {
		case "Show All Employee" :
			for(Employee e:dao.showAllEmployee())
				out.print(e.getEmp_id()+"  "+e.getEmp_name()+" "+e.getEmp_salary()+"<br>");
			break;

		case "Search Employee":
			emp=null;
			emp=new Employee();
			emp.setEmp_id(Integer.parseInt(request.getParameter("id")));
			emp1=null;
			emp1=dao.empSearch(emp);
			if(emp1==null)
				out.print("Employee Not present");
			else
			{
				out.print("Employee Found with id "+emp1.getEmp_id());
				out.print("<br>"+emp1.getEmp_id()+"  "+emp1.getEmp_name()+"  "+emp1.getEmp_salary());
			}
		case "Add Employee":	
			emp=null;
			emp=new Employee();
			emp.setEmp_id(Integer.parseInt(request.getParameter("id")));
			emp.setEmp_name(request.getParameter("name"));
			emp.setEmp_salary(Float.parseFloat(request.getParameter("salary")));
			
			if(dao.addEmploye(emp))
				out.print("<h1>Employee added</h1>");
			else
				out.print("<h1>Employee Already Exists</h1>");
			
		case "Remove Employee":	
			emp=null;
			emp=new Employee();
			emp.setEmp_id(Integer.parseInt(request.getParameter("id")));
			
			if(dao.removeEmploye(emp))
				out.print("<h1>Employee REmove</h1>");
			else
				out.print("<h1>Employee Doesnot  Exists</h1>");	
			
		default:
			break;
		}
        
	}

}
