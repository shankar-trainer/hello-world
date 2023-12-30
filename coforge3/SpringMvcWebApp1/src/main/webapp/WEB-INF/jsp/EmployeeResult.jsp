<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<spring:url value='/resources/style1.css'/>" />
</head>
<body>
<form>
<h3>Employee Result</h3>
  <div>
  Id is ${employee.empId}
  </div>
  
  <div>
 Name is ${employee.empName}
  </div>
  
  <div>
  Salary is ${employee.empSalary}
  </div>
  
</form>
</body>
</html>