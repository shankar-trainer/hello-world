package com.coforge.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag  extends SimpleTagSupport{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public void doTag() throws JspException, IOException {
	  JspWriter out = getJspContext().getOut();
	   out.print(name.toUpperCase());
	}
}
