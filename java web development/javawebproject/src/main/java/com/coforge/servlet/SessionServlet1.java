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

@WebServlet("/session1")
public class SessionServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html");
        HttpSession session = req.getSession();

        session.setAttribute("prd1", "book");
        session.setAttribute("prd2", "fruits");
        session.setMaxInactiveInterval(10);

        out.println("Session id "+session.getId());
        out.println("<br>Session created at "+new Date(session.getCreationTime()));
        out.println("<br>Session last access time  "+new Date(session.getLastAccessedTime()));
        out.println("<br>Session inactive interval  time  "+session.getMaxInactiveInterval());

     out.println("<br><a href='product_detailsServlet'>product details</a>");

     out.println("<br><a href='product_details.jsp'>product details jsp</a>");
    }
}
