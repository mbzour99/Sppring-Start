<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="/css/c.css">
</head>
<body>
    <form action="/process" method="post">
       <div class="form-outline mb-4">
        <label>Pick any number from 5-25</label>
        <input type="number" name="number" min="5" max="25">
        </div>
        <div class="form-outline mb-4">
        <label>Enter the name of any city</label>
        <input type="text" name="city" >
        </div>
        <div class="form-outline mb-4">
         <label>Enter the name of any real person</label>
         <input type="text" name="person" >
         </div>
         <div class="form-outline mb-4">
        <label>Enter a proffesional hobby</label>
        <input type="text" name="prof">
        </div>
        <div class="form-outline mb-4">
        <label>Enter any type of living thing</label>
        <input type="text" name="thing">
        </div>
        <div class="form-outline mb-4">
       <label>ESay something nice to someone</label>
       <input type="text" name="des" >
       </div>
       <label>send and show a freind</label>
        <button type="submit" class="btn btn-primary btn-block mb-4>Send"></button>
    </form>
</body>
</html>