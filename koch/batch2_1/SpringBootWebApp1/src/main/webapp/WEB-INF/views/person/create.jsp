<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link type="text/css" href="/css/bootstrap.css" rel="stylesheet" />
</head>
<body>
<h2>Create new Person</h2>
<div class="pull-right">
    <a href="?lang=en" class="btn">English</a>
    <a href="?lang=fr" class="btn">French</a>
    <a href="?lang=hi_IN" class="btn">Hindi</a>

</div>
<form action="/person/save" method="post">
    <table class="table table-bordered">
        <tbody>
            <tr><th><spring:message code="form.label.name"/></th><td><input type="text" name="name" required="required"></td></tr>
            <tr><th><spring:message code="form.label.email"/></th><td><input type="email" name="email" required="required"></td></tr>
            <tr><th><spring:message code="form.label.password"/></th><td><input type="password" name="password" required="required"></td></tr>
            <tr><th><spring:message code="form.label.mobile"/></th><td><input type="number" name="mobile" required="required"></td></tr>
            <tr><td colspan="2"><input type="submit" value="Add Person" class="btn btn-success"></tr>
        </tbody>
    </table>
</form>
<a href="/person/index" class="btn btn-success">Back</a>

<script type="application/javascript" src="js/jquery.js"></script>
<script type="application/javascript" src="js/bootstrap.js"></script>


</body>
</html>