<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <title>Person Form</title>

    
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<style>
 
  .displayerros { color:red}

</style>
</head>
<body>

  <jsp:include page="header_menu.jsp" />


 <div class="container"  style="margin-left: 5pt">
  <spring:url value="/demo/mvcsaveperson" var="saveURL" />
  <h2>Person</h2>

  <form:form modelAttribute="personForm" method="post" action="${saveURL }" cssClass="form" >
   <form:hidden path="id"/>

   <div class="form-group">
    <label>Name</label>
    <form:input path="name" cssClass="form-control" id="name" />
    <form:errors path="name" class="displayerros"  />

   </div>

   <div class="form-group">
    <label>Email</label>
    <form:input path="email" cssClass="form-control" id="email" />
    <form:errors path="email" class="displayerros" />

   </div>

   <div class="form-group">
    <label>Age</label>
    <form:input path="age" cssClass="form-control" id="age" />
    <form:errors path="age" class="displayerros" />

   </div>
   <button type="submit" class="btn btn-primary" >Save</button>
   
  </form:form>
  
 </div>
</body>
</html>