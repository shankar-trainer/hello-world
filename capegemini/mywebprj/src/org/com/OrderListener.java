package org.com;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class OrderListener implements ServletRequestAttributeListener, 
ServletRequestListener {
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("request destroyed ");
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
     System.out.println("request initialized ");
    }
    ServletRequest request;
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
       srae.getServletRequest().setAttribute("state", "delhi");
       request=srae.getServletRequest();
       request.setAttribute("pin", "110090");
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
            
    }
	
}
