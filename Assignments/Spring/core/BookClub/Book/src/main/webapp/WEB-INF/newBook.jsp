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
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
	<title>Add a Book</title>
</head>
<body>

		<div class="bg">
		<div class="container">
			<h1>Add a Book</h1>
			<form:form action="/books/new/process" modelAttribute="newBook" class="p-4">
				<div class="row g-1">
					<div class="col">
						<div class="form-group form-floating">
							<form:input path="title" type="text" class="form-control"/>
							<form:label path="title" class="form-label mb-2 ps-4">Title</form:label>
							<form:errors path="title" class="mx-3 errors"/>
						</div>					
					</div>
					<div class="col">
						<div class="form-group form-floating">
							<form:input path="author" type="text" class="form-control"/>
							<form:label path="author" class="form-label mb-2 ps-4">Author</form:label>
							<form:errors path="author" class="mx-3 errors"/>
						</div>
					</div>
				</div>
				<form:input path="user" type="hidden" value="${thisUser.id}"/>
				<div class="d-flex justify-content-end">
					<form:button type="submit" class="btn btn-primary mt-3">Add Book</form:button>
				</div>
				</div>
			</form:form>
		</div>
	
	
	
	</div>

	



	<script type="text/javascript" src="/js/app.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
</body>
</html>