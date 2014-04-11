<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>Admin Problem</title>
	</head>
	<body>
		<!-- menu -->
		<%@include file="../common/admin_menu.jsp" %>
		
		<!-- add problem link -->
		<a href = "/admin/problem/add">Add Problem</a>
		
		<!-- show all Problem for update or delete problem -->
		<table>
			<tr>
				<th>contestId</th>
				<th>problemId</th>
				<th>title</th>
				<!-- checkbox -->
				<th>#</th>
				
				<th>Delete</th>
				<th>Stop</th>
				<th>Update</th>
			</tr>
			<c:forEach items="${problemList}" var="result">
			<tr>
				<td>
					${result.contestId }
				</td>
				<td>
					${result.problemId }
				</td>
				<td>
					${result.title }
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
				<td>
					<a href="/admin/problem/update/${result.contestId }/${result.problemId }">update</a>
				</td>
			</tr>
			</c:forEach>
		</table>
		
		<br>
		<!-- batchDelete & batchStop Problem -->
		<input type="submit" value="batchDelete" />
		<input type="submit" value="batchStop" />
		
	</body>

</html>
