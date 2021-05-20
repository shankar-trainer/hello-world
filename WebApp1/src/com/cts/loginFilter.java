package com.cts;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/loginController")
public class loginFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("before request is processed");

		String utype = request.getParameter("utype");
		String id = request.getParameter("id");

		response.setContentType("text/html");
		if (utype.equals("user") && id.equals("1001"))

			response.getWriter().print("<span style='color:red;font-size:20pt'>  you are blocked <span>  ");
		else
			chain.doFilter(request, response);

		System.out.println("after request is processed");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
