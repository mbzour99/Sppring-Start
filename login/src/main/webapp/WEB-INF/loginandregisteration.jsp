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
<h1>Welcome</h1>
<h3>Join Our growing community</h3>
<div cssClass="Box1">
<h1>Register</h1>
<form:form action="/register" method="post" modelAttribute="Newuser">

<form:label path="userName">UserName</form:label>
<form:errors path="userName" style="color:red"></form:errors>
<form:input path="userName"/>

<form:label path="email">Email</form:label>
<form:errors path="email"style="color:red "></form:errors>
<form:input path="email"/>

<form:label path="password">Password</form:label>
<form:errors path="password"style="color:red "></form:errors>
<form:input path="password"/>

<form:label path="confirm">Confirm PW</form:label>
<form:errors path="confirm"style="color:red "></form:errors>
<form:input path="confirm"/>

<button type="submit">submit</button>

</form:form>

</div>

<div cssClass="box2">
<h1>Log in</h1>
<form:form action="/login" method="post" modelAttribute="NewLogin" >

<form:label path="email">Email</form:label>
<form:errors path="email" style="color:red "></form:errors>
<form:input path="email"/>

<form:label path="password">Password</form:label>
<form:errors path="password"style="color:red "></form:errors>
<form:input path="password" />

<button type="submit">submit</button>

</form:form>
</div>
</body>
</html>