package com.cts.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class ShoppingKartInterceptor implements HandlerInterceptor{
  
 @Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	   request.setAttribute("country", "india");
	   request.setAttribute("shop", "big bazaar");
	   
	   System.out.println("called before request is processed");
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
 
 @Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	   System.out.println("called after  request is processed");

		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

 @Override
 public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
 		throws Exception {
	 System.out.println("after rendering the view");
 	HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
 }

}
