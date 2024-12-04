
<%@ page isErrorPage="true" %>
<div style='border:solid 10pt blue; width:50%;height:150pt;background:yellow;color:red;padding:20pt;margin-left:200pt'>
<h2>Error Page </h2>
<div>Error is <%=exception.getMessage()%> </div>
</div>