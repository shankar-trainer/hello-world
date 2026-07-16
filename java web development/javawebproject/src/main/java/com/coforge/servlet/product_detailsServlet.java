package com.coforge.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/product_detailsServlet")
public class product_detailsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        HttpSession session = req.getSession();

        if(session.isNew()){
            out.println("<h3>session has expired</h4><br>");
            out.println("<a href='session1'>login again</a>");
        }
        else {
            Object product1 = session.getAttribute("prd1");
            Object product2 = session.getAttribute("prd2");
            out.println("Session id " + session.getId());
            out.println("<br>product1 is " + product1);
            out.println("<br>product2 is " + product2);
        }
    }
}
