import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello")
@WebServlet(urlPatterns = {"/hello","/test","/welcome"})

public class HelloServlet extends HttpServlet {
   int count;
    @Override
    public void init(){
        count=1;
        System.out.println("init called");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2>Hello world</h2>");
        out.println("<h2>User Hits "+(count++)+"</h2>");
        System.out.println("service/doGet called");
    }

    @Override
    public void destroy() {
        System.out.println("destroy called");
    }
}
