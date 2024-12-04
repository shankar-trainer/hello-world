<div style="width:30%;height:110pt; padding:20pt;border:dotted;background:yellow;margin:50pt">
    <h1>Demate Account </h1>

    <jsp:useBean id="account" class="com.coforge.model.Account" scope="session"/>

        <div> Account id    :<jsp:getProperty property="id" name="account"/></div>
        <div> Account Name  :<jsp:getProperty property="name" name="account"/></div>
        <div> Account Balance   :<jsp:getProperty property="balance" name="account"/></div>
</div>