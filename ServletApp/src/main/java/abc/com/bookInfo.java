package abc.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bookInfo")
public class bookInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  PrintWriter out=resp.getWriter();
	  int isbn=Integer.parseInt(req.getParameter("isbn"));
	  String bname=req.getParameter("bname");
	  String author=req.getParameter("author");
	  
	  out.print("<br>isbn is "+isbn );
	  out.print("<br>book name is   "+bname );
	  out.print("<br>author name is   "+author );
	}
}
