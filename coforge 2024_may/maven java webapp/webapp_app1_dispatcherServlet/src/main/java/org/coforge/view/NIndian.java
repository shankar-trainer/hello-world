package org.coforge.view;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/NIndian")
public class NIndian extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException
             {
                 String id=req.getParameter("id");
        resp.getWriter().println("<h1>North  Indian page</h1>");
        resp.getWriter().println("Id is  "+id);
    }
}