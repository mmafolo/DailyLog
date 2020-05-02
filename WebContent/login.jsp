<%@ include file="header.jsp" %>
<title>Log in</title>
		<div class= "container center">
			<form action="logregister" method="post">
				<table>
					<tr>
						<td>${message}</td>
						<td></td>
					</tr>
					<tr>
						<td>Log in</td>
						<td></td>
					</tr>
					<tr><td> Username :  </td><td><input type="text" name="username" required></td></tr>
					<tr><td> Password : </td><td><input type="password" name="userpass" required></td></tr>
					<tr><td><input type="submit" name ="submit" value="login"></td></tr>
				</table>
			</form>
		</div>
	</body>
</html>