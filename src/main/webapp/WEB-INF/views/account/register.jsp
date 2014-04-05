<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Register</title>
	</head>
	<body>
		<form action="/register" method="POST">
			Username:<input type="text" name="username" />
			Password:<input type="password" name="password" />
			Email:<input type="text" name="email" />
			<input type="submit" value="Register" /> 
		</form>
	</body>
</html>