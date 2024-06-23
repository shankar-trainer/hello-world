package org.example.tag;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class StringUpperCase extends BodyTagSupport {
	String s;

	public void setS(String s) throws IOException {
		this.s = s;
	}

	public int doAfterBody() throws javax.servlet.jsp.JspException {

		String string = getBodyContent().getString();

		JspWriter enclosingWriter = getBodyContent().getEnclosingWriter();
		if (string != null) {
			if (s.equalsIgnoreCase("upper")) {
				try {
					enclosingWriter.print(string.toUpperCase());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					enclosingWriter.print(string);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return SKIP_BODY;
	};

}
