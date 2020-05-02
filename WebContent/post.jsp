<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="bs/css/bootstrap.css">
	<script type="text/javascript" src="./bs/js/bootstrap.js"></script>
	<script type="text/javascript" src="js/post.js"></script>
<title>Post</title>
</head>
<body>
	<div class = "container-fluid">
		<form method ="post" action = "postmessage">
			<div class = "form-group">
				<input type="text" name = "msgtopc" placeholder = "Topic"> 
			</div>
			<div class = "form-group">
				<label id = "chardisp">1000 characters</label>
			</div>
			<div class = "form-group">
				<textarea id="msgbody" class = "form-control" rows="5" cols="" name = "msgbody"></textarea>
			</div>
			<input class = "btn btn-default" name = "postMsg" type = "submit" value = "Post">
			<input class = "btn btn-default" name = "postCan" type = "submit" value = "Cancel">
		</form>
		
	</div>
</body>
</html>