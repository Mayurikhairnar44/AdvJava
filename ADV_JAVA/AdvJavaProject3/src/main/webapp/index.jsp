<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="source.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="border: 2px dashed black">This is h1 heading</h1>
	<h2>This is h2 heading</h2>
	<hr>
	<div>This is div tag</div>
	<form name="form1" method="get" action="jsppages/result.jsp">
		<table bgcolor="pink" cellspacing="10" cellpadding="5">
			<tr>
				<td>Enter First Name</td><td><input type="text" name="firstname" /></td>
			</tr>
			<tr>
				<td>Enter Last Name</td><td><input type="text" name="lastname" /></td>
			</tr>
			<tr>
				<td>Enter Email</td><td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td>Enter Gender</td>
				<td><input type="radio" name="gender" value="male" />Male <input
					type="radio" name="gender" value="male" />Female</td>
			</tr>

			<tr>
				<td>Select Country</td>
				<td>
					<select name="country">
							<option>Choose Country</option>
							<option value="India">India</option>
							<option value="USA">USA</option>
							<option value="UK">UK</option>
							<option value="France">France</option>
							<option value="Italy">Italy</option>
					</select>
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