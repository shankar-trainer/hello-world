package com.coforge.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "departmentsevlet", urlPatterns = "/department",
        initParams = {
                @WebInitParam(name = "city", value = "noida"),
                @WebInitParam(name = "state", value = "up"),
        }
)
public class DepartmentServlet extends HttpServlet {

    int id;
    String name;
    String city;
    String state;
    String college;

    ServletContext context;

    @Override
    public void init(ServletConfig config) throws ServletException {
        city = config.getInitParameter("city");
        state = config.getInitParameter("state");
        context=config.getServletContext();
        college=context.getInitParameter("college");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        id = Integer.parseInt(req.getParameter("id"));
        name = req.getParameter("name");
        PrintWriter out=resp.getWriter();
        out.println("Department data");
        out.println("\t id :"+id);
        out.println("\t name :"+name);
        out.println("\t city :"+city);
        out.println("\t state :"+state);
        out.println("\t college :"+college);
    }
}
