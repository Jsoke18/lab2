<%-- 
    Document   : AgeCalculator
    Created on : Sep 15, 2022, 7:33:23 AM
    Author     : mucky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator!</h1>
        <form action="AgeCalculatorServlet" method="POST">
        <input  type="number" id="age" name="age" value="">
        <button type="submit">Age next birthday</button>
        </form>
        <% if (request.getAttribute("age") != null) {%> 
        <p>Your next birthday will be <%= request.getAttribute("age")%> </p>
        <%}%>

        <% if (request.getAttribute("message") != null) {%> 
        <%= request.getAttribute("message")%> 
        <%}%>
        
        <a href="/Calculators/Arithmetic">Arithmetic</a>

        
    </body>
</html>
