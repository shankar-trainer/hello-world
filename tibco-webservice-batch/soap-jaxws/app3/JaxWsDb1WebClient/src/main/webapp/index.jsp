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
<script>
/*
  function validate(){
	 
	  var id=document.getElementById('id').value
	  var name=document.getElementById('name').value
	  var salary=document.getElementById('salary').value
	  if(id==""){
		  alert("id is blank")
		  //return false;
	  }
	 else  if(name==""){
		  alert("name is blank")
		  //return false;
	 }
	else   if(salary==""){
		  alert("salary is blank")
		  //return false;
	}
	else {
		
		document.form.action='CustomerController';
		document.form.submit();
		//return true;
	}
	  
  }
)*/
</script>
</head>
<body>
	<form action="CustomerController" name="form">
		<div>
			<label>enter id </label> <input name="id" id="id">
		</div>
		<div>
			<label>enter name </label> <input name="name" id="name">
		</div>
		<div>
			<label>enter salary </label> <input name="salary" id="salary">
		</div>
		<div class="hello">
			<button type="submit" name="submit" value="add"  onclick="validate()">Add Record</button>
			<button type="submit" name="submit" value="showall">Show All</button>
			<button type="reset">cancel</button>
		</div>
	</form>
</body>
</html>
