<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("../css/mystyle.css");
</style>
<style>
.label{
 width:150px;
}
.form{
  width:50%;
}
</style>
</head>
<body>

	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

	<form:form action="accountOperation" modelAttribute="account" cssClass="form" method="post" >
		<form:label path="actId"  for="actId"  cssClass="label" >Account Id</form:label>
		<form:input path="actId"   cssClass="input" />
		<form:errors path="actId" />
		<br>

		<form:label path="actName"  for="actName"   cssClass="label">Account Name</form:label>
		<form:input path="actName" cssClass="input" />
		<form:errors path="actName" />
		<br>

		<form:label path="actBalance"   cssClass="label" for="actBalance">Account Balance</form:label>
		<form:input path="actBalance" cssClass="input" />
		<form:errors path="actBalance" />
		<br>
		
		<form:label path="actCreationDate"   cssClass="label" for="actCreationDate">Account Creation Date(dd/MM/yyyy)</form:label>
		<form:input path="actCreationDate" cssClass="input"  />
		<form:errors path="actCreationDate" />
		<br><br><br>
	
	<%-- 
		<form:label path="dob"   cssClass="label" for="actCreationDate">DOB(dd/MM/yyyy)</form:label>
		<form:input path="dob" cssClass="input"  />
		<form:errors path="dob" />
		<br>
	 --%>	
		<input type="submit" value="login">
		<input type="reset" value="Reset">
		
	</form:form>

</body>
</html>