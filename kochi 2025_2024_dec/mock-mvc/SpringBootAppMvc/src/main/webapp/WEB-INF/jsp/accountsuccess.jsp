<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="emp.css">
<style>
span {
	color: red;
}

table, tr, th, td {
	border: solid;
}

table {
	margin-left: 50pt;
	margin-top: 50pt;
}
</style>
</head>
<body>
	<%@page import="java.io.IOException"%>
	<%@page import="java.util.List"%>
	<%@page import="com.example.model.Account"%>
	<form>
		<%
		String operation = request.getAttribute("operation").toString();

		if (operation.equals("add")) {
			out.print("account added  is ");

			Account a = ((Account) request.getAttribute("account"));

			out.print("<table>");
			out.print("<tr>");
			out.print("<th>Id</th>");
			out.print("<th>Name</th>");
			out.print("<th>Balance</th>");
			out.print("<th>Gender</th>");
			out.print("<th>Account Type</th>");
			out.print("<th>City</th>");
			out.print("</tr>");

			out.println("<tr><td>" + a.getAccountId() + "</td><td>" + a.getAccountName() + "</td><td>" + a.getAccountBalance()
			+ "</td><td>" + a.getGender() + "</td><td>" + a.getAccountType() + "</td><td>" + a.getCityList()
			+ "</td></tr>");
		}

		if (operation.equals("showall")) {
			out.print("all account details ");
			out.print("<table>");
			out.print("<tr>");
			out.print("<th>Id</th>");
			out.print("<th>Name</th>");
			out.print("<th>Balance</th>");
			out.print("<th>Gender</th>");
			out.print("<th>Account Type</th>");
			out.print("<th>City List</th>");

			out.print("</tr>");

			List<Account> listAccount = (List<Account>) request.getAttribute("showAllAccount");
			for (Account a : listAccount)
				out.println("<tr><td>" + a.getAccountId() + "</td><td>" + a.getAccountName() + "</td><td>"
				+ a.getAccountBalance() + "</td><td>" + a.getGender() + "</td><td>" + a.getAccountType() + "</td><td>"
				+ a.getCityList() + "</td></tr>");
			out.print("</table>");
		}
		if (operation.equals("search")) {
			Account act = (Account) request.getAttribute("account");
			out.println("<div style='border:double;padding:20pt'><div>found</div>");
			out.print("<div>Id\tName\tbalance\tGender\tAccount Type\tcity list</div>");
			out.print("<div>" + act.getAccountId() + "\t" + act.getAccountName() + "\t" + act.getAccountBalance() + "\t"
			+ act.getGender() + "\t" + act.getCityList());
			out.println("<div>");
		}

		if (operation.equals("delete")) {

			Account act = (Account) request.getAttribute("account");
			out.println("<div style='border:double;padding:20pt'><div>Deleted Account</div>");
			out.print("<div>Id\tName\tbalance\tGender\tAccount Type\tcity list</div>");
			out.print("<div>" + act.getAccountId() + "\t" + act.getAccountName() + "\t" + act.getAccountBalance() + "\t"
			+ act.getGender() + "\t" + act.getCityList());
			out.println("<div>");

		}
		if (operation.equals("update")) {

			Account act = (Account) request.getAttribute("account");
			out.println("<div style='border:double;padding:20pt'><div> Account Updated</div>");
			out.print("<div>Id\tName\tbalance\tGender\tAccount Type\tcity list</div>");
			out.print("<div>" + act.getAccountId() + "\t" + act.getAccountName() + "\t" + act.getAccountBalance() + "\t"
			+ act.getGender() + "\t" + act.getCityList());
			out.println("<div>");

		}
		%>

	</form>


	<%--   <%@page import="java.util.Arrays"%>
	<%@page import="com.example.model.Account"%>
	<form>
		<h1>Account Information</h1>

		<%
		Account account = (Account) request.getAttribute("account");
		%>

		<div>
			id is ${account.accountId}
			<p>
				Id is
				<%=account.getAccountId()%>
			<p>
		</div>

		<div>
			Name is ${account.accountName}
			<p>
				Name is
				<%=account.getAccountName()%>
			<p>
		</div>

		<div>
			Balance is ${account.accountBalance}
			<p>
				Balance is
				<%=account.getAccountBalance()%>
			<p>
		</div>

		<div>
			Gender is ${account.gender}
			<p>
				Gender is
				<%=account.getGender().get(0)%>
			<p>
		</div>

		<div>
			Account Type is ${account.accountType}
			<p>
				Account Types are
				<%=Arrays.toString(account.getAccountType())%>
				<% 
				out.print("<ol>");
				 for(String a:account.getAccountType()){
					 out.print("<li>"+a+"<li>");
				 }
				out.print("</ol>");
				%>
			<p>
		</div>

		<div>Cities Are ${account.cityList}
		<p>
				Cities  are
				<%=account.getCityList()%>
			<p>
		</div>




	</form>
 --%>

</body>
</html>