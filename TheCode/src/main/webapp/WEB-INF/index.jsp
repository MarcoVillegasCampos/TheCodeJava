<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<div>
			<c:out value="${errorMessage}"></c:out>
		</div>
		<div>What is the code?</div>
		<form action="/validateCode">
		<input type="text" id="code" name="code">
		<button type="submit"> Try Code</button>
		
	
		
		</form>
	

	</body>
</html>