<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  .hello{
   border: solid;
   width:50%;
   padding:20pt;
  }
  
  form.label{
   float:left;
   width:100pt;
  }
  
  form.input{
   width:100pt;
  }
  
  
</style>
</head>
<body>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<form:form action="empAction" modelAttribute="emp" cssClass="hello">
		<div>
			<form:label path="id">enter id</form:label>
			<form:input path="id" />
			<form:errors path="id" cssStyle="color:red"></form:errors>
		</div>

		<div>
			<form:label path="name">enter name</form:label>
			<form:input path="name" />
			<form:errors path="name" cssStyle="color:red"></form:errors>
		</div>

		<div>
			<form:label path="salary">enter salary</form:label>
			<form:input path="salary" />
			<form:errors path="salary" cssStyle="color:red"></form:errors>
		</div>
		<div>
			<button type="submit">send</button>
			<button type="reset">cancel</button>
		</div>
	</form:form>
</body>
</html>