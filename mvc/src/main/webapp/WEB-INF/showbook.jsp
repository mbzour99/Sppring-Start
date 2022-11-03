<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><%="${mybook.getTitle()}" %></h1>
<h2>Description <%="${mybook.getDescription()}" %></h2>
<h2>Language <%="${mybook.getLanguage()}" %>></h2>
<h2>Number of Pages <%="${mybook.getNumberOfPages()}" %>></h2>

</body>
</html>