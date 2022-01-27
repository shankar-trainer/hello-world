<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="/struts-tags" prefix="s" %>

<s:form action="additionAction">

<s:textfield label="Enter No1" name="n1"/>
<s:textfield label="Enter No2"  name="n2"/>

<s:submit/>

</s:form>
</body>
</html>