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
	<title>New Ninja</title>
</head>
<body>

	<div class="bg">
		<div class="container">
			<h1>New Ninja</h1>
			<form:form action="/dojos/${dojoId}/ninjas/new/process" modelAttribute="ninja" class="p-4">
				<div class="row g-1">
					<div class="col">
						<div class="form-group form-floating">
							<form:input path="firstName" type="text" class="form-control"/>
							<form:label path="firstName" class="form-label mb-2 ps-4">First Name</form:label>
							<form:errors path="firstName" class="mx-3 errors"/>
						</div>					
					</div>
					<div class="col">
						<div class="form-group form-floating">
							<form:input path="lastName" type="text" class="form-control"/>
							<form:label path="lastName" class="form-label mb-2 ps-4">Last Name</form:label>
							<form:errors path="lastName" class="mx-3 errors"/>
						</div>
					</div>
				</div>
				<div class="row my-3">
					<div class="col-8">
						<div class="form-group form-floating">
							<form:select path="dojo" class="form-select">
								<c:forEach var="dojo" items="${allDojos}">
									<option value="${dojo.id}">${dojo.name}</option>
								</c:forEach>
							</form:select>
							<form:label path="dojo" class="form-label mb-2 ps-4" >Dojo</form:label>
							<form:errors path="dojo" class="mx-3 errors"/>
						</div>
					</div>
					<div class="col-4">
						<div class="form-group form-floating">
							<form:input path="age" class="form-control" type="number"/>
							<form:label path="age" class="form-label mb-2 ps-4">Age</form:label>
							<div class="container">
								<form:errors path="age" class="errors"/>							
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-9"></div>
					<div class="col-3">
						<form:button type="submit" class="btn btn-primary mt-3">Assign Ninja</form:button>
					</div>
				</div>
			</form:form>
		</div>
	
	
	
	</div>



	<script type="text/javascript" src="/js/app.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>