<%@ taglib prefix="s" uri="/struts-tags" %>
<div id="global">
    <h3>Add Product</h3>
    <s:form action="Product_add">
        <s:textfield name="name" label="Product Name"/>
        <s:textfield name="description" label="Description"/>
        <s:textfield name="price" label="Price"/>
        <s:submit/>
    </s:form>
</div>