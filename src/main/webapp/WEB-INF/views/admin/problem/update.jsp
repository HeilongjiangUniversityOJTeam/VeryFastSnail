<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>Admin Problem Update</title>
	</head>
	<body>
		<!-- menu -->
		<%@include file="../common/admin_menu.jsp" %>
		
		<form action="/admin/problem/update" method="post">
			contestId<input type="hidden" name="contestId" value="${problem.contestId }" />
			problemId<input type="hidden" name="problemId" value="${problem.problemId }" />
			
			description<input type="text" name="description" value="${problem.description }" />
			inputDescription<input type="textarea" name="inputDescription" value="${problem.inputDescription }" />
			outputDescription<input type="textarea" name="outputDescription" value="${problem.outputDescription }" />
			inputSample<input type="textarea" name="inputSample" value="${problem.inputSample }" />
			outputSample<input type="textarea" name="outputSample" value="${problem.outputSample }" />
			
			<input type="submit" value="submit" />
		</form>