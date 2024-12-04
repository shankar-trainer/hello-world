package com.coforge;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag  extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
	
		JspWriter writer=getJspContext().getOut();
		writer.print(LocalDate.now());
	}
	
}
