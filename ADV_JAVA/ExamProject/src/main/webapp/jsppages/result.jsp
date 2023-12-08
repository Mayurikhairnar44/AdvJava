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
	String queno1 = request.getParameter("que1");
	String queno2 = request.getParameter("que2");
	String queno3 = request.getParameter("que3");
	%>
	<h3>Displaying the answers</h3>
	<table cellspacing="10" cellpadding="5" border="2">
		<tr>
			<td>1. <%=queno1%></td>
		</tr>
		<tr>
			<td>2. <%=queno2%></td>
		</tr>
		<tr>
			<td>3. <%=queno3%></td>
		</tr>
		<tr>
			<td>
				<% String score=(String)request.getAttribute("scored"); %>
				<h3>You've scored<%=score %></h3>
			</td>
		</tr>
	</table>
	
	<h3>Correct answers</h3>
	<table cellspacing="10" cellpadding="5" border="2">
		<tr>
			<td>1. c</td>
		</tr>
		<tr>
			<td>2. a</td>
		</tr>
		<tr>
			<td>3. b</td>
		</tr>
	</table>
</body>
</html>