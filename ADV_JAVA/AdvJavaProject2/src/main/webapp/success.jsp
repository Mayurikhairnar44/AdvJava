<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		String username1=(String)request.getAttribute("name1");	
		String password1=(String)request.getAttribute("passvalue");
	%>
	<h3> <%=username1 %> You've successfully logged in!!! and the password is <%=password1 %></h3>
</body>
</html>