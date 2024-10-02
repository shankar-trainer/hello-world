<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.label {
	float: left;
	width: 100pt
}

.input {
	width: 100pt
}

.form {
	border: solid;
	width: 30%;
	padding: 20pt;
	margin-left: 300pt;
	margin-top: 50pt;
}

div {
	margin-bottom: 10px;
	clear:both;
	display:block;
}
</style>
</head>
<body>

	<form class="form">
		<div>
			<label class="label">id is ${person.id}</label>
		</div>

		<div>
			<label class="label">name is ${person.name}</label>
		</div>

		<div>
			<label class="label">age is ${person.age}</label>
		</div>

	</form>
</body>
</html>