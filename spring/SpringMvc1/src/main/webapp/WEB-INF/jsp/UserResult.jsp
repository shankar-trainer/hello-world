<html>
<head>
<style>
  .style1{
    border:solid blue;
    padding:30px;
    width:30%;
    margin-left:300pt;
    margin-top:40pt;
  }
  </style>
  </head>
  <%@ page isELIgnored="false" %>
  <body>
    <div class="style1">
      <div>Id is ${user.id} </div>
      <div>Name is ${user.name} </div>
      <div>Salary is ${user.salary} </div>
    </div>
  </body>
  </html>