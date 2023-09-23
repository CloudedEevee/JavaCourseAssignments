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
	<title>Omikuji | Show</title>
	</head>
<body>

	<div class="container my-sm-4">
		<h1>Here's your Omikuji!</h1>
		<div class="container">
			<p> In <c:out value="${num}"/> years, you will live in <c:out value="${city}"/> with <c:out value="${person}"/> as your roommate, selling <c:out value="${hobby}"/> for a living. The next time you see a <c:out value="${livingThing}"/>, you will have good luck. Also, <c:out value="${someNice}"/></p>
			<a href="/omikuji">Go Back</a>
		</div>
	</div>



<script type="text/javascript" src="/js/app.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>
