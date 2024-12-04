<div style="width:30%;height:110pt; padding:20pt;border:dotted;background:yellow;margin:50pt">
    <h1>Saving Account </h1>
    <%@ page import="com.coforge.model.Account" %>
    <%
    Account account=(Account) session.getAttribute("account");
    %>
        <div> Account id    :<%=account.getId() %></div>
        <div> Account Name  :<%=account.getName() %></div>
        <div> Account Balance   :<%=account.getBalance() %></div>
</div>