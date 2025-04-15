<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
  .form{
  
  	border: solid;
	padding: 50pt;
	background: lightyellow;
	width: 40%;
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
    border:solid red;
  }
</style>
</head>
<body>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

	<form:form modelAttribute="account" action="accountAction" cssClass="form">
		<div>
			<form:label path="id" cssClass="label" >Account Id</form:label>
			<form:input path="id" />
			<form:errors path="id" cssClass="error" />
		</div>

		<div>
			<form:label path="name" cssClass="label">Account Name</form:label>
			<form:input path="name" />
			<form:errors path="name" cssClass="error" />
		</div>
		<div>
		 <button type="submit">Login</button>
		 <button type="reset">Cancel</button>
		</div>

	</form:form>
</body>
</html>