<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
     
  <title>The list of persons</title>

  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
</head>


<body>


<jsp:include page="header_menu.jsp" />

  

 <div class="container"  style="margin-left: 5pt">
  <h2>The list of the Persons</h2>
  <table class="table table-striped" >
   <thead>
    <th scope="row">Name</th>
    <th scope="row">Email</th>
    <th scope="row">Age</th>
    <th scope="row">Update</th>
    <th scope="row">Delete</th>
   </thead>
   <tbody>
    <c:forEach items="${personList }" var="person" >
     <tr>
      <td>${person.name }</td>
      <td>${person.email }</td>
      <td>${person.age }</td>
      <td>
       <spring:url value="/demo/mvcupdateperson/${person.id }" var="updateURL" />
       <a class="btn btn- btn-warning" href="${updateURL }" role="button" >Update</a>
      </td>
      <td>
       <spring:url value="/demo/mvcdeleteperson/${person.id }" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL }" role="button" >Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <spring:url value="/demo/mvccreateperson/" var="addURL" />
  <a class="btn btn-primary" href="${addURL }" role="button" >Add New Person</a>
 </div>

</body>
</html>