<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<! -- example of HTML Comment -->
	<%-- example of JSP Comment --%>
	
	<%! int i = 3; %>
	<%! int a, b; double c; %>
	Declaration example, i = <%= i %> <br/>
	<br>
	Expression example, square root of 4 is <%= Math.sqrt(4) %> <br>
	<br>
	<%
		String name =null;
	if (request.getParameter("name") == null)
		name = "Aiman";
	%>
	Statement example, The name is <%= name %><br>
	<br>
	Current time is <%= new java.util.Date() %>
	<br>
	
</body>
</html>