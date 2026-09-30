<!DOCTYPE html>
<html>

<head>
	<title>Title of the document</title>
	<link rel="stylesheet" href="emp.css">
	<style>
		span{
			color:red;
		}
		</style>
	<script>
		function validate() {
			var id = document.getElementById('id').value
			var name = document.getElementById('name').value
			var salary = document.getElementById('salary').value
			if (id == '') {
				document.getElementById('err_id').innerHTML = 'id is blank'
				return false;
			}
			else if (id <= 0) {
				document.getElementById('err_id').innerHTML = 'invalid id'
				return false;
			}
			else if (name == '') {
				document.getElementById('err_name').innerHTML = 'name is blank'
				return false;
			}
			else if (name.length < 5) {
				document.getElementById('err_name').innerHTML = 'name must of at least 5 character'
				return false;
			}

			else if (salary == '') {
				document.getElementById('err_salary').innerHTML = 'salary is blank'
				return false;
			}
			else if (salary <= 0) {
				document.getElementById('err_salary').innerHTML = 'invalid salary'
				return false;
			}
			else {
				return true;
			}

		}
	</script>

</head>

<body>
	<form action="empaction" onsubmit="return validate()">
		<h1>
			Employee Form
		</h1>

		<div>
			<label>Enter Id</label>
			<input name="id" id="id">
			<span id="err_id" ></span>
		</div>

		<div>
			<label>Enter Name</label>
			<input name="name" id="name">
			<span id="err_name"></span>

		</div>
		<div>
			<label>Enter Salary</label>
			<input name="salary" id="salary">
			<span id="err_salary"></span>

		</div>
		<div>
			<button type="submit">Login</button>
			<button type="reset">Cancel</button>

		</div>

	</form>

</body>

</html>