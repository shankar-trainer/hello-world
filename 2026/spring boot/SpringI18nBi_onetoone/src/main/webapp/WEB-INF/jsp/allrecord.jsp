<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.style1 {
	border: solid;
	margin: 100pt;
	width: 40%;
	background-color: lightyellow;
}
tr,td{
	border: solid;
}

</style>
</head>
<body>
	<%@ taglib prefix="c" uri="jakarta.tags.core"%>
	<table class="style1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
		</tr>
		<c:forEach items="${allrecord}" var="emp">
			<tr>
				<td><c:out value="${emp.id}"></c:out></td>
				<td><c:out value="${emp.name}"></c:out></td>
				<td><c:out value="${emp.salary}"></c:out></td>
				<td>
					<table>
					<tr>
					<th>location</th>
					<th>pincode</th>
					
					</tr>
						<tr>
							<td><c:out value="${emp.address.location}"></c:out></td>

							<td><c:out value="${emp.address.pincode}"></c:out></td>
						</tr>
					</table>
				</td>
			</tr>
		</c:forEach>

	</table>




</body>
</html>