<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/file1.css">
</head>
<body>

<div class="style1">
<s:label>Customer Information Page</s:label>
<s:text name="cst.out.id"/> <s:property value="customerId" /><br>
<s:text name="cst.out.name"/>  <s:property value="customerName" /><br>
<s:text name="cst.out.location"/>  <s:property value="customerLocation" /><br>
</div>

<hr>
<div class="style1">
Id is ${customerId}<br>
Name is ${customerName}<br>
Location is ${customerLocation}<br>
</div>
</body>
</html>