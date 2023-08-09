<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>INDEX PAGE</h3>
<div>
	<form action="profile" method="POST">
		<div>
			<input type="text" name="username" placeholder="enter username"/>
		</div>
		<div>
			<input type="text" name="password" placeholder="enter username"/>
		</div>
		<div>
			MALE:<input type="radio" name="gen" value="MALE"/>
			FEMALE:<input type="radio" name="gen" value="FEMALE"/>
		</div>
		<div>
			<input type="submit" value="Register"/>
		</div>
	</form>
</div>

</body>
</html>