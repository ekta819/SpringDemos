<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page  isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form's data are </title>
</head>
<body>

<%-- <h1>welcome user : ${name}</h1><h3>Your email is : ${email} </h3><h3>Password is : ${password}</h3> --%>
<h3 class="text-center">${head }</h3>
 <p>${desc }</p>
 <hr>
<h1>welcome user : ${user.getUserName()}</h1>
<h3>Your email is : ${user.getUserEmail()} </h3>
<h3>Password is : ${user.getUserPassword()}</h3>


</body>
</html>