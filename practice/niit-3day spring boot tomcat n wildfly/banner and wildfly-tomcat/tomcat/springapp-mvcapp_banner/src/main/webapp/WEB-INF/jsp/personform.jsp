<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.label{
  float:left;
  width:100pt
}
.input{
  width:100pt
}
.form{
 border:solid;
 width:40%;
 padding: 20pt;
 margin-left:300pt;
 margin-top:50pt; 
}
.error{
 color:red;
}
</style>
</head>
<body>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

    <form:form action="personAction" modelAttribute="person" cssClass="form">
    <h2>Person Form</h2>
    <div >
       <form:label path="id" cssClass="label">Enter  Id</form:label>
        <form:input name="id" path="id" cssClass="input"/>
        <form:errors path="id" cssClass="error"></form:errors>
     </div>
    <div>
       <form:label path="name" cssClass="label">Enter  Name</form:label>
        <form:input name="name" path="name"  cssClass="input"/>
        <form:errors path="name" cssClass="error" ></form:errors>
     </div>
    <div>
       <form:label path="age" cssClass="label">Enter  Age</form:label>
        <form:input name="age" type="number" path="age"  cssClass="input"/>
        <form:errors path="age" cssClass="error" ></form:errors>
     </div>
     <div>
       <input type="submit">
       <input type="reset">
     </div>
    </form:form>
</body>
</html>