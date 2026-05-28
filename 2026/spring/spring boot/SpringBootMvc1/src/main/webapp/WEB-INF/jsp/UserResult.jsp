<%@page import="java.time.LocalDate"%>
<div style="border:solid;margin-left:200pt;background-color:pink;padding:20pt;width:30%;">

    <div>
      id is  ${user.id}
    </div>

    <div>
      name is  ${user.name}
    </div>

    <div>
      salary is  ${user.salary}
    </div>
    
    date is <%=LocalDate.now() %>

</div>