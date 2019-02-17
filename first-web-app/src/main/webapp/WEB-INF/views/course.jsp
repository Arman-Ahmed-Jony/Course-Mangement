<!-- we have to add the tag library from the address bellow -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	Date date = new Date();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="description" content="Free Web tutorials">
<meta name="keywords" content="HTML,CSS,XML,JavaScript">
<meta name="author" content="Hege Refsnes">
<!-- <meta http-equiv="refresh" content="5"> -->
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<title>Course Page</title>

<style type="text/css">
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #222222;
}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">A2J</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#">java</a></li>
				<li><a href="#">CSS 3</a></li>
				<li><a href="#">JavaScript</a></li>
			</ul>
		</div>
	</nav>


	<div class="container" style="margin-top: 50px">

		<h1>Hello ${name}</h1>
		<div>
			your course list are given bellow:<br>
			<div>
				<input class="form-control" id="myInput" type="text"
					placeholder="Search.."> <br>
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Course Name</th>
							<th>price</th>
							<th>Options</th>
						</tr>
					</thead>
					<tbody id="myTable">
						<c:forEach items="${courses}" var="course">
							<tr>
								<td>${course.name}</td>
								<td>${course.price}</td>
								<td><a
									href="deleteCourse?name=${course.name}&price=${course.price}"
									class="btn">Delete</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>

		<div><%=date%></div>
		<form action="\course" method="post">
			<input type="text" name="newTodo"> <input type="number"
				name="price"> <input type="submit">
		</form>
	</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	<script>
		$(document)
				.ready(
						function() {
							$("#myInput")
									.on(
											"keyup",
											function() {
												var value = $(this).val()
														.toLowerCase();
												$("#myTable tr")
														.filter(
																function() {
																	$(this)
																			.toggle(
																					$(
																							this)
																							.text()
																							.toLowerCase()
																							.indexOf(
																									value) > -1)
																});
											});
						});
	</script>
	<footer class="footer">
		<div style="color: #FFFFFF">Copyright © a2j.com</div>
	</footer>
</body>

</html>


<!-- valid user  -> welcome .jsp -->
<!-- invalid user -> ligin.jsp -->