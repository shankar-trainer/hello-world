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
session.setAttribute("id",10001);
session.setAttribute("name","babu lal");
request.setAttribute("salary",20000);
session.setAttribute("salary",40000);
session.setAttribute("city","sholapur");


%>
id is <%=session.getAttribute("id") %>
<br>

Id is ${id}<br>
Name is ${name}<br>
Salary is ${salary}<br>
City is ${city}<br>
City is ${sessionScope.salary}<br>

</body>
</html>