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
<h1>details</h1>
<h2><a href="/laguages">Go back</a></h2>
<p><c:out value="${lang.name}"></c:out></p>
<p> <c:out value="${lang.creator }"></c:out></p>
<p>Vendor <c:out value="${lang.version }"></c:out></p>


 <form action="/languages/${la.id}" method="post">
    <input type="hidden" name="_method" value="delete">
     <a href="/languages/${la.id}">delete</a>
</form>

 <a href="/languages/edit/${la.id}">edit</a>
</body>

</html>