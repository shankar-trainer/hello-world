<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Spring Boot MVC CRUD</title>
</head>
<body>
    <h2>Spring Boot JSR-303 Validation CRUD</h2>

    <!-- Search Form -->
    <form action="search" method="get">
        <input type="text" name="keyword" placeholder="Search by name/email" value="${keyword}" />
        <button type="submit">Search</button>
        <a href="/">Reset</a>
    </form>
    <br/>

    <!-- Add/Update Form -->
    <form:form action="add" modelAttribute="user" method="post">
        <h3>Add New User</h3>
        <label>Name:</label>
        <form:input path="name" />
        <form:errors path="name" style="color:red;" /><br/>

        <label>Email:</label>
        <form:input path="email" />
        <form:errors path="email" style="color:red;" /><br/>

        <button type="submit">Add User</button>
    </form:form>
    <br/>

    <!-- Data Table -->
    <h3>Users List</h3>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="u" items="${users}">
            <tr>
                <td>${u.id}</td>
                <td>${u.name}</td>
                <td>${u.email}</td>
                <td>
                    <a href="remove/${u.id}">Remove</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
