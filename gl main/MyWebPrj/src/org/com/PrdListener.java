package org.com;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

 
@WebListener
public class PrdListener implements HttpSessionListener {
   
    public void sessionCreated(HttpSessionEvent arg0)  { 
         System.out.println("session created");
         arg0.getSession().setAttribute("model","Oppo" );
    }
	 
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
        System.out.println("session destroyed");
    }
	
}
