package com.example.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebParam;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
@WebFilter(urlPatterns={"/CustomerServlet"},
initParams={@WebInitParam(name="country",value="india")})
public class CustomerFilter implements Filter {
	String country;
	public void init(FilterConfig fConfig) throws ServletException {
		country=fConfig.getInitParameter("country");
   System.out.println("filter init called");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("do filter before  called");
		PrintWriter out = response.getWriter();
		if(request.getParameter("userName").equals("ram kumar")){
	      
			out.print("<div style=border:10px;width:30%;margin-left:300px;margin-top:100px;background:aqua;color:red>");
			out.print("you are blocked");
	      out.print("<br>you cannot access the site");
	      out.print("</div>");
		}
		else{
			request.setAttribute("country",country);
		chain.doFilter(request, response);
		System.out.println("do filter after   called");
		}
	}
	public void destroy() {
		System.out.println("filter destroy called");
	}

}
