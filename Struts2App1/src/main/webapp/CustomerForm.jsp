<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/file1.css">
<s:head/>
</head>
<body>
<s:actionerror/>

<div class="style1">
<a href="cstAction.action?request_locale=en">English</a>
<a href="cstAction.action?request_locale=fr">French</a>

<s:form action="cstAction">
<s:label>Customer Page</s:label>
<s:textfield  name="customerId"   key="cst.label.id"/>
<s:textfield  name="customerName" key="cst.label.name"/>
<s:textfield name="customerLocation"  key="cst.label.location"/>
<s:submit/>

</s:form>
</div>
</body>
</html>