<%@page import="java.util.ArrayList"%>
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

request.setAttribute("city", "noida");
session.setAttribute("city", "sholapur");
application.setAttribute("city", "nagpur");

session.setAttribute("country", "india");
application.setAttribute("capital", "new delhi");
request.setAttribute("state", "up");


ArrayList language=new ArrayList();

language.add("java");
language.add("python");
language.add("nodejs");
language.add("angular");
language.add("react");

session.setAttribute("language", language);

out.print("<br>1.city is "+request.getAttribute("city"));
out.print("<br>2.city is "+session.getAttribute("city"));
out.print("<br>3.city is "+application.getAttribute("city"));

out.print("<br>country is "+session.getAttribute("country"));
out.print("<br>state is "+request.getAttribute("state"));

%>
<hr>

${language[0]}<br>
${language[1]}<br>
${language[2]}<br>




</body>
</html>