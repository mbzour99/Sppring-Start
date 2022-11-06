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
  <c:forEach var="tr" items="${travels}">
  <tr>
 <td><a href="/expenses/${tr.id}"><c:out  value="${tr.expense}"></c:out></a></td>
 <td><c:out  value="${tr.vendor}"></c:out></td>
 <td><c:out  value="${tr.amount}"></c:out></td>
 <td > <a href="/expenses/edit/${tr.id}">Action</a></td>
 <td><form action="/expenses/${tr.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
</td>
 
  </tr>
  </c:forEach>
  
  </thead>
  <tbody></tbody>
</table>

<h1>Add An Expense</h1>
<form:form action="/new" method="post" modelAttribute="travel">
    <p>
        <form:label path="expense">Expense</form:label>
        <form:errors path="expense"/>
        <form:input path="expense"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors path="vendor"/>
        <form:textarea path="vendor"/>
    </p>

    
    <p>
        <form:label path="amount">Amount</form:label>
        <form:errors path="amount"/>     
        <form:input  path="amount"/>
    </p>    
        <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:input path="description"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>    
</body>
</html>