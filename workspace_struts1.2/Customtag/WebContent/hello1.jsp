<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="/WEB-INF/abc.tld" prefix="s" %>
<%@taglib uri="/WEB-INF/date1.tld" prefix="d" %>
<s:mytag/>

<d:mydate format="dd-MM-yy"/><br>
<d:mydate format="dd-MMM-yyyy"/><br>
<d:mydate format="dd-MMMMM-yyyy EEEEE"/><br>
<d:mydate/><br>
Now Time is <d:mydate format=":hh:mm:ss"/><br>


<%@taglib uri="/WEB-INF/string.tld" prefix="ss" %>
<ss:mystring s="upper">hello world</ss:mystring><br>
<ss:mystring s=" ">Welcome to Servlet</ss:mystring>


</body>
</html>