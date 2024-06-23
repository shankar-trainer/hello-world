<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/tags/struts-html" prefix="html"%>
	<%@taglib uri="/tags/struts-bean" prefix="bean"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<html:errors />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<bean:write name="mycalc" property="message"/> <br>
<br><br>
	<html:form action="/calcAction">
		
		<html:submit value='addition' property="method" />
		<html:submit value='subtraction'  property="method" />
		<html:submit value='multiplication'  property="method" />
		<html:submit value='division'  property="method" />
		<html:reset />
	</html:form>


</body>
</html>