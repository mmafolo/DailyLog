<title>Daily Log | Profile</title>
<jsp:include page="header.jsp"></jsp:include>
	<div class="container centered">
		<h2>Hello World ${user.getName()}</h2>
		<form action="" method="post" class="">
			<div class= "form-group">
				<label>Name</label>
				<input type="text" class="form-control" name="nameuser">			
			</div>
			<div class= "form-group">
				<label>Surname</label>
				<input type="text" class="form-control" name="usersurname">			
			</div>
			<div class= "form-group">
				<label>Date of Birth</label>
				<input type="text" class="form-control" name="nameuser">			
			</div>
			<input class = "btn btn-default" name = "update" type = "submit" value = "Update">
		</form>
	</div>
	
	
	
</body>
</html>