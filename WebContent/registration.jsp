<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>User Registration</title>
	</head>
	<body>
		<form action="" method="post">
			<table>
				<tr>
					<td>Registration</td>
					<td></td>
				</tr>
				<tr><td> Name : </td><td><input type="text" name="name"></td></tr>
				<tr><td> Surname : </td><td><input type="text" name="userSurname"></td></tr>
				<tr><td> Username : </td><td><input type="text" name="userName"></td></tr>
				<tr><td> Password : </td><td><input type="password" name="userpass"></td></tr>
				<tr><td> Confirm Password : </td><td><input type="password" name="userpass2"></td></tr>
				<tr><td><input type="submit" value="Register"></td></tr>
			</table>
		</form>
	</body>
</html>