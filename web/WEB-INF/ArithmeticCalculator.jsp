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
        <h1>Arithmetic Calculator</h1>
        <form action="Arithmetic" method="POST">

            <p> First  <input  type="number" id="first" name="first" value=""></p>
            <p> Second  <input  type="number" id="second" name="second" value=""></p>

            <p><button type="submit" name="calc" value="add">+</button>
                <button type="submit" name="calc" value="sub">-</button>
                <button type="submit" name="calc" value="mult">*</button>
                <button type="submit" name="calc" value="mod">%</button></p>
        </form>

        <p>Result: <%= request.getAttribute("message")%> </p>
        
        <a href="/Calculators/Age">Age Calculator</a>




    </body>
</html>
