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
	<title>New Dojo</title>
</head>
<body>

	<div class="bg">
		<div class="container">
			<h1>New Dojo</h1>
				<form:form action="/dojos/dashboard" method="post" modelAttribute="dojo">
					<div class="form-group form-floating">
						<form:errors path="name"/>
						<form:input type="text" path="name" class="form-control"/>
						<form:label path="name" class="form-label mb-2 ps-4" >Name: </form:label>
					</div>
					<form:button type="submit" class="btn btn-primary mt-3">Create</form:button>
				</form:form>		
			
			<table class="table table-primary table-striped table-hover mt-4 py-4">
				<thead>
					<tr>
						<th>Current Dojo Locations</th>
						<th>Link</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="dojo" items="${allDojos}">
						<tr>
							<td><a href="/dojos/${dojo.id}"><c:out value="${dojo.name}"/></a></td>
							<td>
								<a href="/dojos/${dojo.id}">view |</a>
								<a href="/dojos/${dojo.id}/delete">delete</a>
							
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>


	<script type="text/javascript" src="/js/app.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>