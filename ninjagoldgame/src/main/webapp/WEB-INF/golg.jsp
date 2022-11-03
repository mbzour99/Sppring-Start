<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.Date"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="/css/gold.css">
        <script type="text/javascript" src="java/j.js"></script>
</head>
<body>
        <div class="gold_count_container">
            <p>Your Gold:</p>
        </div>

        <div class="goldcount"><p><c:out value="${gold}"/></p>
                        <a href="/reset" class="startover"><button type="button" class="btn btn-outline-danger">Start Over</button></a>
        </div>

        <div class="box_selection_container">
            <form action="getGold" method="post">
                
                <div class="selection_box">
                    <h4>Farm</h4>
                    <p>(earns 10-20 gold)</p>
                    <button type="submit" class="btn btn-outline-dark" name="button" value="farm">Get Gold</button>
                </div>
                <div class="selection_box">
                        <h4>Cave</h4>
                        <p>(earns 10-20 gold)</p>
                        <button type="submit" class="btn btn-outline-dark" name="button" value="cave">Get Gold</button>

                </div>
                <div class="selection_box">
                        <h4>House</h4>
                        <p>(earns 10-20 gold)</p>
                        <button type="submit" class="btn btn-outline-dark" name="button" value="house">Get Gold</button>

                </div>
                <div class="selection_box">
                        <h4>Quest</h4>
                        <p>(earns/takes 0-50 gold)</p>
                        
                        <button type="submit" class="btn btn-outline-dark" name="button" value="quest">Get Gold</button>

                </div>
            </form>
                
        </div>
        <div class="activity_log">
                <p>Activites</p>
                <div id="text_area">
                  <c:forEach items="${eventLog}" var="event">
                  	<c:out value="${event}" escapeXml="false"></c:out>
                  </c:forEach>
                       
                </div>
                <br>
                <br>



            </div> 

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>