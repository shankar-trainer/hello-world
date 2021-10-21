<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="css/style1.css" rel="stylesheet" />

</script>

</head>
<body>

	<header style="margin-left: 500px;">
		<h1>Employee Form</h1>
	</header>

	<article>
		<form action="empform" method="post">
        <label>Enter Id</label>
         <input name="eid"><br>
        
        <label>Enter Name</label>
           <input name="ename"><br>
        
        <label>Enter Salary</label>
        <input name="esalary"><br>
        
        <button type="submit">Submit</button>
        <button type="reset">Cancel</button>
           
       </form>


</body>

</html>