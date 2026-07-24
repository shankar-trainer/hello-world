<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.style1 {
	background: lightyellow;
	width: 40%;
	margin: 100pt;
	padding: 20pt;
	color: blue;
	border:double;
}
label{
	float: left;
	width:110pt;
}
</style>
</head>
<body>
	<div class="style1">
		<h1>User Form</h1>
		<form action="userAction" method="post">
			<div>
				<label>enter id</label> <input name="id">
			</div>

			<div>
				<label>enter name</label> <input name="name">
			</div>

			<div>
				<label>enter salary</label> <input name="salary">
			</div>
			<div>
				<button type="submit">send</button>
				<button type="reset">cancel</button>
			</div>

		</form>
	</div>



</body>
</html>