package com.coforge.controller;

import com.coforge.model.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/AccountController")
public class AccountController extends HttpServlet {

    int id;
    String name;
    float balance;
    String actType;
    Account account;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        id=Integer.parseInt(req.getParameter("id"));
        name=req.getParameter("name");
        balance=Float.parseFloat(req.getParameter("balance"));
        actType=req.getParameter("actType");

        account=new Account();
        account.setId(id);
        account.setName(name);
        account.setBalance(balance);
        account.setActType(actType);

        HttpSession session = req.getSession();
        session.setAttribute("account",account);

        RequestDispatcher requestDispatcher ;

        switch (actType){
            case "saving":
                requestDispatcher= req.getRequestDispatcher("savingAccount.jsp");
                requestDispatcher.forward(req,resp);
                break;
            case "demat":
                requestDispatcher= req.getRequestDispatcher("dematAccount.jsp");
                requestDispatcher.forward(req,resp);
                break;
            case "current":
                requestDispatcher= req.getRequestDispatcher("currentAccount.jsp");
                requestDispatcher.forward(req,resp);
                break;
            default:
                resp.sendRedirect("AccountForm.jsp");
                break;
        }
    }
}
