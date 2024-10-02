<html>
<head>
<style>
.mystyle {
	border: solid blue;
	padding: 30px;
	width: 40%;
	margin-left: 300pt;
	margin-top: 40pt;
	height:50pt;
}

table{
 border:double blue;
 width:50%;
 color:blue;
 background:yellow;
 margin:100pt;
 padding:10pt;
}
tr{
border:solid red;
}
td{
border:solid;
}
</style>
</head>
<body>
<%@ page isELIgnored="false" %>
<div>
    <table>
     <tr>
         <td>Id is </td>
         <td>${customer.id}</td>
     </tr>
     <tr>
         <td>Name is </td>
         <td>${customer.name}</td>
     </tr>
     <tr>
         <td>Salary is </td>
         <td>${customer.salary}</td>
     </tr>
     <%
     com.coforge.model.Customer customer=(com.coforge.model.Customer)
             request.getAttribute("customer");
     %>
     <tr>
         <td>Gender is </td>
        <td>
        <%
            for(String s: customer.getGender())
             out.println(s);
          %>
        </td>
     </tr>

     <tr>
         <td>Hobbies are </td>
         <td>
                 <%
                     for(String s: customer.getHobby())
                      out.println(s+",");
                   %>
         </td>
     </tr>

     <tr>
         <td>Cities are </td>
         <td>
                 <%
                     for(String s: customer.getCities())
                      out.println(s+", ");
                   %>

         </td>
     </tr>


    </table>
</div>
</body>
</html>