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
	String fname = request.getParameter("firstname");
	String lname = request.getParameter("lastname");
	String email = request.getParameter("email");
	String gender = request.getParameter("gender");
	String country = request.getParameter("country");
	%>
	<h3>Displaying the details</h3>
	<table cellspacing="10" cellpadding="5" border="2">
		<tr>
			<td>First Name: <%=fname %></td>
		</tr>
		<tr>
			<td>Last Name: <%=lname %></td>
		</tr>
		<tr>
			<td>Email: <%=email %></td>
		</tr>
		<tr>
			<td>Gender: <%=gender %></td>
		</tr>
		<tr>
			<td>Country: <%=country %></td>
		</tr>
		
	</table>
</body>
</html>