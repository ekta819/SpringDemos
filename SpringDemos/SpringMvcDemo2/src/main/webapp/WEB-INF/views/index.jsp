<!DOCTYPE html>
<html>
	<head>
		<title>home page</title>
	</head>
	<body>
		<h1>This is Home Page</h1>
		<h3>Called by home controller</h3>
		<%@page import = "java.util.*"%>
		<% 
			
			String name=(String)request.getAttribute("name");
			List<String> l1= (List<String>) request.getAttribute("l");
		
		%>
		
		<h4>Name is : <%=name %></h4>
		
		<%
			for(String s : l1)
			{
				out.println(s);
			}
		%>
		
	</body>

</html>