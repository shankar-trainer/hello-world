package abc.com;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/User1Servlet")

public class User1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
// 1. init called 
	public void init(ServletConfig config) throws ServletException {
	System.out.println("init called");
	}

	public void destroy() {
		System.out.println("destroy called");
	}
//2.service
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("service called");
	doGet(request, response);
	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("doGet called ");
	doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost called ");
		
	}

}
