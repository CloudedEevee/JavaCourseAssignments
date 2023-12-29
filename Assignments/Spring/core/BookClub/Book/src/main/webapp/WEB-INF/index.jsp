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
	<title>Login & Registration</title>
</head>
<body>

	<div class="bg">
		<div class="container p-4">
			<h1>Welcome!</h1>
			<p>Join our growing community.</p>
		</div>
		<div class="container">
			<div class="row gy-2">
				<div class="col">
					<div class="container">
						<h2>Register</h2>
						<form:form action="/user/register" modelAttribute="newUser">
							<div class="form-group form-floating my-2">
								<form:input path="userName" type="text" class="form-control border border-primary-subtle"/>
								<form:label path="userName" class="form-label mb-2 ps-4">Username</form:label>
								<form:errors path="userName" class="mx-0 errors"/>
							</div>
							<div class="form-group form-floating my-2">
								<form:input path="email" type="email" class="form-control border border-primary-subtle"/>
								<form:label path="email" class="form-label mb-2 ps-4">Email</form:label>
								<form:errors path="email" class="mx-0 errors"/>
							</div>
							<div class="form-group form-floating my-2">
								<form:input path="password" type="password" class="form-control border border-primary-subtle"/>
								<form:label path="password" class="form-label mb-2 ps-4">Password</form:label>
								<form:errors path="password" class="mx-0 errors"/>
							</div>
							<div class="form-group form-floating my-2">
								<form:input path="confirm" type="password" class="form-control border border-primary-subtle"/>
								<form:label path="confirm" class="form-label mb-2 ps-4">Confirm Password</form:label>
								<form:errors path="confirm" class="mx-0 errors"/>
							</div>
							<form:button type="submit" class="btn btn-primary my-2">Register Me</form:button>
						</form:form>
					</div>
				</div>
				<div class="col">
					<div class="container">
						<h2>Login</h2>
						<form:form action="/user/login" modelAttribute="newLogin">
							<div class="form-group form-floating my-2">
								<form:input path="email" type="email" class="form-control border border-primary-subtle"/>
								<form:label path="email" class="form-label mb-2 ps-4">Email</form:label>
								<form:errors path="email" class="mx-0 errors"/>
							</div>
							<div class="form-group form-floating my-2">
								<form:input path="password" type="password" class="form-control border border-primary-subtle"/>
								<form:label path="password" class="form-label mb-2 ps-4">Password</form:label>
								<form:errors path="password" class="mx-0 errors"/>
							</div>
							<form:button type="submit" class="btn btn-primary my-2">Log In</form:button>
						</form:form>
					</div>
				</div>
			
			</div>
			
			</div>
	
	
	
	</div>



	<script type="text/javascript" src="/js/app.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
</body>
</html>