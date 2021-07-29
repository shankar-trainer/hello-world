<%@ taglib prefix="s" uri="/struts-tags"%>
<form action="<%=request.getContextPath()%>/login.action" method="POST">  
UserName<input type="text" name="user.username" value="admin"><br>  
Password<input type="text" name="user.password" value="jadyer"><br>  
Address <input type="text" name="user.address.addr" value="111"><br>  
    <input type="submit" >  
    <s:debug/>
</form> 