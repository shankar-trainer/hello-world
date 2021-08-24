package edu.abc.tag;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyDate extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		Date date=new Date();
		String s=DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
		
		getJspContext().getOut().print("<br>"+s);

	}
}
