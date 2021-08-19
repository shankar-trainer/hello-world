package abc.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		RequestDispatcher dispatcher;

		String utype = request.getParameter("utype");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		if(utype==null) {
			out.print
("<div  style='color:red;background:yellow;font-size:20px;width:30%;text-align:center;margin-left:300px;'>Select user type</div>  " );
			dispatcher = request.getRequestDispatcher("Login.html");
			dispatcher.include(request, response);
		}
		
		else if (utype.equals("user")) {
			dispatcher = request.getRequestDispatcher("result/userPage.html");
			out.print("<br>id is " + id);
			out.print("<br>name is " + name);
			// dispatcher.forward(request, response);
			dispatcher.include(request, response);
		}

		else if (utype.equals("admin")) {

			dispatcher = request.getRequestDispatcher("result/adminPage.html");
			out.print("<br>id is " + id);
			out.print("<br>name is " + name);

			// dispatcher.forward(request, response);
			dispatcher.include(request, response);
		}

	}
}
