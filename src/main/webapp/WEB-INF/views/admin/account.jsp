<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>Admin Account</title>
	</head>
	<body>
		
		<a href = "/admin/account"><li>Account Manager</li></a>
		<br>
		<a href= "/admin/contest"><li>Contest Manager</li></a>
		<br>
		<a href = "/admin/problem"><li>Problem Manager</li></a>
		<br>
		<hr>
		<!-- add account link -->
		<a href = "/admin/account/add">Add Account</a>
		
		<!-- show all account for update or delete account -->
		<table>
			<tr>
				<th>id</th>
				<th>username</th>
				<th>password</th>
				<th>email</th>
				<th>permission</th>
				<th>role</th>
				<th>createTime</th>
				<th>lastVisitTime</th>
			</tr>
			<c:forEach items="${accountList}" var="result">
			<tr>
				<td>
					${result.id}
				</td>
				<td>
					${result.username }
				</td>
				<td>
					${result.password }
				</td>
				<td>
					${result.email }
				</td>
				<td>
					${result.permission }
				</td>
				<td>
					${result.role }
				</td>
				<td>
					${result.createTime }
				</td>
				<td>
					${result.lastVisitTime }
				</td>
			</tr>
			</c:forEach>
		</table>
	</body>

</html>
