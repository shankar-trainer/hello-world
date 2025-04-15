<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1>${error}</h1>
	<div>
		<h2>Login</h2>
		<sf:form method="POST" modelAttribute="loginInfo" action="/SpringMvcTest/onLogin">
			<fieldset>
				<table cellspacing="0">
					<tr>
						<th><label for="userId">User Id:</label></th>
						<td><sf:input path="userId" size="15" id="userId" /></td>
					</tr>
					<tr>
						<th><label for="user_password">Password:</label></th>
						<td><sf:password path="password" size="10"
								showPassword="true" id="user_password" />
						</td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Submit" /></td>
					</tr>
				</table>
			</fieldset>
		</sf:form>
	</div>
</body>
</html>