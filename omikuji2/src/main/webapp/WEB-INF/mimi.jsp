<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" "%>
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
    <form action="/omikuji/concat" method="post">
        <label>Pick any number from 5-25</label>
        <input type="number" name="number" min="5" max="25">
        <label>Enter the name of any city</label>
        <input type="text" name="city" >
         <label>Enter the name of any real person</label>
         <input type="text" name="person" >
         
        <label>Enter a proffesional hobby</label>
        <input type="text" name="prof">
        <label>Enter any type of living thing</label>
        <input type="text" name="thing">
       <label>ESay something nice to someone</label>
       <input type="text" name="des" rows="5" cols="4">
       <label>send and show a freind</label>
        <button type="submit">Send</button>
    </form>
</body>
</html>