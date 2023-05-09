<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
@import
url('css/style1.css')
</style>
<style type="text/css">
form {
	background: yellow;
	width: 25%;
}

body {
	background-color: lightyellow;
}
</style>

<script src="https://code.jquery.com/jquery-3.6.1.min.js"
	integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
	crossorigin="anonymous"></script>
<script type="text/javascript">
	$(function(){
		//$('#submit').click(
		$('form').submit(
		
				function(){
			if($('#id').val()=='')
				alert('id is blank')
			
			else if(isNaN($('#id').val()))
				alert('id is not a number')
				
			else if($('#name').val()=='')
					alert('name is blank')
				
			else if($('#name').length<=10)
					alert('name must of more than 10 character')
		
				else	if($('#salary').val()=='')
						alert('salary is blank')
					
					else if(isNaN($('#salary').val()))
						alert('id is not a number')
				else
					alert('validated')
		}		
		
		)
	})
</script>

</head>
<body>
	<form action='StudentAction'>
		<label>Enter Id</label> <input type="text" name="id" id='id'>
		<br>
		
		<label>Enter Name</label> <input type="text" name="name" id='name'>
		<br>
		
		<label>Enter Salary</label> <input type="text" name="salary" id='salary'>
		<br>
		<input type='submit' id='submit' value="Login">
		<input type='reset'  id='reset' value="Cancel">
		
	</form>
</body>
</html>
