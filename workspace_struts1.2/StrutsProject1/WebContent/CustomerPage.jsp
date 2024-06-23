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
<html:link page="//MyLocale.do?method=english">English</html:link>

<html:link page="/MyLocale.do?method=french">
French</html:link>

<html:form action="/caction">
<bean:message key="label.id" />
<html:text property="customerId" />
        
		<br>
<bean:message key="label.name" />
<html:text property="customerName" />
		<br>
<bean:message key="label.salary" />		
<html:text property="customerSalary" />
		<br>
		<html:submit />
		<html:reset />
	</html:form>


</body>
</html>