<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/main.css"/>
	<title>Fruit Store</title>
	</head>
<body>

	<div class="container">
		<h1>Fruit Store</h1>
		<table class="table table-striped">
			<thead>
				<tr class="bg-dark text-light">
					<th>Name</th>
					<th>Price</th>
				</tr>
			<c:forEach var="fruit" items="${fruits}">
				<tr>
					<td><c:out value="${fruit.name}"/></td>
					<td><c:out value="${fruit.price}"/></td>
				</tr>
			</c:forEach>
			</thead>
		</table>
	</div>
	



<script type="text/javascript" src="/js/app.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>