<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
@import url("../employee.css");
</style>
</head>
<body>

	<form style="background: wheat">
		<div>Id is ${account.id}</div>

		<div>Name is ${account.name}</div>

		<div>balance is ${account.balance}</div>

		<div>
			Branches are
			<%
		List<String> list1 = (List) request.getAttribute("list1");

		out.println("<ol>");
		for (String b : list1) {
			out.println("<li>" + b);
		}
		out.println("</ol>");
		%>
		</div>

		States are:
		<%
		list1 = (List) request.getAttribute("list2");

		out.println("<ol>");
		for (String b : list1) {
			out.println("<li>" + b);
		}
		out.println("</ol>");
		%>
	</form>






</body>
</html>