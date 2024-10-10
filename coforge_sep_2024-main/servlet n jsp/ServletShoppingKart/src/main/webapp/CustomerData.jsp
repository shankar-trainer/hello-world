<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<%@ page import="com.coforge.util.DatabaseConnection" %>
<%@ page import="java.sql.*" %>
<%!
 Connection connection;
 ResultSet rs;
 Statement st;
 %>
 <%
  connection=DatabaseConnection.myConnection();
  st=connection.createStatement();
  rs=st.executeQuery("select * from customer");
 %>
 <table class="table table-bordered table-stripped text-light bg-dark">
  <tr>
  <th>Id</th><th>Name</th><th>Salary</th>
  </tr>
  <%
   while(rs.next()){
  %>
  <tr>
    <td><%=rs.getInt(1)%></td>
    <td><%=rs.getString(2)%></td>
    <td><%=rs.getFloat(3)%></td>
  <%} %>

 </table>

</body>
</html>