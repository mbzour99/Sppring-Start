<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="assets/css/.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<title>Product Page</title>
</head>
<body>
<h1>Home Page</h1>
<a href="/products/new">New Product</a>
<a href="/categories/new">New Category</a>


<table>
<tr>
<th>All Products</th>
<th>All Categores</th>
</tr>
<tr>
<td>
<ul>
<c:forEach items="${products}" var="prod">
<li><a href="/products/${prod.id}"><c:out value="${prod.getName()}"></c:out></a></li>
</c:forEach>

</ul>
</td>
<td>
<ul>
<c:forEach items="${categories}" var="cat">
<li><a href="/categories/${cat.id}"><c:out value="${cat.getName()}"></c:out></a></li>
</c:forEach>

</ul>
</td>
</tr>
</table>
</body>
</html>