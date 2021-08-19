package abc.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionPrg2")
public class SessionPrg2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
	
		if(session.isNew()) {
			out.print("<br>your session has expired ");
		}
		else {
		Object prd1 = session.getAttribute("prd1");
		Object prd1cost = session.getAttribute("prd1cost");

		Object prd2 = session.getAttribute("prd2");
		Object prd2cost = session.getAttribute("prd2cost");

		out.print("Product1 name "+prd1);
		out.print("<br>Product1 cost "+prd1cost);
		
		out.print("<br>Product2 name "+prd2);
		out.print("<br>Product2 cost "+prd2cost);
		
		out.print("<br><br><br><br><a href='Logout'>Logout </a>");
		}
	}

}
