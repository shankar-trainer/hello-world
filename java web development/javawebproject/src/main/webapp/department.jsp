<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="department">

<%@ page import="java.time.LocalTime" %>
<%@ page import="java.time.LocalDate" %>
Time is <%=LocalTime.now()%><br>
Date is <%=LocalDate.now()%>

    <div>
        <input name="id"  placeholder="enter id" >
    </div>

    <div>
        <input name="name"  placeholder="enter name" >
    </div>
    <div>
        <input type="submit">
        <input type="reset">
    </div>

</form>
</body>
</html>
