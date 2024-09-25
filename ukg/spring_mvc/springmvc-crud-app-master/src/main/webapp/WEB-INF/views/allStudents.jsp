<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Students</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<style type="text/css">
tr:first-child {
	font-weignt: bold;
	background-color: #c6c9c4
}
</style>
</head>
<body>
	<div class="container">
		<h2>All Registered Students</h2>
		<c:if test="${not empty success}">
			<div class="alert alert-success" role="alert">${success}</div>
		</c:if>

		<hr />
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<td>Student ID</td>
					<td>Student Name</td>
					<td>Grade</td>
					<td>Modify</td>
					<td>Delete</td>
				</tr>
				<c:forEach items="${allstudents}" var="student">
					<tr>
						<td>${student.id}</td>
						<td>${student.firstName}&nbsp;${student.lastName}</td>
						<td>${student.grade}</td>
						<td><a href="<c:url value='/edit-${student.id}' />">Modify</a></td>
						<td><a href="<c:url value='/delete-${student.id}' />">Delete</a></td>
					</tr>
				</c:forEach>
		</table>
		<hr />
		<div class="form-group">
			<a class="btn btn-secondary" href="<c:url value='/new' />">Add
				New Student</a>
		</div>
	</div>
</body>
</html>