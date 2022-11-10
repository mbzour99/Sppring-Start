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
<title>Success Page</title>
</head>
<body>

<p><a href="/logout/">Logout</a></p>
<p><a href="/books/new">Add a new book</a></p>
<table class="table">
  <thead class="table-dark">
  <tr>
  <th>ID</th>
   <th>Title</th>
    <th>Author Name</th>
    <th>Psoted By</th>
    <th>Action</th>
  </tr>
 <c:forEach var="book" items="${loggedUser.getBooks()}">
  <tr>
  
 <td><c:out  value="${book.id}"></c:out></td>
 <td><a href="/books/${book.id}"><c:out  value="${book.name}"></c:out></a></td>
 <td></td><c:out  value="${book.authorName}"></c:out></td>
 <td><c:out value="${book.posterBy}"></c:out></td>
 
 <td><form action="/expenses/${book.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
</td>

  </tr>
  </c:forEach>
  
  </thead>
  <tbody></tbody>
</table>
</body>
</html>