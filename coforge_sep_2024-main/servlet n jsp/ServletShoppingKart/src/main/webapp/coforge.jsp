<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.LocalTime" %>
 <div style="height:30pt;margin-top:20pt">
 <span style="float:left">   <%=LocalDate.now() %></span>
 <span style="float:right">  <%=LocalTime.now() %></span>
 </div>

  <div class="border border-primary  p-5 bg-light text-secondary w-75"
    style="text-align:center;margin-left:100pt;margin-top:10pt;border-radius:10pt"  >
    <h1>Coforge Technology</h1>
    <h2>Gr. Noida UP</h2>
    <h3>India</h3>
  </div>
</body>

</html>