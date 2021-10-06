package org.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.com.model.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@WebServlet("/EmpData")
public class EmpData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	SessionFactory sf;
	Configuration cfg;
	Session session;

	@Override
	public void init() throws ServletException {
		cfg = new Configuration();
		cfg.configure();
		sf = cfg.buildSessionFactory();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		session = sf.openSession();

		Query query = session.createQuery("from Employee");
		List<Employee> list1 = query.list();

		for (Employee employee1 : list1) {
			out.println("<br>"+employee1.getEmp_id() + "  " + employee1.getEmp_name() + "  " + employee1.getEmp_salary());
		}
	}

}
