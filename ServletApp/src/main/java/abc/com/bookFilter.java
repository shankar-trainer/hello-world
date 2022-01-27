package abc.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

//@WebFilter("/bookInfo")
@WebFilter(urlPatterns = { "/bookInfo" }, initParams = @WebInitParam(name = "filterName", value = "montranFilter"))
public class bookFilter implements Filter {

	public void destroy() {
		System.out.println("filter destroy called");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("request filter");
		String author = request.getParameter("author");
		PrintWriter out = response.getWriter();
		String remoteAddr = request.getRemoteAddr();
		System.out.println(remoteAddr);

		if (author.equals("a kumar"))
			out.print("<br><font color='red' size='20pt'>" + author + " name is not allowed </font>");
		else if (remoteAddr.equals("0:0:0:0:0:0:0:2"))//0:0:0:0:0:0:0:1
			out.print("<br><font color='red' size='20pt'>" + remoteAddr + "Ip address is blocked </font>");
		else
			out.print("request is intercepted ");
		chain.doFilter(request, response);
		out.print("<br>response is intercepted");
		out.print("<br>filter name is " + filterName);

		System.out.println("response filter");
	}

	String filterName;
	FilterConfig config;

	public void init(FilterConfig fConfig) throws ServletException {
		this.config = fConfig;
		filterName = config.getInitParameter("filterName");
		System.out.println("filter init called");
	}

}
