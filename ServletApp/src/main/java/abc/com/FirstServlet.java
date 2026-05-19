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

//@WebServlet("/FirstServlet")
//@WebServlet("/welcome")
@WebServlet(urlPatterns = {"/welcome","/test","/hello"})
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count;
	@Override
	public void init() throws ServletException {
		System.out.println("init called ");
		count=1;
	}

	// generic servlet service
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		PrintWriter out=res.getWriter();
//		out.print("<h1>hello </h1>");
//		out.print("<h1>User Visits "+(count++)+"</h1>");
//		System.out.println("generic servlet service method");
//		
//	}

	
	//  httpservlet service
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("http servlet service method");
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		pw.print("<h2>welcome</h2>");
	}

	@Override
	public void destroy() {
		System.out.println("destroy called");
	}
}
