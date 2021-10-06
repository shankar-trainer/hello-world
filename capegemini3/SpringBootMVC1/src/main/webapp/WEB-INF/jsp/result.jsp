${result} <br>

<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<c:forEach items="${empresult}" var="emp">
   
   id ${emp.id}<br>
   name ${emp.name}<br>
   salary ${emp.salary}<br>
   
   <br>
   
   
</c:forEach>
