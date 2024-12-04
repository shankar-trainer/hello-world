package com.coforge.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LogOut")
public class LogOut extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html");

        HttpSession session=req.getSession();
        session.invalidate();

        out.println("<div style='border:double blue 10pt;padding 20pt;margin:50pt;width:50%'><h2>Your have logged out successfully</h2>");

        out.println("<div><a href='Product.html'>Login Again</a></div>");
        out.println("</div>");
    }
}
