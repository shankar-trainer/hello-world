<%-- <%@page import="coforge.com.model.User"%>
<% 
User user=(User)  request.getAttribute("user");
%>
<div>
	Id is
	<%=user.getId() %>
</div>

<div>
	Name is
	<%=user.getName() %>
</div> --%>

<%@ page isELIgnored="false" %>
<hr>
<h2>Using el </h2>

<div>Id is ${user.id} </div>
<div>Name is ${user.name} </div>