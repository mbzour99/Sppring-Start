<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.Date"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="/css/fruit.css">
        <script type="text/javascript" src="java/javaScript.js"></script>
</head>
<body>
<h1>Fruit Store</h1>
<table class="table">
  <thead class="table-dark">
  <tbody>
  <tr>
  <th>Name</th>
  <th>Price</th>
  </tr>
      <c:forEach var="frute" items="${fruits}">
      <tr>
      <td><c:out value="${frute.getName()}"></c:out></td>
      <td><c:out value="${frute.getPrice()}"></c:out></td>
      </tr>
    </c:forEach>
   
  </tbody>
   </thead>
</table>
</body>
</html>