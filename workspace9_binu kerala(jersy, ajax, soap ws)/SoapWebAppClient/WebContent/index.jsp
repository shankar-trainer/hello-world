<%@page import="javax.xml.ws.WebServiceException"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Catch"%>
<%@page import="client.WelcomeImpl"%>
<%@page import="client.WelcomeImplService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form>

		<label>Enter Name</label> <input name="name"> <br> <input
			type="submit" value="send">

	</form>

	<%
		String name = request.getParameter("name");
		if (name != null) {
			try {
				WelcomeImplService service = new WelcomeImplService();
				WelcomeImpl welcomeImpl = service.getWelcomeImplPort();

				String res = welcomeImpl.hello(name);

				out.print("<br>I am from webservice <br> " + res);

			} catch (WebServiceException e) {
				out.print(e);
			}
		}
	%>

</body>
</html>