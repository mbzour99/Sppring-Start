<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Here's iam a Omikuji ????!!!</h1>
<div class="box">
<pre>
In ${number} years ,you will
live in<% session.getAttribute("city"); %> with
<h1><% session.getAttribute("person"); %></h1>as your
roommet salling ourigames for a living ,The next time you see a <% session.getAttribute("pref"); %>
you will HAVE A GOOD LUCK,ALSO <% session.getAttribute("des"); %>
<% session.getAttribute("thing"); %>
</pre>
</div>

<a href="/omikuji">Go back</a>

</body>
</html>