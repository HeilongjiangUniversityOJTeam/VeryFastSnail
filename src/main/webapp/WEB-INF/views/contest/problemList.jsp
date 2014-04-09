<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Contest-ProblemList</title>
</head>
<body>
	<table>
		<tr>
			<th>problemId</th>
			<th>title</th>
		</tr>
		<c:forEach items="${problemList}" var="result">
			<tr>
		     	<td>
		     		<a href="/contest/${result.contestId }/${result.problemId}">${result.id }</a>
				</td>
				<td>
					<a href="/contest/${result.contestId }/${result.problemId}">${result.title }</a>
				</td>
	     	</tr>
     	</c:forEach>
	</table>
</body>

</html>