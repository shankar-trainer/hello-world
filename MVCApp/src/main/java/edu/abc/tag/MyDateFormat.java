package edu.abc.tag;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyDateFormat extends SimpleTagSupport {
	String format;
	DateFormat dateFormat;

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void doTag() throws JspException, IOException {
		Date date=new Date();
	
		if(format!=null) {
		dateFormat=new SimpleDateFormat(format);
		
		getJspContext().getOut().print("<br>"+dateFormat.format(date));
		}
		else 
			getJspContext().getOut().print("<br>"+date);
	}
}
