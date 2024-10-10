package com.coforge.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CustomerAction")
public class CustomerAction extends HttpServlet {

    String id,pass,search_engine;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        id= req.getParameter("id");
        pass= req.getParameter("pass");
        search_engine= req.getParameter("search");
        if(id==null ||id.isEmpty() || pass==null||pass.isEmpty()||search_engine==null ||search_engine.isEmpty()){
            resp.sendRedirect("CustomerForm.html");
        }
        else{
            switch (search_engine){
                case "google":
                    resp.sendRedirect("https://www.google.com/");
                    break;
                case "yahoo":
                    resp.sendRedirect("https://search.yahoo.com/");
                    break;
                case "bing":
                    resp.sendRedirect("https://www.bing.com/");
                    break;
                case "duckduck":
                    resp.sendRedirect("https://duckduckgo.com/");
                    break;
                default:
                    resp.sendRedirect("CustomerForm.html");
            }
        }
    }
}
