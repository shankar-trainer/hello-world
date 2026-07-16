<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%@page session="false" %>
 --%>
<% 

out.println("session id "+session.getId());
out.println("<br>product1 "+session.getAttribute("prd1"));
out.println("<br>product2 "+session.getAttribute("prd2"));

%>

</body>
</html>