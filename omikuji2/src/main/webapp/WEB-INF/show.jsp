<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" "%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><% session.getAttribute("number"); %></h1>
<h1><% session.getAttribute("city"); %></h1>
<h1><% session.getAttribute("person"); %></h1>
<h1><% session.getAttribute("pref"); %></h1>
<h1><% session.getAttribute("thing"); %></h1>
<h1><% session.getAttribute("des"); %></h1>
<a href="/omikuji">Go back</a>

</body>
</html>