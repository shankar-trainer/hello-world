<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%   

 Enumeration enumeration=  request.getHeaderNames();

while(enumeration.hasMoreElements()){
	Object obj=enumeration.nextElement();
   out.println("<br>"+obj+"    "+request.getHeader(obj.toString()));
}

%>
<br>
Accept Header --------------- <%=request.getHeader("accept") %>
<br>
Host is ........${header["host"] }


</body>
</html>