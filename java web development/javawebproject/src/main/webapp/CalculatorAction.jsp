<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page errorPage="error.jsp" %>
<% 
int a=Integer.parseInt(request.getParameter("n1"));

int b=Integer.parseInt(request.getParameter("n2"));

int res=a/b;
out.println("division of "+a+" and "+b+" is "+res);


%>

</body>
</html>