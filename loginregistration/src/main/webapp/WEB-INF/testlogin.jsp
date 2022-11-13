<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/logreg.css/">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Login and Registration</title>
</head>
<body>
	 <main class="my-form">
        <div class="cotainer">
            <div class="row justify-content-center">
                <div class="col-md-8">
                        <div class="card">
                            <div class="card-header">Register</div>
                            <div class="card-body">
                               <form:form action="/register/" method="post" modelAttribute="newUser">
                                    <div class="form-group row">
                                        <form:errors path="username"></form:errors>
                                        <form:label path="username">User Name:</form:label>
                                        <div class="col-md-6">
                                           <form:input path="username"></form:input>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <form:errors path="email"></form:errors>
                                        <form:label path="email">email:</form:label>
                                        <div class="col-md-6">
                                           <form:input path="email"></form:input>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <form:errors path="password"></form:errors>
                                        <form:label path="password">password </form:label>
                                        <div class="col-md-6">
                                           <form:input path="password"></form:input>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <form:errors path="confirm"></form:errors>
                                        <form:label path="confirm">confirm:</form:label>
                                        <div class="col-md-6">
                                           <form:input path="confirm"></form:input>
                                        </div>
                                    </div>
                                    
                                    
                                    </div>
                                        <div class="col-md-6 offset-md-4">
                                            <button type="submit" class="btn btn-primary">
                                            Register
                                            </button>
                                        </div>
                                    </div>
                              </form:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        
        </main> 
</body>
</html>