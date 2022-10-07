<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="/struts-tags" prefix="s"%>

	<div class="style1">
		<s:iterator begin="1" end="20" var="a" status="stat" step="3">
			<br>
			<s:property value="#stat.index" />
			<s:property value="top" />
			<s:property value="a" />
		</s:iterator>
	</div>

	<h3>Generator</h3>

	<s:generator separator="," val="%{'jan,feb,march,april,may'}" count="3"
		var="months">
		<s:iterator>
			<s:property />
		</s:iterator>

	</s:generator>

	<hr>

	<h2>SubSet</h2>
	<s:subset source="%{months}" count="2">
		<s:iterator>
			<s:property />
		</s:iterator>

	</s:subset>

	<s:include value="hello.jsp"></s:include>

	<h2>s:set</h2>

	<s:bean name="com.example.model.Student" var="st">
		<s:param name="roll" value="10001"/>
		<s:param name="name" value="geetha grover"/>
		<s:param name="marks" value="67.5"/>
	</s:bean>

	<s:set var="myroll" value="#st.roll" />
	roll is
	<s:property value="myroll" />

	<s:set var="myname" value="#st.name" />
	<br>name is
	<s:property value="myname" />

	<s:set var="mymarks" value="#st.marks" />
	<br>Marks is
	<s:property value="mymarks" />



</body>
</html>