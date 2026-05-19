package edu.abc.tag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTagUpperCase extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		StringWriter writer=new StringWriter();

		getJspBody().invoke(writer);
		String s=writer.toString();
		getJspContext().getOut().print(s.toUpperCase());
	}
}
