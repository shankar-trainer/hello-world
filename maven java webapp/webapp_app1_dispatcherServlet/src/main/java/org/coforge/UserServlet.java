package org.coforge;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/UserServlet")
@WebServlet(urlPatterns = {"/Hello","/UserServlet"} , initParams = {@WebInitParam(name="city", value = "new delhi"),
        @WebInitParam(name="state", value = "delhi")
})
public class UserServlet extends HttpServlet {
    int counter;
    String company;

    String mycity;
    String mystate;

    @Override
    public void init(ServletConfig config) throws ServletException {
        counter = 1;
        company = "coforge ltd";
        System.out.println("init called ");
        mycity=config.getInitParameter("city");
        mystate=config.getInitParameter("state");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
           resp.setContentType("text/html");
        out.println("<form style='background:pink; border:solid;width:30%;color:blue'>");
        out.println("<form>");
        out.println("<h1>Hello Servlet..</h1>");
        out.println("<h2>User Count is " + (counter++) + "</h2>");
        out.println("<h2>Company name is " + company + "</h2>");

        String id = req.getParameter("id");
        String name = req.getParameter("name");
        out.println("<br>id is " + id);
        out.println("<br>name is " + name);
        out.println("<br>city  is " + mycity);
        out.println("<br>state is " + mystate);
        out.println("</form>");
        System.out.println("service/doget called  called ");
    }

    @Override
    public void destroy() {
        System.out.println("destroy called ");
    }
}
