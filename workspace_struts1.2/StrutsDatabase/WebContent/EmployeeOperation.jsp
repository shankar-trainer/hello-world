<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/tags/struts-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<html:form action="empaction">
<label>Enter Id</label>
<html:text property="id"></html:text>
<br>
<label>Enter Name</label>
<html:text property="name"></html:text>
<br>
<label>Enter Salary</label>
<html:text property="salary"></html:text>
<br>
<html:submit value="add" property="method" />
<html:submit value="showall" property="method" />
</html:form>

</body>
</html>