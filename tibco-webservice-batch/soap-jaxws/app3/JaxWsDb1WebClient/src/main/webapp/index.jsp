<html>
<head>
<style>
form {
	background-color: lightyellow;
	border: 5pt solid;
	width: 30%;
	padding: 20pt;
	margin-left: 200pt;
}

label {
	float: left;
	width: 100pt;
}

input {
	width: 100pt;
}

.hello {
	margin-top: 4pt;
}
</style>
</head>
<body>
	<form  action="CustomerController">
		<div>
			<label>enter id </label> <input name="id">
		</div>
		<div>
			<label>enter name </label> <input name="name">
		</div>
		<div>
			<label>enter salary </label> <input name="salary">
		</div>
		<div class="hello">
			<button type="submit" name="submit" value="add">Add Record</button>
			<button type="submit" name="submit" value="showall">Show All</button>
			<button type="reset">cancel</button>
		</div>
	</form>
</body>
</html>
