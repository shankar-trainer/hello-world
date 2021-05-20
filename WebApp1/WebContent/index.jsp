<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<script type="text/javascript">
		function validate() {
			var id = document.getElementById('id').value
			var name = document.getElementById('name').value
			var pass = document.getElementById('pass').value
			var salary = document.getElementById('salary').value
			var hobby=document.getElementsByName('hobby')
			var status=false;

			for (const key in hobby) {
				   if(hobby[key].checked){
				     status=true;
					 break;
				   }
				}

			if (id == '') {
				alert('id is blank')
				return false
			} else if (pass == '') {
				alert('password is blank')
				return false
			} else if (name == '') {
				alert('name is blank')
				return false
			} else if (salary == '') {
				alert('salary is blank')
				return false
			}
			else if(!status){
			  alert("select the hobbies")
			  return false;
			}
			else
				return true
		}
	</script>
	<style type="text/css">
		@import url("css/style1.css");
	</style>
</head>

<body>
	<header>
		<h1>Customer Form</h1>
	</header>

	<section>
		<article>
			<form action="ServletApp1" method="post" onsubmit="return validate()">
				<label>Enter Id </label>
				<input name='id' id="id"><br>

				<label>Enter Password</label>
				<input name='pass' id="pass" type="password"><br>

				<label>Enter Name </label> <input name='name' id='name'><br>
				<label>Enter Salary </label>
				<input name='salary' id='salary'><br> 
				
				<label>Select Hobbies</label><br>
                <input type="checkbox" value="Music" name='hobby'>Music<br>
                <input type="checkbox" value="Movie" name='hobby'>Movie<br>
                <input type="checkbox" value="Touring" name='hobby'>Touring<br>
                <input type="checkbox" value="Writing" name='hobby'>Writing<br>
                <input type="checkbox" value="Reading" name='hobby'>Reading<br>
				<br>
				<input type="submit" value="send"> <input type="reset"
					value="cancel">
			</form>

		</article>
	</section>

</body>

</html>