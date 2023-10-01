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
	<title>Expenses | Edit</title>
</head>
<body>

	<div class="bg">
		<div class="container p-4">
				<h2>Edit Expense</h2>
				<form:form action="/edit/${expense.id}" method="post" modelAttribute="expense">
					<div class="row">
						<div class="col mr-4">
							<div class="row">
								<form:label path="name" class="form-label mb-0 ps-1">Name of Expense: </form:label>
								<form:errors path="name"/>
								<form:input path="name" class="form-control"/>						
							</div>
							<div class="row mt-2">
								<form:label path="vendor" class="form-label mb-0 ps-1">Vendor: </form:label>
								<form:errors path="vendor"/>
								<form:input path="vendor" class="form-control"/>					
							</div>
							<div class="row mt-2">
								<form:label path="amount" class="form-label mb-0 ps-1">Amount Spent: </form:label>
								<form:errors path="amount"/>
								<form:input type="number" path="amount" class="form-control"/>									
							</div>
						</div>
						<div class="col">
								<form:label path="description" class="form-label mb-0 ps-1">Description: </form:label>
								<form:errors path="description"/>
								<form:textarea path="description" class="form-control" style="height: 88%"/>
						</div>
					</div>
					<div class="row">
						<div class="d-flex justify-content-start p-0">
							<form:button type="submit" class="btn btn-primary mt-3 ">Edit Expense</form:button>								
						</div>				
					</div>
				</form:form>
				<div class="row">
					<div class="d-flex justify-content-end p-0">
						<a href="/" style="color:DodgerBlue;text-decoration: underline;">Go Back</a>
					</div>				
				</div>
			</div>
	
	
	</div>



	<script type="text/javascript" src="/js/app.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>