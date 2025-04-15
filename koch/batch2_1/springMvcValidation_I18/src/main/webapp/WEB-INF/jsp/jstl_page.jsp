<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<c:forEach var="item" items="1,2,3,4,5,6">
 ${item}
  <p>
</c:forEach>

<h1>Employee List </h1>
<c:forEach var="e" items="${emp}">
 <p> ${e.id }  -- ${e.name} -- ${e.salary}
</c:forEach>
<h1>Employee List salary < 60000 </h1>
<c:forEach var="e" items="${emp}">
<c:if test="${e.salary<60000}">
 <p> ${e.id }  -- ${e.name} -- ${e.salary}
 </p>
 </c:if>
</c:forEach>


<%@page import="com.example.model.Employee"%>


<h2>Employee List</h2>
   <% 
    Employee  emp[]= (Employee[]) request.getAttribute("emp");
      for(Employee e:emp){
   %>
       <p><%=e.getId() %>--<%=e.getName()%>-- <%=e.getSalary() %> 
   <%}
      %>


</body>
</html>