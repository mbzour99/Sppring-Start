<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h1>Save Travels</h1>
<table class="table">
  <thead class="table-dark">
  <tr>
  <th>Expence</th>
   <th>Vendor</th>
    <th>Amount</th>
  </tr>
  <c:forEach var="la" items="${languages}">
  <tr>
 <td><a href="/languages/${la.id}"><c:out  value="${la.name}"></c:out></a></td>
 <td><c:out  value="${la.creator}"></c:out></td>
 <td><c:out  value="${la.version}"></c:out></td>
 
 <td><form action="/languages/${la.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
||
 <a href="/languages/edit/${la.id}">edit</a></td>
  </tr>
  </c:forEach>
  
  </thead>
  <tbody></tbody>
</table>

<h1>Add An Expense</h1>
<form:form action="/languages" method="post" modelAttribute="travel">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:textarea path="creator"/>
    </p>

    
    <p>
        <form:label path="Version">Version</form:label>
        <form:errors path="Version"/>     
        <form:input  path="Version"/>
    </p>    
       
    <input type="submit" value="Submit"/>
</form:form>    
</body>
</html>