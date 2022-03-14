<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<h1>Custom Login Page</h1>

	<form action="j_spring_security_check" method="post">
		Enter username: <input type="text" name="j_username" /> Enter
		password: <input type="password" name="j_password" /> 
		<input type="submit" value="Login" /> 
		<input type="reset" name="reset" />
	</form>

</body>
</html>