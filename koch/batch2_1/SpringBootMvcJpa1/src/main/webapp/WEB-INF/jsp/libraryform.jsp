<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.form{
  	border: solid;
	padding: 50pt;
	background: lightyellow;
	width: 50%;
	margin-left: 200pt;
	border-radius: 20pt;
	margin-top: 50pt;
  }
  .label{
     float:left;
     width:100pt;
  }
  .error{
    color: red;
  }
</style>
</head>

<body>

<%@page isErrorPage="true" %>
<%
if(exception!=null)
	out.print(exception.getMessage());
 %>

	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form modelAttribute="library" action="libraryPost" cssClass="form">
		<h1>Library Form</h1>
		<div>
			<form:label cssClass="label" path="libraryId">Enter Id</form:label>
			<form:input path="libraryId" ></form:input>
			<form:errors path="libraryId" cssClass="error"></form:errors>
		</div>
		
		<div>
			<form:label cssClass="label" path="libraryName">Enter Name</form:label>
			<form:input path="libraryName"></form:input>
			<form:errors path="libraryName" cssClass="error"></form:errors>
		</div>
		
		<div>
			<form:label cssClass="label" path="libraryLocation">Enter Location</form:label>
			<form:input path="libraryLocation"></form:input>
			<form:errors path="libraryLocation" cssClass="error"></form:errors>
		</div>
		
		<div>
		<input type="submit" name="operation" value="add library">
		<input type="submit" name="operation" value="show all library">
		<input type="submit" name="operation" value="update">
		<input type="reset">
		</div>
	</form:form>


</body>
</html>