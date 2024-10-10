package com.coforge.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Shopping")
public class Shopping extends HttpServlet{
    String name;
    String product1;
    String product2;
    String product3;
    String product4;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html");

        HttpSession session=req.getSession();

        out.println("<div style='float:right'><a href='LogOut'>Logout </a> </div>");

        if(session.isNew()){
            out.println("<div style='border:double blue 10pt;padding 20pt;margin:50pt'><h2>Your Session has expired</h2>");
            out.println("<div><a href='Product.html'>Login Again</div>");
            out.println("</div>");
        }else {
            product1 = (String) session.getAttribute("prd1");
            product2 = (String) session.getAttribute("prd2");
            name = (String) session.getAttribute("name");

            product3 = req.getParameter("prd3");
            product4 = req.getParameter("prd4");

            out.println("<div>");

            out.println("<div> Session id is " + session.getId() + "</div>");
            out.println("<div><label>Name is " + name + "</label></div>");
            out.println("<div><label>Product1 is " + product1 + "</label></div>");
            out.println("<div><label>Product2 is " + product2 + "</label></div>");
            out.println("<div><label>Product3 is " + product3 + "</label></div>");
            out.println("<div><label>Product4 is " + product4 + "</label></div>");
            out.println("</div>");
        }
    }
}
