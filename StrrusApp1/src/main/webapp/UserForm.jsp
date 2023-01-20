<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="border:solid;background:lightyellow;margin:auto;padding:20px;">
<s:form action="userAction">
<s:textfield label="Enter Id" name="userId"/><br>
<s:textfield label="Enter Name"  name="userName"/><br>
<s:textfield label="Enter Salary"  name="userSalary"/><br>
<s:submit/>
<s:reset/>
</s:form>
</div>
</body>
</html>