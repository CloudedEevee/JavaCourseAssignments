<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/css/style.css"/>
	<title>Dojo Page</title>
</head>
<body>

	<div class="bg">
		<div class="container">
			<h1>${dojo.name} Location Ninjas</h1>
			<table class="table table-light table-striped table-hover">
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Age</th>
					</tr>
				</thead>
				<tbody>
					<c:choose>
						<c:when test="${dojo.ninjas.size() < 1 }">
							<tr>
								<td colspan="3">No Ninjas yet. Add one below:</td>
							</tr>
						</c:when>
						
						<c:otherwise> 
							<c:forEach var="ninja" items="${dojo.ninjas}">
								<tr>
									<td>${ninja.firstName}</td>
									<td>${ninja.lastName}</td>
									<td>${ninja.age}</td>
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
			<div class="d-flex justify-content-between">
				<a class="btn btn-primary" href="/dojos/${dojoId}/ninjas/new" role="button">Add Ninja to this Location</a>
				<a class="btn btn-primary" href="/dojos/dashboard" role="button">Go Back</a>			
			</div>
			
		</div>
		
		
		
	</div>



	<script type="text/javascript" src="/js/app.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>