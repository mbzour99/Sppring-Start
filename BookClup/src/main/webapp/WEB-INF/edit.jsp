<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit page</title>
</head>
<body>
<form:form action="/books/${mbook.id}/edit" method="post" modelAttribute="editbook">
<input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Title</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="authorName">Author</form:label>
        <form:errors path="authorName"/>
        <form:textarea path="authorName"/>
    </p>

    
    <p>
        <form:label path="thought">My Thoughts</form:label>
        <form:errors path="thought"/>     
        <form:input  path="thought"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>  
</body>
</html>