<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>Admin Account</title>
	</head>
	<body>
		<!-- menu -->
		<%@include file="../common/menu.jsp" %>
		
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
				
				<!-- checkbox -->
				<th>#</th>
				
				<th>Delete</th>
				<th>Stop</th>
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
				<td>
					<input type="checkbox" />
				</td>
				<td>
					<input type="submit" value="delete" />
				</td>
				<td>
					<input type="submit" value="stop" />
				</td>
			</tr>
			</c:forEach>
		</table>
		
		<br>
		<!-- batchDelete & batchStop Account -->
		<input type="submit" value="batchDelete" />
		<input type="submit" value="batchStop" />
		
	</body>

</html>
