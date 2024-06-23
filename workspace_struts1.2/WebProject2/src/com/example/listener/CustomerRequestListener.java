package com.example.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class CustomerRequestListener implements ServletRequestListener, ServletRequestAttributeListener {
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("request destroyed");
	}

	public void requestInitialized(ServletRequestEvent arg0) {
		ServletRequest servletRequest = arg0.getServletRequest();
		servletRequest.setAttribute("state", "maharastra");
		System.out.println("request created");
	}

	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println(" request attribute added ");
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println(" request attribute removed ");
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println(" request attribute replaced ");
		
	}

}
