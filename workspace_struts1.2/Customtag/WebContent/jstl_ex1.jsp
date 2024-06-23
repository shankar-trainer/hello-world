<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  
for(int x=0;x<=10;x++){
	out.println(x+", ");
}

%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<h2>Using JSTL</h2>

<c:forEach var="a" begin="1" end="10" step="2">
 ${a}  <br>
 <c:out value="${a}"></c:out>
</c:forEach>

</body>
</html>