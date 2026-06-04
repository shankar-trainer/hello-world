<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Spring Boot Multi-Button Form</title>
    <style>
        .error { color: red; font-weight: bold; }
        .success { color: green; font-weight: bold; }
        .form-group { margin-bottom: 15px; }
    </style>
</head>
<body>

    <h2>User Management</h2>

    <c:if test="${not empty message}">
        <p class="success">${message}</p>
    </c:if>

    <form:form modelAttribute="userForm" action="${pageContext.request.contextPath}/user" method="post">
        
        <div class="form-group">
            <label>User ID (For Search Only):</label>
            <form:input path="id" />
        </div>

        <div class="form-group">
            <label>User Name (Required for Save):</label>
            <form:input path="name" />
            <form:errors path="name" cssClass="error" /> 
        </div>

        <div>
            <button type="submit" name="action" value="save">Save User</button>
            <button type="submit" name="action" value="search">Search by ID</button>
            <button type="submit" name="action" value="showAll">Show All</button>
        </div>
    </form:form>

</body>
</html>