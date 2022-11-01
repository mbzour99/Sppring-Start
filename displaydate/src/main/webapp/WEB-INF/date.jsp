<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.Date"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="/css/dateandtime.css">
        <script type="text/javascript" src="javaScript/java.js"></script>
</head>
<body>
<h1><c:out value="${name}"/> <h1>
<ul class="list-group list-group-light">
  <li class="list-group-item px-3 border-0 active" aria-current="true">
 <h1><c:out value="${dateString}"></c:out></h1>
 
</ul>

</body>
</html>