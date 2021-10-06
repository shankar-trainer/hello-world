

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebParam;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/ServletTest2"},
      initParams={
		@WebInitParam(name="location1",value="chennai"),
		@WebInitParam(name="state1",value="tamilnadu"),
		})

public class ServletTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	String location, state;
	String user1, password1;
	ServletContext ctx;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
	location=  config.getInitParameter("location1");
	state=  config.getInitParameter("state1");	
	
	  ctx=config.getServletContext();	
	  user1=ctx.getInitParameter("user");
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter out=	response.getWriter();
	  response.setContentType("text/html");
	  
	  password1=ctx.getInitParameter("password");
	  
      out.print("location is  "+location);	
      out.print("<br>state is  "+state);	
      out.print("<br>db user is  "+user1);	
      out.print("<br>db password is  "+password1);	
      
	}
}
