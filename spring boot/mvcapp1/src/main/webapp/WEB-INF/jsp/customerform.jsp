<style>
 form{
    border:solid;
     margin-left:200pt;
     margin-top:40pt;
     padding:20pt;
     background-color:pink;
     width:40%;
 }
 label{
  float:left;
  width:110pt;
 }
</style>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form action="customerAction" method="post" modelAttribute="customer">
    <div>
        <form:label for="id" path="id">Enter Id</form:label>
        <form:input path="id"/>
        <form:errors path="id" cssErrorClass="error" style="color:red"/>
    </div>

    <div>
        <form:label for="name" path="name">Enter Name</form:label>
        <form:input path="name"/>
        <form:errors path="name" cssErrorClass="error" style="color:red"/>
    </div>

    <div>
        <form:label for="salary" path="salary">Enter Salary</form:label>
        <form:input path="salary"/>
        <form:errors path="salary" cssErrorClass="error" style="color:red"/>
    </div>

   <div>
    <button type="submit">send</button>
    <button type="reset">cancel</button>
   </div>

</form:form>
