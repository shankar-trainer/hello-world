<form>
    <h1>Insurance form</h1>
    <div>
        <label>enter id</label>
        <input name="id">
    </div>
    <div>
        <label>enter name</label>
        <input name="name">
    </div>
    <div>
        <button type="submit">send</button>
        <button type="reset">cancel</button>
    </div>
</form>

<%
    String id=request.getParameter("id");
    String name=request.getParameter("name");
    if(id!=null  && name!=null){
        out.println("insurance information");
        out.println("<br>id is "+id);
        out.println("<br>name is "+name);
    }

    %>