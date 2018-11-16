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
<title>Welcome to A2j server</title>

<style type="text/css">
legend {
	text-align: center;
	font-size: 25px;
}

legend, input[type=text], [type=password], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 100%;
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

div.forms {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 40px;
	margin: 180PX 100PX 100PX 100Px
}

header {
	position: fixed;
	padding: 5px;
	top: 0;
	width: 100%;
	background-color: black;
	color: white;
	text-align: center;
	background-color: black;
}

footer {
	background: black;
	color: white;
	text-align: center;
	padding: 5px;
}
</style>
</head>
<body>
	<header>
		<h1>A2J website is with you to learn java</h1>
	</header>
	<h1>${passwordError}</h1>
	<div class="forms">
		<form action="/login.do" method="post">
			<fieldset>
				<legend>Login</legend>
				<input type="text" name="name" placeholder="Enter Your Name" /> <input
					type="password" name="password" placeholder="Enter Your Password" />
				<input type="submit" value="Login" />
			</fieldset>
		</form>
		<%=date%>
	</div>



	<footer> Copyright © a2j.com </footer>
</body>
</html>