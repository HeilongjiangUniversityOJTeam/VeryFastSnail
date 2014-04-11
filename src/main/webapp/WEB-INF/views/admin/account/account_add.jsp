<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>Admin Account Add</title>
	</head>
	<body>
		<!-- menu -->
		<%@include file="../common/admin_menu.jsp" %>
		
		<table>
			<tr>
				<th>username</th>
				<th>password</th>
				<th>email</th>
				<th>permission</th>
				<th>role</th>
				<th>BUTTON</th>
			</tr>
			<tr>
				<td><input type="text" name="username" /></td>
				<td><input type="password" name="password" /></td>
				<td><input type="email" name="email" /></td>
				<td><input type="text" name="permission" /></td>
				<td><input type="text" name="role" /></td>
				<td><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</body>
</html>
	