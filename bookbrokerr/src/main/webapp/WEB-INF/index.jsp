<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Read Share</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

<link rel="stylesheet" href="/css/main.css"/>
</head>
<body>

<h1>Book Club</h1>
<p>A place for friends to share thoughts on books.</p>

<div class="container px-4">
  <div class="row gx-5">
    <div class="col">
      <div class="p-3">
      <form:form action="/register" method="post" modelAttribute="newUser">

	<table>
		<thead>
	    	<tr>
	            <td colspan="2">Register</td>
	        </tr>
	    </thead>
	    <thead>
	    	<tr>
	            <td class="float-left">User Name:</td>
	            <td class="float-left">
	            	<form:errors path="userName" class="text-danger"/>
					<form:input class="input" path="userName"/>
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Email:</td>
	            <td class="float-left">
	            	<form:errors path="email" class="text-danger"/>
					<form:input class="input" path="email"/>
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Password:</td>
	            <td class="float-left">
	            	<form:errors path="password" class="text-danger"/>
					<form:input class="input" path="password"/>
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Confirm PW:</td>
	            <td class="float-left">
	            	<form:errors path="confirm" class="text-danger"/>
					<form:input class="input" path="confirm"/>
	            </td>
	        </tr>
	        <tr>
	        	<td colspan=2><input   class="btn btn-primary " class="button" type="submit" value="Submit"/></td>
	        </tr>
	    </thead>
	</table>
</form:form>
      </div>
    </div>
    <div class="col">
      <div class="p-3">
      <form:form action="/login" method="post" modelAttribute="newLogin">

	<table>
		<thead>
	    	<tr>
	           <h1> <td colspan="2">Log In</td></h1>
	        </tr>
	    </thead>
	    <thead>
	        <tr>
	            <td class="float-left">Email:</td>
	            <td class="float-left">
	            	<form:errors path="email" class="text-danger"/>
					<form:input class="input" path="email"/>
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Password:</td>
	            <td class="float-left">
	            	<form:errors path="password" class="text-danger"/>
					<form:input class="input" path="password"/>
	            </td>
	        </tr>
	        <tr>
	        <div class="position-absolute top-100 start-100 translate-middle"></div>
	        	<td colspan=2><input  class="btn btn-primary" class="input"  type="submit" value="Submit"/></td>
	        </tr>
	    </thead>
	</table>
</form:form>
      </div>
    </div>
  </div>
</div>



<hr>

</body>
</html>