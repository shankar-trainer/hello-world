package org.example.tag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Mytag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		//getJspContext().getOut().print("my first tag");
		getJspContext().getOut().print("<div style='font-weight:bold;color:blue;'>");
		getJspContext().getOut().print("Today's date is "+new Date());
		getJspContext().getOut().print("</div>");
		//getJspBody().invoke(null);
	}
}
