<form>
Enter Name <input name="name">
<br>
<input type="submit">

</form>
<br>

<%@taglib  uri="changetoupper" prefix="c" %>
Ur name is <c:upper name="${param.name}"></c:upper>