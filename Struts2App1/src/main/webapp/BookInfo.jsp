<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
@import url("CSS/file1.css");
</style>
<style type="text/css">
.style1 {
	width: 60%;
	background: yellow;
	tr
	{
	border
	:
	solid;
}

th {
	border: solid;
}

td {
	border: dotted;
}

table {
	border: double;
}
}
</style>

</head>
<body>
	<%@taglib uri="/struts-tags" prefix="s"%>
	<div class="style1">
		<h2>using s:iterator</h2>
		<table>
			<s:iterator value="list1">
				<tr>
					<td>isbn</td>
					<td><s:property value="isbn" /></td>
					<td>book name</td>
					<td><s:property value="bname" /></td>
					<td>author</td>
					<td><s:property value="author" /></td>
					<td>cost</td>
					<td><s:property value="cost" /></td>
				</tr>
			</s:iterator>
		</table>
	</div>
	<div class="style1">
		<hr>
		<h2>using s:subset</h2>
		<table>
			<s:subset start="1" source="list1" count="3">
				<s:iterator>

					<tr>
						<td>isbn</td>
						<td><s:property value="isbn" /></td>
						<td>book name</td>
						<td><s:property value="bname" /></td>
						<td>author</td>
						<td><s:property value="author" /></td>
						<td>cost</td>
						<td><s:property value="cost" /></td>
					</tr>
				</s:iterator>
			</s:subset>
		</table>
	</div>
	<div class="style1">
	<hr>
	<h2>using s:sort and s:bean</h2>
	<s:bean name="com.example.model.BookSorting" var="booksort"></s:bean>
	<h3>Sorting By BookName</h3>
	<s:sort comparator="booksort" source="list1">
		<table>
			<s:iterator>
				<tr>
					<td>isbn</td>
					<td><s:property value="isbn" /></td>
					<td>book name</td>
					<td><s:property value="bname" /></td>
					<td>author</td>
					<td><s:property value="author" /></td>
					<td>cost</td>
					<td><s:property value="cost" /></td>
				</tr>
			</s:iterator>
		</table>
	</s:sort>
	</div>
<h2>using s:bean s:param</h2>
	<s:bean name="com.example.model.Book" var="book">
	<s:param name="isbn" value="8778"></s:param>
	<s:param name="bname" value="let us c"></s:param>
	<s:param name="author" value="yashwant kanitkar"></s:param>
	<s:param name="cost" value="877"></s:param>
	</s:bean>
     
    <ol>
    <li>ISBN  is <s:property value="#book.isbn"/>
    <li>Book  is <s:property value="#book.bname" escapeHtml="true" />
    <li>Author  is <s:property value="#book.author"/>
    <li>Cost  is <s:property value="#book.cost"/>
    
    </ol> 
   
</body>
</html>