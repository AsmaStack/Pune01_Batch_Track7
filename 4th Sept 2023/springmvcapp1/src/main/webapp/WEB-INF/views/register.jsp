<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register Form</h1>

	<form method="post" action="/register">
		<label for="username">Username:</label> <input type="text"
			id="username" name="username" required /><br />
		<br /> <label for="password">Password:</label> <input type="password"
			id="password" name="password" required /><br />
		<br /> <input type="submit" value="Register" />
	</form>
	<p>${message}</p>
</body>
</html>