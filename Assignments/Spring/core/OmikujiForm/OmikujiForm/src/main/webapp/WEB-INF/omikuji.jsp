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
	<title>Omikuji Form</title>
	</head>
<body>

	<div class="container my-sm-4">
		<h1>Send an Omikuji!!</h1>
		<form action="/omikuji/submit" method="POST">
			<div class="form-group">
				<label>Pick any number from 5 to 25</label>
				<input type="number" name="num">
			</div>
			<div class="form-group">
				<label>Enter the name of any city</label>
				<input type="text" name="city">
			</div>
			<div class="form-group">
				<label>Enter the name of any person</label>
				<input type="text" name="person">
			</div>
			<div class="form-group">
				<label>Enter a professional endeavor or hobby</label>
				<input type="text" name="hobby">
			</div>
			
			<div class="form-group">
				<label>Enter any type of living thing</label>
				<input type="text" name="livingThing">
			</div>
			
			<div class="form-group">
				<label>Say something nice to someone</label>
				<textarea rows="10" cols="30" name="someNice"></textarea>
			</div>
			<button type="submit">Submit</button>
		</form>
		
	</div>



<script type="text/javascript" src="/js/app.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>