<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="/css/temptemp.css">

        
    </head>
<body>
<h1><c:out value="${name}"/> <h1>
<ul class="list-group list-group-light">
  <li class="list-group-item px-3 border-0 active" aria-current="true">
    An active item
  </li>
  <li class="list-group-item px-3 border-0"><h2><c:out value="${itemName}"/></h2></li>
  <li class="list-group-item px-3 border-0"><h2><c:out value="${price}"/></h2></li>
  <li class="list-group-item px-3 border-0"><h2><c:out value="${description}"/></h2></li>
  <li class="list-group-item px-3 border-0"><h2><c:out value="${vendor}"/></h2></li>
</ul>

</body>
</html>
