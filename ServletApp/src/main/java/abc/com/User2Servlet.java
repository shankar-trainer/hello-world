package abc.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/User2Servlet")

public class User2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//1. doget 
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int  id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		
		String hobbies[]=request.getParameterValues("hobbies");
		
		PrintWriter out=response.getWriter();
		out.print("<br>id is "+id);
		out.print("<br>name is "+name);
		out.print("<br>gender  is "+gender);
		out.print("<br>hobbies are ");
		out.print("<ul>");
		for (String string : hobbies) {
			out.print("<li>"+string);
		}
		out.print("</ul>");
		
		
		System.out.println("do get  called ");
	}

	
	//2.doPost 
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do post called ");
	}
*/
}
