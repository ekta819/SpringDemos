<%@page isELIgnored="false" %>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
	<head>
		<title>Help page</title>
	</head>
	<body>
		<h1>This is my HELP Page</h1>
		<h3>Called by /help url controller</h3>
		
		<%@page import = "java.util.*"
		%>
		
		<%-- <%
			String name= (String) request.getAttribute("name");
		 %>
		 
		 <h4>Name is : <%=name %></h4> --%>
		 <%--To get data from model using Exp Lang --%>
		 <h4>New name is : ${name}</h4>
		 <hr>
		 <%-- <c:forEach var="item" items="${m}">
		 	<h2>${item }</h2>
		 
		 </c:forEach> --%>
	</body>

</html>