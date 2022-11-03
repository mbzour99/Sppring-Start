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
<h1>All Books</h1>
<table class="table">
  <thead class="table-dark">
  <tr>
  <th>ID</th>
   <th>Title</th>
    <th>Language</th>
     <th># of Pages</th>
  </tr>
  <c:forEach var="book" items="${books}">
  <tr>
 <td><c:out  value="${book.getId()}"></c:out></td>
  <td><c:out  value="${book.getTitle()}"></c:out></td>
  <td><c:out  value="${book.getLanguage()}"></c:out></td>
  <td><c:out  value="${book.getNumberOfPages()}"></c:out></td>
  </tr>
  </c:forEach>
  
  </thead>
  <tbody></tbody>
</table>
</body>
</html>