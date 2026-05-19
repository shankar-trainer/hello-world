<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="simpletags" prefix="s"%>
	<s:simple2>
	this is the body</s:simple2>
	
	<%@taglib uri="datetags" prefix="d" %>
	<br>date is <d:date></d:date>
	
	<h2>date in custom format</h2>
	<%@taglib uri="dateformat" prefix="d2" %>
	date1 is  <d2:df format="dd-MM-yyyy"></d2:df><br>
	date2 is  <d2:df format="dd-MMM-yyyy"></d2:df><br>
	date3 is  <d2:df format="dd-MMMMM-yyyy EEEEE"></d2:df><br>
	<hr>  
	<p>UpperCase Tag
	
	<%@taglib uri="uppercasetag" prefix="u" %>
	<u:upper>hello world</u:upper>
</body>
</html>