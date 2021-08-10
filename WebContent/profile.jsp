<title>Daily Log | Profile</title>
<jsp:include page="header.jsp"></jsp:include>
	<div class="container centered center">
		<h2>Hello ${user.getName()}</h2>
		<form action="" method="post" class="">
			<%--<div class = "form-group">
				<div>
					<label>About:</label>
				</div>
				<textarea cols="40 rows = "2"  class = "form-control" >
					${user.getUserBio() }
				</textarea>
			</div>--%>
			<div class= "form-group">
				<label>Name</label>
				<input name="nameuser" class = "form-control" value = "${user.getName()}" type = "text" >			
			</div>
			<div class= "form-group">
				<label>Surname</label>
				<input type = "text"   class = "form-control" name="usersurname" value = "${user.getUserSurname()}">
			</div>
			<%--<div class= "form-group">
				<label>Email</label>
				<input name="useremail" class = "form-control"  value= "${user.getEmail() }" type = "text" disabled>			
			</div>
			<div class = "form-group">
				<label>Phone</label>
				<input type  = "text"  class = "form-control" value = "${user.getUserEmail() }" name = "userPhone">
			</div>
			<div class= "form-group">
				<label>Date of Birth</label>
				<input type = "text"  class = "form-control" name="userdob" value = "${user.getDOB()}">			
			</div>--%>
			<input type = "submit" value = "Update" name = "update">		
		</form>
	</div>
	
	
	
</body>
</html>