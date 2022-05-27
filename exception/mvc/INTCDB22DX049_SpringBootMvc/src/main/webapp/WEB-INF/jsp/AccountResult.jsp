<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="f" %>
Id is ${account.actId}<br>
Name is ${account.actName}<br>
Salary is ${account.actSalary}<br>
Account Creation date is ${account.actCreationDate}
<br><f:formatDate value="${account.actCreationDate}" pattern="dd-MM-yyyy"/>
<br><f:formatDate value="${account.actCreationDate}" pattern="dd-MMM-yyyy"/>
<br><f:formatDate value="${account.actCreationDate}" pattern="MMM-dd-yyyy"/>
</body>
</html>