package org.coforge.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FoodController")
public class FoodController extends HttpServlet {


//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id=req.getParameter("id");
        String type=req.getParameter("type");

        RequestDispatcher requestDispatcher;

        if(type.equals("sindian")){
            requestDispatcher=req.getRequestDispatcher("SIndian");
            requestDispatcher.forward(req,resp);
        }
        if(type.equals("nindian")){
            requestDispatcher=req.getRequestDispatcher("NIndian");
            requestDispatcher.forward(req,resp);
        }
        if(type.equals("chinese")){
            requestDispatcher=req.getRequestDispatcher("Chinese");
            requestDispatcher.forward(req,resp);
        }

    }

}
