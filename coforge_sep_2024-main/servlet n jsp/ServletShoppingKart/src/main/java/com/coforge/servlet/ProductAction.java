package com.coforge.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ProductAction")
public class ProductAction extends HttpServlet{
    String name;
    String product1;
    String product2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html");
        name=req.getParameter("name");
        product1=req.getParameter("prd1");
        product2=req.getParameter("prd2");

        HttpSession session=req.getSession();
        session.setAttribute("prd1",product1);
        session.setAttribute("prd2",product2);
        session.setAttribute("name",name);

        out.println("<div>");

        out.println("<div style='float:right'><a href='LogOut'>Logout </a></div>");

        out.println("<div> Session id is "+session.getId()+"</div>");
        session.setMaxInactiveInterval(10);

        int maxInactiveInterval = session.getMaxInactiveInterval();
        out.println("<div> Session max inactive interval  "+maxInactiveInterval+"seconds </div>");

        out.println("<div><label>Name is "+name+"</label></div>");
        out.println("<div><label>Product1 is "+product1+"</label></div>");
        out.println("<div><label>Product2 is "+product2+"</label></div>");

        out.println("<div><form action='Shopping'>");

        out.println("<div><label>Enter product3</label><input name='prd3'></div>");
        out.println("<div><label>Enter product4</label><input name='prd4'></div>");
        out.println("<div><button type='submit'>Buy</button> <button type='reset'>Cancel</button></div>");
          out.println("</div>");

    }
}
