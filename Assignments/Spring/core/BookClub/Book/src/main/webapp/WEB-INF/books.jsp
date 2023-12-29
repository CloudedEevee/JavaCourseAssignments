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
	<title>Homepage</title>
</head>
<body>

	<div class="bg">
		<div class="container">
			<!-- Navbar -->
			<div class="container">
				<div class="container m-1 p-1">
					<div class="container row">
						<div class="col-11">
							<h1>Hello, <c:out value="${thisUser.userName}"/></h1>
							<p class="m-0 p-1">Take a look at our library!</p>															
						</div>
						<div class="col-1 d-flex justify-content-end align-items-end">
							<p class="m-0 p-o"><a href="/user/logout" class="btn btn-primary px-2 py-1">Logout</a></p>											
						</div>
					</div>
				</div>
			</div>
			
			<!-- Body -->
			<div class="container">
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>Title</th>
							<th>Author</th>
							<th>Posted By</th>
						</tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="${allBooks.size() < 1 }">
								<tr>
									<td colspan="4">No Books yet. Add one?</td>
								</tr>
							</c:when>
							
							<c:when test="${allBooks.size() > 1 }">
								<c:forEach var="book" items="books">
									<tr>
										<td><c:out value="${book.id}"/></td>
										<td><c:out value="${book.title}"/></td>
										<td><c:out value="${book.author}"/></td>
										<td><c:out value="${book.user}"/></td>
									</tr>
								</c:forEach>
							</c:when>
						</c:choose>
					</tbody>
				</table>
			
			</div>
			
			<div class="d-flex justify-content-between">
				<a class="btn btn-primary" href="/books/new" role="button">Add a Book</a>			
			</div>	
		</div>	
	</div>

	<script type="text/javascript" src="/js/app.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
</body>
</html>