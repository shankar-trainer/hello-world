<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
	<head>
		<title>JSP for exampleForm</title>
	</head>
	<body>
		<html:form action="/example2.do">
 <html:errors />
			Name: <html:text property="name" /> <br>
			Age: <html:text property="age" /> <br>			
			<html:submit value="Send"/>
		</html:form>
	</body>
</html>
