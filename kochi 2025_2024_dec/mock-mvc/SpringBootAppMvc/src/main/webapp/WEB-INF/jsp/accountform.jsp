<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="emp.css">
</head>
<body>

	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

	<form:form modelAttribute="account" action="accountAction">
		<div>
			<form:label path="accountId">Enter Id</form:label>
			<form:input path="accountId" />
			<form:errors path="accountId"></form:errors>
		</div>

		<div>
			<form:label path="accountName">Enter Name</form:label>
			<form:input path="accountName" />
			<form:errors path="accountName"></form:errors>
		</div>

		<div>
			<form:label path="accountBalance">Enter Balance</form:label>
			<form:input path="accountBalance" />
			<form:errors path="accountBalance"></form:errors>
		</div>
		
		
		<div  style="margin-top:5pt">
			<form:label path="gender" cssStyle="font-weight:bold">Select Gender</form:label>
			<br>
			<form:radiobuttons path="gender"  items="${gender}" delimiter="<br>"/>
			<form:errors path="accountBalance"></form:errors>
		</div>
		
		<div style="margin-top:5pt">
			<form:label path="accountType" cssStyle="font-weight:bold">Select Account Type</form:label>
						<br>
			<form:checkboxes path="accountType"  items="${accountType}" delimiter="<br>"/>
			<form:errors path="accountType"></form:errors>
		</div>
		
		<div style="margin-top:5pt">
			<form:label path="cityList" cssStyle="font-weight:bold">Select City</form:label>
						<br>
			<form:select path="cityList"  items="${cityList}" delimiter="<br>"/>
			<form:errors path="cityList"></form:errors>
		</div>

		<div style="margin-top:5pt">
			<input type="submit" value="add" name="operation">
			<input type="submit" value="search" name="operation">
			<input type="submit" value="showall" name="operation">
			<input type="submit" value="delete" name="operation">
			<input type="submit" value="update" name="operation">
			
			 <input type="reset">
		</div>
	</form:form>

</body>
</html>