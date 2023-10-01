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
	<title>Expenses | <c:out value="${expense.id}"/></title>
</head>
<body>

	<div class="bg">
		<div class="container">
			<h1><c:out value="${expense.name}"/></h1>
			<div class="container row" id="details">
				<div class="col">
					<div>
						<p class="label">Vendor</p>
						<p><c:out value="${expense.vendor}"/></p>
					</div>
					<div>
						<p class="label">Amount Spent</p>				
						<p><fmt:formatNumber value="${expense.amount}" type="currency"/></p>
					</div>
				</div>
				<div class="col">
					<p class="label">Description</p>
					<p><c:out value="${expense.description}"/></p>
				</div>
				<div class="row">
					<div class="d-flex justify-content-end p-0">
						<a href="/" style="color:DodgerBlue;text-decoration: underline;">Go Back</a>
					</div>				
				</div>
			</div>
		</div>
	</div>



	<script type="text/javascript" src="/js/app.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>