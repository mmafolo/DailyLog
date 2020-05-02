<%@ include file="header.jsp" %>
	<title>Register</title>
		<div class= "container center">	
			<form action="logregister" method="post" class="form-group">
				<table>
					<tr>
						<td>${message}</td>
						<td></td>
					</tr>
					<tr>
						<td>Registration</td>
						<td></td>
					</tr>
					<tr><td> Name : </td><td><input type="text" name="name" required></td></tr>
					<tr><td> Surname : </td><td><input type="text" name="usersurname" required></td></tr>
					<tr><td> Username : </td><td><input type="text" name="username" required></td></tr>
					<tr><td> Password : </td><td><input type="password" name="userpass" required></td></tr>
					<tr><td> Confirm Password : </td><td><input type="password" name="userpass2" required></td></tr>
					<tr><td><button type="submit" name = "submit" value="register">Register</button></td></tr>
				</table>
			</form>
		</div>
	</body>
</html>