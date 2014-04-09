<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Contest-Problem</title>
</head>
<body>
	<h2>${problem.title }</h2>
	<br>
	<h3>Description</h3>
	<br>
	${problem.description }
	<br>
	<h3>InputDescription</h3>
	<br>
	${problem.inputDescription }
	<br>
	<h3>outputDescription</h3>
	<br>
	${problem.outputDescription }
	<br>
	<h3>inputSample</h3>
	<br>
	${problem.inputSample }
	<br>
	<h3>outputSample</h3>
	<br>
	${problem.outputSample }
	<br>
	
</body>

</html>