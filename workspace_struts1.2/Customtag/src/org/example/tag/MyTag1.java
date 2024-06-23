package org.example.tag;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag1 extends SimpleTagSupport {

	String format;

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();

		if (format != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat(format);
			out.print(dateFormat.format(new Date()));
		} else
			out.print(new Date());
		// getJspBody().invoke(null);
	}
}
