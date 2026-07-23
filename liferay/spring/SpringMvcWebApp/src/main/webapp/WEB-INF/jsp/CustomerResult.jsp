<%@page import="java.util.Arrays"%>
<%@ page isELIgnored="false" %>
<style>
 .myform{
    width:30%;
    border:solid;
    margin-left:300pt;
    margin-top:100pt;
    padding: 20pt;
  }
</style>
<div class="myform">
<h1>Customer Data </h1>
<div>
Id is ${customer.id}
</div>

<div>
Name is ${customer.name}
</div>

<div>
Salary is ${customer.salary}
</div>

<%@page import="coforge.com.model.Customer"%>
<div>
You  are  <% 
Customer customer= (Customer) request.getAttribute("customer");
for( String c:customer.getGender())
	  out.println(c+", ");
%>
</div>

<div>
Cities are  
 <%  

  for( String c:customer.getCities())
	  out.println(c+", ");
%>
</div>

<div>
Your hobbies are 
<% 
for( String c:customer.getHobbies())
	  out.println(c+", ");
%>
</div>
<div>
My Hobbies are 
<%=Arrays.toString(customer.getHobbies()) %>

</div>


</div>

