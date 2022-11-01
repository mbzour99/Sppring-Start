<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="/css/c.css">
        
</head>
<body>
<h1>Hi every one!</h1>
<% Integer count = (Integer) session.getAttribute("counter"); %>
	<p> you have visited <a href="/your_server/counter">http://your_server/counter</a> <%= count %> times </p>
	<a href="/your_server">Test another Visit?</a>
</body>
</html>