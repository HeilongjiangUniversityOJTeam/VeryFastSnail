<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Contest</title>
</head>
<body>
	<table>
		<tr>
			<th>id</th>
			<th>title</th>
			<th>start-time</th>
			<th>end-time</th>
		</tr>
		<c:forEach items="${contestList}" var="result">
			<tr>
		     	<td>
		     		<a href="/contest/${result.id }">${result.id }</a>
				</td>
				<td>
					<a href="/contest/${result.id }">${result.title }</a>
				</td>
				<td>
					<a href="/contest/${result.id }">${result.startTime }</a>
				</td>
				<td>
					<a href="/contest/${result.id }">${result.endTime }</a>
				</td>
	     	</tr>
     	</c:forEach>
	</table>
</body>

</html>