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

@WebServlet("/SessionPrg1")
public class SessionPrg1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=	response.getWriter();
	HttpSession session = request.getSession();
	
	session.setMaxInactiveInterval(10);
	
	session.setAttribute("prd1", "book");
	session.setAttribute("prd1cost", 1200);
	
	session.setAttribute("prd2", "formal pant");
	session.setAttribute("prd2cost", 2000);
	
	out.print("<br>Session id is "+session.getId());
	out.print("<br>Session inactive interval is "+session.getMaxInactiveInterval());
	out.print("<br>Session created at  "+new Date(session.getCreationTime()));
	out.print("<br>Session Last Accessed Time  at  "+new Date(session.getLastAccessedTime()));
	}

}
