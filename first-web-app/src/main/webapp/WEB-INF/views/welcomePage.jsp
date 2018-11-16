<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>another page</title>
</head>
<body>
<h1><b>this is another page!!!!</b></h1>
<h1>welcome ${name}</h1>
<h1>your pass is ${password}</h1>

<%Date date=new Date();
//System.out.println(date);
%>
<div>
here is todo list: <p>${todos}</p>
</div>
<div>Date is <%=date %></div>

</body>
</html>


<!-- valid user  -> welcome .jsp -->
<!-- invalid user -> ligin.jsp -->