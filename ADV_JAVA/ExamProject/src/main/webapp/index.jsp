<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form  name="form1" method="get" action="jsppages/result.jsp">
		<table bgcolor="pink" cellspacing="10" cellpadding="5">
			<tr>
				<td>1. What is a data structure?</td>
				<td>
					<input type="radio" name="que1" value="a" />a) A programming language
					<input type="radio" name="que1" value="b" />b) A collection of algorithms
					<input type="radio" name="que1" value="c" />c) A way to store and organize data
					<input type="radio" name="que1" value="d" />d) A type of computer hardware 
				</td>
			</tr>
			
			<tr>
				<td>2. Which data structure is used for implementing recursion?</td>
				<td>
					<input type="radio" name="que2" value="a" />a) Stack
					<input type="radio" name="que2" value="b" />b) Queue
					<input type="radio" name="que2" value="c" />c) List
					<input type="radio" name="que2" value="d" />d) Array
				</td>
			</tr>
			
			<tr>
				<td>3. The data structure required to check whether an expression contains a balanced parenthesis is?</td>
				<td>
					<input type="radio" name="que3" value="a" />a) Queue
					<input type="radio" name="que3" value="b" />b) Stack
					<input type="radio" name="que3" value="c" />c) Tree
					<input type="radio" name="que3" value="d" />d) Array
				</td>
			</tr>
			
			<tr>
				<td>
					<input type="submit" name="submit" />
					<input type="reset" name="reset" />
				</td>
			</tr>
			
		</table>
	</form>
</body>
</html>