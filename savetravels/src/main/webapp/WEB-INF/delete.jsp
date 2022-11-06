<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
<body>
<h1>Experts Detailes</h1>
<h2><a href="/new">Go back</a></h2>
<p>Experts Name <c:out value="${travel.expense}"></c:out></p>
<p>Experts Description <c:out value="${travel.description }"></c:out></p>
<p>Vendor <c:out value="${travel.vendor }"></c:out></p>
<p>Amount<c:out value="${travel.amount }"></c:out></p>

</body>



</html>