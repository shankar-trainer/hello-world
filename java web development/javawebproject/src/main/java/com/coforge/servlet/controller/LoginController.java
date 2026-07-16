package com.coforge.servlet.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        String type = req.getParameter("type");

        RequestDispatcher requestDispatcher;
   resp.setContentType("text/html");
        resp.getWriter().println("controller page");


        switch (type) {
            case "normal-user":
                req.setAttribute("id", id);
                requestDispatcher=req.getRequestDispatcher("nuser.jsp");
                requestDispatcher.forward(req,resp);
                break;
            case "special-user":
                req.setAttribute("id", id);
                requestDispatcher=req.getRequestDispatcher("suser.jsp");
                requestDispatcher.include(req,resp);
                break;
        }

    }
}
